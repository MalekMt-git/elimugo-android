package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import kotlin.Array
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.database.model.SharedText
import org.monora.uprotocol.client.android.database.model.UTransferItem

public class PrepareSharingFragmentDirections private constructor() {
  private data class ActionPrepareSharingFragmentToSharingFragment(
    public val contents: Array<UTransferItem>,
    public val groupId: Long
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_prepareSharingFragment_to_sharingFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putParcelableArray("contents", this.contents)
      result.putLong("groupId", this.groupId)
      return result
    }
  }

  private data class ActionPrepareSharingFragmentToNavTextEditor(
    public val sharedText: SharedText? = null,
    public val text: String? = null
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_prepareSharingFragment_to_nav_text_editor

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(SharedText::class.java)) {
        result.putParcelable("sharedText", this.sharedText as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(SharedText::class.java)) {
        result.putSerializable("sharedText", this.sharedText as Serializable?)
      }
      result.putString("text", this.text)
      return result
    }
  }

  public companion object {
    public fun actionPrepareSharingFragmentToSharingFragment(contents: Array<UTransferItem>,
        groupId: Long): NavDirections = ActionPrepareSharingFragmentToSharingFragment(contents,
        groupId)

    public fun actionPrepareSharingFragmentToNavTextEditor(sharedText: SharedText? = null,
        text: String? = null): NavDirections =
        ActionPrepareSharingFragmentToNavTextEditor(sharedText, text)
  }
}
