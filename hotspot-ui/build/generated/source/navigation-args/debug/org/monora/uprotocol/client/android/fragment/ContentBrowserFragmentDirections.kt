package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.database.model.Transfer

public class ContentBrowserFragmentDirections private constructor() {
  private data class ActionContentBrowserFragmentToNavTransferDetails(
    public val transfer: Transfer
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_contentBrowserFragment_to_nav_transfer_details

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
    public fun actionContentBrowserFragmentToPrepareIndexFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_contentBrowserFragment_to_prepareIndexFragment)

    public fun actionContentBrowserFragmentToWebShareLauncherFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_contentBrowserFragment_to_webShareLauncherFragment)

    public fun actionContentBrowserFragmentToSelectionsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_contentBrowserFragment_to_selectionsFragment)

    public fun actionContentBrowserFragmentToNavTransferDetails(transfer: Transfer): NavDirections =
        ActionContentBrowserFragmentToNavTransferDetails(transfer)
  }
}
