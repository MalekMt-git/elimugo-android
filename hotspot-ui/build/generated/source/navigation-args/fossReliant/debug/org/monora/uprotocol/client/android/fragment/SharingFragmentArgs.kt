package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Array
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.monora.uprotocol.client.android.database.model.UTransferItem

public data class SharingFragmentArgs(
  public val contents: Array<UTransferItem>,
  public val groupId: Long
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putParcelableArray("contents", this.contents)
    result.putLong("groupId", this.groupId)
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun fromBundle(bundle: Bundle): SharingFragmentArgs {
      bundle.setClassLoader(SharingFragmentArgs::class.java.classLoader)
      val __contents : Array<UTransferItem>?
      if (bundle.containsKey("contents")) {
        __contents = bundle.getParcelableArray("contents")?.map { it as UTransferItem
            }?.toTypedArray()
        if (__contents == null) {
          throw IllegalArgumentException("Argument \"contents\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"contents\" is missing and does not have an android:defaultValue")
      }
      val __groupId : Long
      if (bundle.containsKey("groupId")) {
        __groupId = bundle.getLong("groupId")
      } else {
        throw IllegalArgumentException("Required argument \"groupId\" is missing and does not have an android:defaultValue")
      }
      return SharingFragmentArgs(__contents, __groupId)
    }
  }
}
