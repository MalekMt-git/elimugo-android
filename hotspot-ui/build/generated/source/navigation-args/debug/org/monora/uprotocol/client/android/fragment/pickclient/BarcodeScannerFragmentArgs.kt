package org.monora.uprotocol.client.android.fragment.pickclient

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.UnsupportedOperationException
import java.net.InetAddress
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class BarcodeScannerFragmentArgs(
  public val inetAddress: InetAddress? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(InetAddress::class.java)) {
      result.putParcelable("inetAddress", this.inetAddress as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(InetAddress::class.java)) {
      result.putSerializable("inetAddress", this.inetAddress as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): BarcodeScannerFragmentArgs {
      bundle.setClassLoader(BarcodeScannerFragmentArgs::class.java.classLoader)
      val __inetAddress : InetAddress?
      if (bundle.containsKey("inetAddress")) {
        if (Parcelable::class.java.isAssignableFrom(InetAddress::class.java) ||
            Serializable::class.java.isAssignableFrom(InetAddress::class.java)) {
          __inetAddress = bundle.get("inetAddress") as InetAddress?
        } else {
          throw UnsupportedOperationException(InetAddress::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __inetAddress = null
      }
      return BarcodeScannerFragmentArgs(__inetAddress)
    }
  }
}
