package org.monora.uprotocol.client.android.fragment.pickclient

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import java.net.InetAddress
import kotlin.Int
import kotlin.Suppress
import org.monora.uprotocol.client.android.NavPickClientDirections
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.database.model.Transfer
import org.monora.uprotocol.client.android.database.model.UClient
import org.monora.uprotocol.client.android.database.model.UClientAddress
import org.monora.uprotocol.core.protocol.Direction

public class ConnectionOptionsFragmentDirections private constructor() {
  private data class ActionOptionsFragmentToNetworkManagerFragment(
    public val direction: Direction
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_optionsFragment_to_networkManagerFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Direction::class.java)) {
        result.putParcelable("direction", this.direction as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Direction::class.java)) {
        result.putSerializable("direction", this.direction as Serializable)
      } else {
        throw UnsupportedOperationException(Direction::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  private data class ActionOptionsFragmentToBarcodeScannerFragment(
    public val inetAddress: InetAddress? = null
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_optionsFragment_to_barcodeScannerFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(InetAddress::class.java)) {
        result.putParcelable("inetAddress", this.inetAddress as Parcelable?)
      } else if (Serializable::class.java.isAssignableFrom(InetAddress::class.java)) {
        result.putSerializable("inetAddress", this.inetAddress as Serializable?)
      }
      return result
    }
  }

  private data class ActionOptionsFragmentToClientConnectionFragment(
    public val client: UClient,
    public val clientAddress: UClientAddress? = null
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_optionsFragment_to_clientConnectionFragment

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

  private data class ActionOptionsFragmentToClientDetailsFragment(
    public val client: UClient
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_optionsFragment_to_clientDetailsFragment

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

  private data class ActionOptionsFragmentToNavTransferDetails(
    public val transfer: Transfer
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_optionsFragment_to_nav_transfer_details

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
    public fun actionOptionsFragmentToNetworkManagerFragment(direction: Direction): NavDirections =
        ActionOptionsFragmentToNetworkManagerFragment(direction)

    public fun actionOptionsFragmentToClientsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_optionsFragment_to_clientsFragment)

    public fun actionOptionsFragmentToManualConnectionFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_optionsFragment_to_manualConnectionFragment)

    public fun actionOptionsFragmentToBarcodeScannerFragment(inetAddress: InetAddress? = null):
        NavDirections = ActionOptionsFragmentToBarcodeScannerFragment(inetAddress)

    public fun actionOptionsFragmentToClientConnectionFragment(client: UClient,
        clientAddress: UClientAddress? = null): NavDirections =
        ActionOptionsFragmentToClientConnectionFragment(client, clientAddress)

    public fun actionOptionsFragmentToClientDetailsFragment(client: UClient): NavDirections =
        ActionOptionsFragmentToClientDetailsFragment(client)

    public fun actionOptionsFragmentToNavTransferDetails(transfer: Transfer): NavDirections =
        ActionOptionsFragmentToNavTransferDetails(transfer)

    public fun xmlPop(): NavDirections = NavPickClientDirections.xmlPop()
  }
}
