package org.monora.uprotocol.client.android.fragment.pickclient

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.monora.uprotocol.client.android.database.model.UClient
import org.monora.uprotocol.client.android.database.model.UClientAddress

public data class ClientConnectionFragmentArgs(
  public val client: UClient,
  public val clientAddress: UClientAddress? = null
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
    if (Parcelable::class.java.isAssignableFrom(UClientAddress::class.java)) {
      result.putParcelable("clientAddress", this.clientAddress as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(UClientAddress::class.java)) {
      result.putSerializable("clientAddress", this.clientAddress as Serializable?)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ClientConnectionFragmentArgs {
      bundle.setClassLoader(ClientConnectionFragmentArgs::class.java.classLoader)
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
      val __clientAddress : UClientAddress?
      if (bundle.containsKey("clientAddress")) {
        if (Parcelable::class.java.isAssignableFrom(UClientAddress::class.java) ||
            Serializable::class.java.isAssignableFrom(UClientAddress::class.java)) {
          __clientAddress = bundle.get("clientAddress") as UClientAddress?
        } else {
          throw UnsupportedOperationException(UClientAddress::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __clientAddress = null
      }
      return ClientConnectionFragmentArgs(__client, __clientAddress)
    }
  }
}
