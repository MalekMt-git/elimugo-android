package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.monora.uprotocol.client.android.database.model.UClient

public data class ClientDetailsFragmentArgs(
  public val client: UClient
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(UClient::class.java)) {
      result.putParcelable("client", this.client as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(UClient::class.java)) {
      result.putSerializable("client", this.client as Serializable)
    } else {
      throw UnsupportedOperationException(UClient::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ClientDetailsFragmentArgs {
      bundle.setClassLoader(ClientDetailsFragmentArgs::class.java.classLoader)
      val __client : UClient?
      if (bundle.containsKey("client")) {
        if (Parcelable::class.java.isAssignableFrom(UClient::class.java) ||
            Serializable::class.java.isAssignableFrom(UClient::class.java)) {
          __client = bundle.get("client") as UClient?
        } else {
          throw UnsupportedOperationException(UClient::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__client == null) {
          throw IllegalArgumentException("Argument \"client\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"client\" is missing and does not have an android:defaultValue")
      }
      return ClientDetailsFragmentArgs(__client)
    }
  }
}
