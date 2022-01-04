/*
 * Copyright (C) 2019 Veli Tasalı
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.monora.uprotocol.client.android.util

import android.Manifest.permission.ACCESS_COARSE_LOCATION
import android.Manifest.permission.ACCESS_FINE_LOCATION
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.location.LocationManager
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.net.Uri
import android.net.wifi.WifiConfiguration
import android.net.wifi.WifiInfo
import android.net.wifi.WifiManager
import android.net.wifi.p2p.WifiP2pManager
import android.os.Build
import android.provider.Settings
import android.util.Log
import androidx.activity.result.ActivityResultLauncher
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.core.location.LocationManagerCompat
import com.genonbeta.android.framework.ui.callback.SnackbarPlacementProvider
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.backend.Backend
import org.monora.uprotocol.client.android.model.NetworkDescription

/**
 * created by: veli
 * date: 15/04/18 18:37
 */
class Connections(contextLocal: Context) {
    val context: Context = contextLocal.applicationContext

    private val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

    private val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager

    val p2pManager
        get() = context.getSystemService(Context.WIFI_P2P_SERVICE) as WifiP2pManager

    val wifiManager = context.getSystemService(Context.WIFI_SERVICE) as WifiManager

    fun canAccessLocation(): Boolean {
        return Build.VERSION.SDK_INT < 23 || (hasLocationPermission() && isLocationServiceEnabled())
    }

    private fun canReadScanResults(): Boolean {
        return wifiManager.isWifiEnabled && (Build.VERSION.SDK_INT < 23 || canAccessLocation())
    }

    fun canReadWifiInfo(): Boolean {
        return Build.VERSION.SDK_INT < 26 || hasLocationPermission() && isLocationServiceEnabled()
    }

    fun hasLocationPermission(): Boolean {
        return ContextCompat.checkSelfPermission(context, ACCESS_COARSE_LOCATION) == PERMISSION_GRANTED
    }

    fun isConnectedToAnyNetwork(): Boolean {
        val info: NetworkInfo? = this.connectivityManager.activeNetworkInfo
        return info != null && info.type == ConnectivityManager.TYPE_WIFI && info.isConnected
    }

    fun isConnectedToNetwork(description: NetworkDescription): Boolean {
        return isConnectedToNetwork(description.ssid, description.bssid)
    }

    private fun isConnectedToNetwork(ssid: String, bssid: String?): Boolean {
        if (!isConnectedToAnyNetwork()) return false

        val wifiInfo: WifiInfo = wifiManager.connectionInfo
        val tgSsid = getCleanSsid(wifiInfo.ssid)
        Log.d(TAG, "isConnectedToNetwork: " + ssid + "=" + tgSsid + "," + bssid + "=" + wifiInfo.bssid)
        return ssid.equals(tgSsid, ignoreCase = true) || bssid?.equals(wifiInfo.bssid, ignoreCase = true) ?: (ssid == tgSsid)
    }

    fun isLocationServiceEnabled(): Boolean = LocationManagerCompat.isLocationEnabled(locationManager)

    @Deprecated("Do not use this method above 9, there is a better method in-place.")
    fun isMobileDataActive(): Boolean {
        return connectivityManager.activeNetworkInfo?.type == ConnectivityManager.TYPE_MOBILE
    }

    fun toggleHotspot(
        backend: Backend,
        provider: SnackbarPlacementProvider,
        manager: HotspotManager,
        suggestActions: Boolean,
        permissionsResultLauncher: ActivityResultLauncher<Array<String>>,
    ) {
        if (!HotspotManager.supported || Build.VERSION.SDK_INT >= 26
            && !validateLocationAccess(provider, permissionsResultLauncher)
        ) return

        // Android introduced permissions in 23 and this permission is not needed for local only hotspot introduced
        // in 26
        @RequiresApi(Build.VERSION_CODES.M)
        if (Build.VERSION.SDK_INT in 23..25 && !Settings.System.canWrite(context)) {
            provider.createSnackbar(R.string.write_system_settings_permission_required_notice)?.apply {
                setAction(R.string.settings) {
                    context.startActivity(
                        Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS)
                            .setData(Uri.parse("package:" + context.packageName))
                            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    )
                }
                show()
            }
        } else if (Build.VERSION.SDK_INT < 26 && !manager.enabled && isMobileDataActive() && suggestActions) {
            provider.createSnackbar(R.string.set_up_hotspot_mobile_data_notice)?.apply {
                setAction(R.string.skip) {
                    toggleHotspot(backend, provider, manager, false, permissionsResultLauncher)
                }
                show()
            }
        } else {
            val config: WifiConfiguration? = manager.configuration
            val state = if (manager.enabled) R.string.starting_hotspot_notice else R.string.stopping_hotspot_notice

            if (!manager.enabled || config != null) {
                provider.createSnackbar(state)?.show()
            }

            backend.toggleHotspot()
        }
    }

    fun toggleWiFiDirect(
        backend: Backend,
        provider: SnackbarPlacementProvider,
        p2pManager: WiFiDirectManager,
        permissionsResultLauncher: ActivityResultLauncher<Array<String>>,
    ) {
        if (!validateLocationAccess(provider, permissionsResultLauncher)
        ) return

        if (wifiManager.isWifiEnabled) {
            val state = if (p2pManager.isEnabled) R.string.starting_hotspot_notice else R.string.stopping_hotspot_notice
            if (!p2pManager.isEnabled) {
                provider.createSnackbar(state)?.show()
            }
            backend.toggleWiFiDirect()
        } else {
            provider.createSnackbar(R.string.mesg_wifiEnableRequired)?.apply {
                setAction(R.string.enable) {
                    turnOnWiFi(provider)
                }
                show()
            }
        }

    }

    fun turnOnWiFi(provider: SnackbarPlacementProvider) {
        val startSettings = {
            context.startActivity(
                Intent(Settings.ACTION_WIFI_SETTINGS).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            )
        }

        when {
            Build.VERSION.SDK_INT >= 29 -> startSettings()
            wifiManager.setWifiEnabled(true) -> provider.createSnackbar(R.string.turning_wifi_on_notice)?.show()
            else -> provider.createSnackbar(R.string.enable_wifi_failure)?.apply {
                setAction(R.string.settings) {
                    startSettings()
                }
                show()
            }
        }
    }

    private fun validateLocationAccess(
        provider: SnackbarPlacementProvider,
        permissionsResultLauncher: ActivityResultLauncher<Array<String>>,
    ): Boolean {
        if (Build.VERSION.SDK_INT < 23) return true

        if (!hasLocationPermission()) {
            provider.createSnackbar(R.string.location_permission_required_notice)?.apply {
                setAction(R.string.allow) {
                    permissionsResultLauncher.launch(arrayOf(ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION))
                }
                show()
            }
        } else if (!isLocationServiceEnabled()) {
            provider.createSnackbar(R.string.location_service_disabled_notice)?.apply {
                setAction(R.string.location_settings) {
                    Activities.startLocationServiceSettings(context)
                }
                show()
            }
        } else {
            return true
        }

        return false
    }

    fun validateLocationAccessNoPrompt(permissionsResultLauncher: ActivityResultLauncher<Array<String>>): Boolean {
        if (Build.VERSION.SDK_INT < 23) return true

        if (!hasLocationPermission()) {
            permissionsResultLauncher.launch(arrayOf(ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION))
        } else if (!isLocationServiceEnabled()) {
            context.startActivity(
                Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            )
        } else {
            return true
        }

        return false
    }

    companion object {
        private const val TAG = "Connections"

        fun getCleanSsid(ssid: String?): String {
            return ssid?.trim()?.replace("\"", "") ?: ""
        }
    }
}
