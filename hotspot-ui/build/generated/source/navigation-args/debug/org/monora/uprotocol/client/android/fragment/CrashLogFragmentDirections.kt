package org.monora.uprotocol.client.android.fragment

import androidx.navigation.NavDirections
import kotlin.String
import org.monora.uprotocol.client.android.NavHomeDirections
import org.monora.uprotocol.client.android.database.model.SharedText
import org.monora.uprotocol.client.android.database.model.Transfer
import org.monora.uprotocol.client.android.database.model.WebTransfer

public class CrashLogFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalProfileEditorFragment(): NavDirections =
        NavHomeDirections.actionGlobalProfileEditorFragment()

    public fun actionGlobalNavPreferences(): NavDirections =
        NavHomeDirections.actionGlobalNavPreferences()

    public fun actionGlobalNavManageDevices(): NavDirections =
        NavHomeDirections.actionGlobalNavManageDevices()

    public fun actionGlobalChangelogFragment(): NavDirections =
        NavHomeDirections.actionGlobalChangelogFragment()

    public fun actionGlobalNavAbout(): NavDirections = NavHomeDirections.actionGlobalNavAbout()

    public fun actionGlobalCrashLogFragment(): NavDirections =
        NavHomeDirections.actionGlobalCrashLogFragment()

    public fun actionGlobalAboutUprotocolFragment(): NavDirections =
        NavHomeDirections.actionGlobalAboutUprotocolFragment()

    public fun actionGlobalNavTextEditor(sharedText: SharedText? = null, text: String? = null):
        NavDirections = NavHomeDirections.actionGlobalNavTextEditor(sharedText, text)

    public fun actionGlobalWebTransferDetailsFragment(transfer: WebTransfer): NavDirections =
        NavHomeDirections.actionGlobalWebTransferDetailsFragment(transfer)

    public fun actionGlobalNavTransferDetails(transfer: Transfer): NavDirections =
        NavHomeDirections.actionGlobalNavTransferDetails(transfer)
  }
}
