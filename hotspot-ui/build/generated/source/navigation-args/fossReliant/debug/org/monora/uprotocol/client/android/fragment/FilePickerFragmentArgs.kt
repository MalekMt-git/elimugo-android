package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class FilePickerFragmentArgs(
  public val selectionType: FilePickerFragment.SelectionType =
      FilePickerFragment.SelectionType.Folder
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(FilePickerFragment.SelectionType::class.java)) {
      result.putParcelable("selectionType", this.selectionType as Parcelable)
    } else if
        (Serializable::class.java.isAssignableFrom(FilePickerFragment.SelectionType::class.java)) {
      result.putSerializable("selectionType", this.selectionType as Serializable)
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): FilePickerFragmentArgs {
      bundle.setClassLoader(FilePickerFragmentArgs::class.java.classLoader)
      val __selectionType : FilePickerFragment.SelectionType?
      if (bundle.containsKey("selectionType")) {
        if (Parcelable::class.java.isAssignableFrom(FilePickerFragment.SelectionType::class.java) ||
            Serializable::class.java.isAssignableFrom(FilePickerFragment.SelectionType::class.java)) {
          __selectionType = bundle.get("selectionType") as FilePickerFragment.SelectionType?
        } else {
          throw UnsupportedOperationException(FilePickerFragment.SelectionType::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__selectionType == null) {
          throw IllegalArgumentException("Argument \"selectionType\" is marked as non-null but was passed a null value.")
        }
      } else {
        __selectionType = FilePickerFragment.SelectionType.Folder
      }
      return FilePickerFragmentArgs(__selectionType)
    }
  }
}
