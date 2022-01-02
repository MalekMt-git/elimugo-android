package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.monora.uprotocol.core.protocol.Direction

public data class NetworkManagerFragmentArgs(
  public val direction: Direction
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Direction::class.java)) {
      result.putParcelable("direction", this.direction as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Direction::class.java)) {
      result.putSerializable("direction", this.direction as Serializable)
    } else {
      throw UnsupportedOperationException(Direction::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): NetworkManagerFragmentArgs {
      bundle.setClassLoader(NetworkManagerFragmentArgs::class.java.classLoader)
      val __direction : Direction?
      if (bundle.containsKey("direction")) {
        if (Parcelable::class.java.isAssignableFrom(Direction::class.java) ||
            Serializable::class.java.isAssignableFrom(Direction::class.java)) {
          __direction = bundle.get("direction") as Direction?
        } else {
          throw UnsupportedOperationException(Direction::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__direction == null) {
          throw IllegalArgumentException("Argument \"direction\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"direction\" is missing and does not have an android:defaultValue")
      }
      return NetworkManagerFragmentArgs(__direction)
    }
  }
}
