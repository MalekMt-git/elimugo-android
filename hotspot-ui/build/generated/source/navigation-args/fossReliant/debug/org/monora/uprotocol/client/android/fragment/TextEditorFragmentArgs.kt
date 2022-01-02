package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import org.monora.uprotocol.client.android.database.model.SharedText

public data class TextEditorFragmentArgs(
  public val sharedText: SharedText? = null,
  public val text: String? = null
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(SharedText::class.java)) {
      result.putParcelable("sharedText", this.sharedText as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(SharedText::class.java)) {
      result.putSerializable("sharedText", this.sharedText as Serializable?)
    }
    result.putString("text", this.text)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): TextEditorFragmentArgs {
      bundle.setClassLoader(TextEditorFragmentArgs::class.java.classLoader)
      val __sharedText : SharedText?
      if (bundle.containsKey("sharedText")) {
        if (Parcelable::class.java.isAssignableFrom(SharedText::class.java) ||
            Serializable::class.java.isAssignableFrom(SharedText::class.java)) {
          __sharedText = bundle.get("sharedText") as SharedText?
        } else {
          throw UnsupportedOperationException(SharedText::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        __sharedText = null
      }
      val __text : String?
      if (bundle.containsKey("text")) {
        __text = bundle.getString("text")
      } else {
        __text = null
      }
      return TextEditorFragmentArgs(__sharedText, __text)
    }
  }
}
