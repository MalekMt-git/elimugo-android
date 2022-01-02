package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.database.model.Transfer
import org.monora.uprotocol.client.android.database.model.UClient

public class TransferDetailsFragmentDirections private constructor() {
  private data class ActionTransferDetailsFragmentToTransferItemFragment(
    public val transfer: Transfer
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_transferDetailsFragment_to_TransferItemFragment

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

  private data class ActionTransferDetailsFragmentToClientDetailsFragment2(
    public val client: UClient
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_transferDetailsFragment_to_clientDetailsFragment2

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(UClient::class.java)) {
        result.putParcelable("client", this.client as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(UClient::class.java)) {
        result.putSerializable("client", this.client as Serializable)
      } else {
        throw UnsupportedOperationException(UClient::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionTransferDetailsFragmentToTransferItemFragment(transfer: Transfer):
        NavDirections = ActionTransferDetailsFragmentToTransferItemFragment(transfer)

    public fun actionTransferDetailsFragmentToClientDetailsFragment2(client: UClient): NavDirections
        = ActionTransferDetailsFragmentToClientDetailsFragment2(client)
  }
}
