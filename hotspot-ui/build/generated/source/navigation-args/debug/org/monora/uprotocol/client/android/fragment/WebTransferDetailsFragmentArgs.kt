package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.monora.uprotocol.client.android.database.model.WebTransfer

public data class WebTransferDetailsFragmentArgs(
  public val transfer: WebTransfer
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(WebTransfer::class.java)) {
      result.putParcelable("transfer", this.transfer as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(WebTransfer::class.java)) {
      result.putSerializable("transfer", this.transfer as Serializable)
    } else {
      throw UnsupportedOperationException(WebTransfer::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): WebTransferDetailsFragmentArgs {
      bundle.setClassLoader(WebTransferDetailsFragmentArgs::class.java.classLoader)
      val __transfer : WebTransfer?
      if (bundle.containsKey("transfer")) {
        if (Parcelable::class.java.isAssignableFrom(WebTransfer::class.java) ||
            Serializable::class.java.isAssignableFrom(WebTransfer::class.java)) {
          __transfer = bundle.get("transfer") as WebTransfer?
        } else {
          throw UnsupportedOperationException(WebTransfer::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__transfer == null) {
          throw IllegalArgumentException("Argument \"transfer\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"transfer\" is missing and does not have an android:defaultValue")
      }
      return WebTransferDetailsFragmentArgs(__transfer)
    }
  }
}
