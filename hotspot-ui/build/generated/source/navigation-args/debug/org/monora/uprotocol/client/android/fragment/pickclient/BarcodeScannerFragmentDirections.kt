package org.monora.uprotocol.client.android.fragment.pickclient

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import org.monora.uprotocol.client.android.NavPickClientDirections
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.model.NetworkDescription

public class BarcodeScannerFragmentDirections private constructor() {
  private data class ActionBarcodeScannerFragmentToWifiConnectFragment(
    public val networkDescription: NetworkDescription,
    public val pin: Int = 0
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_barcodeScannerFragment_to_wifiConnectFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(NetworkDescription::class.java)) {
        result.putParcelable("networkDescription", this.networkDescription as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(NetworkDescription::class.java)) {
        result.putSerializable("networkDescription", this.networkDescription as Serializable)
      } else {
        throw UnsupportedOperationException(NetworkDescription::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      result.putInt("pin", this.pin)
      return result
    }
  }

  public companion object {
    public
        fun actionBarcodeScannerFragmentToWifiConnectFragment(networkDescription: NetworkDescription,
        pin: Int = 0): NavDirections =
        ActionBarcodeScannerFragmentToWifiConnectFragment(networkDescription, pin)

    public fun xmlPop(): NavDirections = NavPickClientDirections.xmlPop()
  }
}
