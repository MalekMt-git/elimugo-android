package org.monora.uprotocol.client.android.fragment.pickclient

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.monora.uprotocol.client.android.model.ClientRoute

public data class AcceptClientFragmentArgs(
  public val clientRoute: ClientRoute
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ClientRoute::class.java)) {
      result.putParcelable("clientRoute", this.clientRoute as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ClientRoute::class.java)) {
      result.putSerializable("clientRoute", this.clientRoute as Serializable)
    } else {
      throw UnsupportedOperationException(ClientRoute::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AcceptClientFragmentArgs {
      bundle.setClassLoader(AcceptClientFragmentArgs::class.java.classLoader)
      val __clientRoute : ClientRoute?
      if (bundle.containsKey("clientRoute")) {
        if (Parcelable::class.java.isAssignableFrom(ClientRoute::class.java) ||
            Serializable::class.java.isAssignableFrom(ClientRoute::class.java)) {
          __clientRoute = bundle.get("clientRoute") as ClientRoute?
        } else {
          throw UnsupportedOperationException(ClientRoute::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__clientRoute == null) {
          throw IllegalArgumentException("Argument \"clientRoute\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"clientRoute\" is missing and does not have an android:defaultValue")
      }
      return AcceptClientFragmentArgs(__clientRoute)
    }
  }
}
