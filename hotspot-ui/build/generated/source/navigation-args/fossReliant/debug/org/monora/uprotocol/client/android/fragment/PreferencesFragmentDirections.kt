package org.monora.uprotocol.client.android.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.monora.uprotocol.client.android.R

public class PreferencesFragmentDirections private constructor() {
  public companion object {
    public fun actionPreferencesFragment2ToResetPreferencesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_preferencesFragment2_to_resetPreferencesFragment)
  }
}
