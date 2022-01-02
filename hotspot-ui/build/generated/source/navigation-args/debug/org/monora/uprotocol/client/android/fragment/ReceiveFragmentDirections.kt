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

public class ReceiveFragmentDirections private constructor() {
  private data class PickClient(
    public val direction: Direction = Direction.Incoming
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

  private data class ActionReceiveFragmentToFilePickerFragment(
    public val selectionType: FilePickerFragment.SelectionType =
        FilePickerFragment.SelectionType.Folder
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_receiveFragment_to_filePickerFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(FilePickerFragment.SelectionType::class.java)) {
        result.putParcelable("selectionType", this.selectionType as Parcelable)
      } else if
          (Serializable::class.java.isAssignableFrom(FilePickerFragment.SelectionType::class.java)) {
        result.putSerializable("selectionType", this.selectionType as Serializable)
      }
      return result
    }
  }

  private data class ActionReceiveFragmentToNavTransferDetails(
    public val transfer: Transfer
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_receiveFragment_to_nav_transfer_details

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
    public fun pickClient(direction: Direction = Direction.Incoming): NavDirections =
        PickClient(direction)

    public
        fun actionReceiveFragmentToFilePickerFragment(selectionType: FilePickerFragment.SelectionType
        = FilePickerFragment.SelectionType.Folder): NavDirections =
        ActionReceiveFragmentToFilePickerFragment(selectionType)

    public fun actionReceiveFragmentToNavTransferDetails(transfer: Transfer): NavDirections =
        ActionReceiveFragmentToNavTransferDetails(transfer)

    public fun actionReceiveFragmentToWebShareLauncherFragment3(): NavDirections =
        ActionOnlyNavDirections(R.id.action_receiveFragment_to_webShareLauncherFragment3)
  }
}
