package org.monora.uprotocol.client.android.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.core.protocol.Direction

public class TextEditorFragmentDirections private constructor() {
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

  public companion object {
    public fun pickClient(direction: Direction = Direction.Outgoing): NavDirections =
        PickClient(direction)
  }
}
