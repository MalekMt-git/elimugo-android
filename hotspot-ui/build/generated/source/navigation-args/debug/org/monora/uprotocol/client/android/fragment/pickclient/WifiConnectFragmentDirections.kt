package org.monora.uprotocol.client.android.fragment.pickclient

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.net.InetAddress
import kotlin.Int
import kotlin.Suppress
import org.monora.uprotocol.client.android.NavPickClientDirections
import org.monora.uprotocol.client.android.R

public class WifiConnectFragmentDirections private constructor() {
  private data class ActionWifiConnectFragmentToBarcodeScannerFragment(
    public val inetAddress: InetAddress? = null
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_wifiConnectFragment_to_barcodeScannerFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(InetAddress::class.java)) {
        result.putParcelable("inetAddress", this.inetAddress as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(InetAddress::class.java)) {
        result.putSerializable("inetAddress", this.inetAddress as Serializable?)
      }
      return result
    }
  }

  public companion object {
    public fun actionWifiConnectFragmentToBarcodeScannerFragment(inetAddress: InetAddress? = null):
        NavDirections = ActionWifiConnectFragmentToBarcodeScannerFragment(inetAddress)

    public fun xmlPop(): NavDirections = NavPickClientDirections.xmlPop()
  }
}
