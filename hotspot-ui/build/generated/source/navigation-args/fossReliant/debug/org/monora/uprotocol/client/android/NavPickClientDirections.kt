package org.monora.uprotocol.client.android

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class NavPickClientDirections private constructor() {
  public companion object {
    public fun xmlPop(): NavDirections = ActionOnlyNavDirections(R.id.xml_pop)
  }
}
