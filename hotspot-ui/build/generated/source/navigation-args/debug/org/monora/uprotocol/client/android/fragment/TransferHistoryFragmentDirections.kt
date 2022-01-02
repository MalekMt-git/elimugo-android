package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import org.monora.uprotocol.client.android.NavHomeDirections
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.database.model.SharedText
import org.monora.uprotocol.client.android.database.model.Transfer
import org.monora.uprotocol.client.android.database.model.WebTransfer

public class TransferHistoryFragmentDirections private constructor() {
  private data class ActionTransferHistoryFragmentToNavTransferDetails(
    public val transfer: Transfer
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_transferHistoryFragment_to_nav_transfer_details

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Transfer::class.java)) {
        result.putParcelable("transfer", this.transfer as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Transfer::class.java)) {
        result.putSerializable("transfer", this.transfer as Serializable)
      } else {
        throw UnsupportedOperationException(Transfer::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  private data class ActionTransferHistoryFragmentToNavTextEditor(
    public val sharedText: SharedText? = null,
    public val text: String? = null
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_transferHistoryFragment_to_nav_text_editor

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

  private data class ActionTransferHistoryFragmentToWebTransferDetailsFragment(
    public val transfer: WebTransfer
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_transferHistoryFragment_to_webTransferDetailsFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionTransferHistoryFragmentToNavTransferDetails(transfer: Transfer): NavDirections
        = ActionTransferHistoryFragmentToNavTransferDetails(transfer)

    public fun actionTransferHistoryFragmentToNavReceive(): NavDirections =
        ActionOnlyNavDirections(R.id.action_transferHistoryFragment_to_nav_receive)

    public fun actionTransferHistoryFragmentToNavTextEditor(sharedText: SharedText? = null,
        text: String? = null): NavDirections =
        ActionTransferHistoryFragmentToNavTextEditor(sharedText, text)

    public fun actionTransferHistoryFragmentToWebTransferDetailsFragment(transfer: WebTransfer):
        NavDirections = ActionTransferHistoryFragmentToWebTransferDetailsFragment(transfer)

    public fun actionGlobalProfileEditorFragment(): NavDirections =
        NavHomeDirections.actionGlobalProfileEditorFragment()

    public fun actionGlobalNavPreferences(): NavDirections =
        NavHomeDirections.actionGlobalNavPreferences()

    public fun actionGlobalNavManageDevices(): NavDirections =
        NavHomeDirections.actionGlobalNavManageDevices()

    public fun actionGlobalChangelogFragment(): NavDirections =
        NavHomeDirections.actionGlobalChangelogFragment()

    public fun actionGlobalNavAbout(): NavDirections = NavHomeDirections.actionGlobalNavAbout()

    public fun actionGlobalCrashLogFragment(): NavDirections =
        NavHomeDirections.actionGlobalCrashLogFragment()

    public fun actionGlobalAboutUprotocolFragment(): NavDirections =
        NavHomeDirections.actionGlobalAboutUprotocolFragment()

    public fun actionGlobalNavTextEditor(sharedText: SharedText? = null, text: String? = null):
        NavDirections = NavHomeDirections.actionGlobalNavTextEditor(sharedText, text)

    public fun actionGlobalWebTransferDetailsFragment(transfer: WebTransfer): NavDirections =
        NavHomeDirections.actionGlobalWebTransferDetailsFragment(transfer)

    public fun actionGlobalNavTransferDetails(transfer: Transfer): NavDirections =
        NavHomeDirections.actionGlobalNavTransferDetails(transfer)
  }
}
