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
import org.monora.uprotocol.client.android.model.ClientRoute

public class ManualConnectionFragmentDirections private constructor() {
  private data class ActionManualConnectionFragmentToAcceptClientFragment(
    public val clientRoute: ClientRoute
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_manualConnectionFragment_to_acceptClientFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(ClientRoute::class.java)) {
        result.putParcelable("clientRoute", this.clientRoute as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(ClientRoute::class.java)) {
        result.putSerializable("clientRoute", this.clientRoute as Serializable)
      } else {
        throw UnsupportedOperationException(ClientRoute::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionManualConnectionFragmentToAcceptClientFragment(clientRoute: ClientRoute):
        NavDirections = ActionManualConnectionFragmentToAcceptClientFragment(clientRoute)

    public fun xmlPop(): NavDirections = NavPickClientDirections.xmlPop()
  }
}
