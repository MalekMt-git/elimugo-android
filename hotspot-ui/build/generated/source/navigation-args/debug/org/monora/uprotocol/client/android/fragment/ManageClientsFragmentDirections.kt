package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.database.model.UClient

public class ManageClientsFragmentDirections private constructor() {
  private data class ActionManageDevicesFragment2ToClientDetailsFragment3(
    public val client: UClient
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_manageDevicesFragment2_to_clientDetailsFragment3

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
    public fun actionManageDevicesFragment2ToClientDetailsFragment3(client: UClient): NavDirections
        = ActionManageDevicesFragment2ToClientDetailsFragment3(client)
  }
}
