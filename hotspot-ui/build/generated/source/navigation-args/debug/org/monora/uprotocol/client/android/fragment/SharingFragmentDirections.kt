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
import org.monora.uprotocol.core.protocol.Direction

public class SharingFragmentDirections private constructor() {
  private data class PickClient(
    public val direction: Direction = Direction.Outgoing
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.pick_client

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Direction::class.java)) {
        result.putParcelable("direction", this.direction as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Direction::class.java)) {
        result.putSerializable("direction", this.direction as Serializable)
      }
      return result
    }
  }

  private data class ActionSharingFragmentToNavTransferDetails(
    public val transfer: Transfer
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_sharingFragment_to_nav_transfer_details

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
    public fun pickClient(direction: Direction = Direction.Outgoing): NavDirections =
        PickClient(direction)

    public fun actionSharingFragmentToNavTransferDetails(transfer: Transfer): NavDirections =
        ActionSharingFragmentToNavTransferDetails(transfer)

    public fun actionSharingFragmentToWebShareLauncherFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_sharingFragment_to_webShareLauncherFragment2)
  }
}
