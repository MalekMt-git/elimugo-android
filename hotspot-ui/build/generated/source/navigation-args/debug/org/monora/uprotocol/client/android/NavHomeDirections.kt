package org.monora.uprotocol.client.android

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import org.monora.uprotocol.client.android.database.model.SharedText
import org.monora.uprotocol.client.android.database.model.Transfer
import org.monora.uprotocol.client.android.database.model.WebTransfer

public class NavHomeDirections private constructor() {
  private data class ActionGlobalNavTextEditor(
    public val sharedText: SharedText? = null,
    public val text: String? = null
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_global_nav_text_editor

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

  private data class ActionGlobalWebTransferDetailsFragment(
    public val transfer: WebTransfer
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_global_webTransferDetailsFragment

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

  private data class ActionGlobalNavTransferDetails(
    public val transfer: Transfer
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_global_nav_transfer_details

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

  public companion object {
    public fun actionGlobalProfileEditorFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_profileEditorFragment)

    public fun actionGlobalNavPreferences(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_nav_preferences)

    public fun actionGlobalNavManageDevices(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_nav_manage_devices)

    public fun actionGlobalChangelogFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_changelogFragment)

    public fun actionGlobalNavAbout(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_nav_about)

    public fun actionGlobalCrashLogFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_crashLogFragment)

    public fun actionGlobalAboutUprotocolFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_aboutUprotocolFragment)

    public fun actionGlobalNavTextEditor(sharedText: SharedText? = null, text: String? = null):
        NavDirections = ActionGlobalNavTextEditor(sharedText, text)

    public fun actionGlobalWebTransferDetailsFragment(transfer: WebTransfer): NavDirections =
        ActionGlobalWebTransferDetailsFragment(transfer)

    public fun actionGlobalNavTransferDetails(transfer: Transfer): NavDirections =
        ActionGlobalNavTransferDetails(transfer)
  }
}
