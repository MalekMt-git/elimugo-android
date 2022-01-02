package org.monora.uprotocol.client.android.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import org.monora.uprotocol.client.android.R

public class AboutFragmentDirections private constructor() {
  public companion object {
    public fun actionAboutFragmentToLicensesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_aboutFragment_to_licensesFragment)

    public fun actionAboutFragmentToChangelogFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_aboutFragment_to_changelogFragment2)
  }
}
