package org.monora.uprotocol.client.android.fragment.pickclient

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.monora.uprotocol.client.android.model.NetworkDescription

public data class WifiConnectFragmentArgs(
  public val networkDescription: NetworkDescription,
  public val pin: Int = 0
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): WifiConnectFragmentArgs {
      bundle.setClassLoader(WifiConnectFragmentArgs::class.java.classLoader)
      val __networkDescription : NetworkDescription?
      if (bundle.containsKey("networkDescription")) {
        if (Parcelable::class.java.isAssignableFrom(NetworkDescription::class.java) ||
            Serializable::class.java.isAssignableFrom(NetworkDescription::class.java)) {
          __networkDescription = bundle.get("networkDescription") as NetworkDescription?
        } else {
          throw UnsupportedOperationException(NetworkDescription::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__networkDescription == null) {
          throw IllegalArgumentException("Argument \"networkDescription\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"networkDescription\" is missing and does not have an android:defaultValue")
      }
      val __pin : Int
      if (bundle.containsKey("pin")) {
        __pin = bundle.getInt("pin")
      } else {
        __pin = 0
      }
      return WifiConnectFragmentArgs(__networkDescription, __pin)
    }
  }
}
