package org.monora.uprotocol.client.android.fragment.pickclient

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import org.monora.uprotocol.client.android.NavPickClientDirections
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.database.model.UClient
import org.monora.uprotocol.client.android.database.model.UClientAddress

public class PickClientFragmentDirections private constructor() {
  private data class ActionClientsFragmentToClientConnectionFragment(
    public val client: UClient,
    public val clientAddress: UClientAddress? = null
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_clientsFragment_to_clientConnectionFragment

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
      if (Parcelable::class.java.isAssignableFrom(UClientAddress::class.java)) {
        result.putParcelable("clientAddress", this.clientAddress as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(UClientAddress::class.java)) {
        result.putSerializable("clientAddress", this.clientAddress as Serializable?)
      }
      return result
    }
  }

  private data class ActionClientsFragmentToClientDetailsFragment(
    public val client: UClient
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_clientsFragment_to_clientDetailsFragment

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
    public fun actionClientsFragmentToClientConnectionFragment(client: UClient,
        clientAddress: UClientAddress? = null): NavDirections =
        ActionClientsFragmentToClientConnectionFragment(client, clientAddress)

    public fun actionClientsFragmentToClientDetailsFragment(client: UClient): NavDirections =
        ActionClientsFragmentToClientDetailsFragment(client)

    public fun xmlPop(): NavDirections = NavPickClientDirections.xmlPop()
  }
}
