/*
 * Copyright (C) 2019 Veli Tasalı
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.monora.uprotocol.client.android.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import androidx.activity.viewModels
import androidx.annotation.IdRes
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import dagger.hilt.android.AndroidEntryPoint
import org.monora.uprotocol.client.android.BuildConfig
import org.monora.uprotocol.client.android.NavHomeDirections
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.app.Activity
import org.monora.uprotocol.client.android.config.AppConfig
import org.monora.uprotocol.client.android.database.model.SharedText
import org.monora.uprotocol.client.android.database.model.Transfer
import org.monora.uprotocol.client.android.database.model.WebTransfer
import org.monora.uprotocol.client.android.databinding.LayoutUserProfileBinding
import org.monora.uprotocol.client.android.viewmodel.ChangelogViewModel
import org.monora.uprotocol.client.android.viewmodel.CrashLogViewModel
import org.monora.uprotocol.client.android.viewmodel.UserProfileViewModel

@AndroidEntryPoint
class HomeActivity : Activity(), NavigationView.OnNavigationItemSelectedListener {

    private val userProfileViewModel: UserProfileViewModel by viewModels()

    private val userProfileBinding by lazy {
        LayoutUserProfileBinding.bind(navigationView.getHeaderView(0)).also {
            it.viewModel = userProfileViewModel
            it.lifecycleOwner = this
            it.editProfileClickListener = View.OnClickListener {
                openItem(R.id.edit_profile)
            }
        }
    }

    private val navigationView: NavigationView by lazy {
        findViewById(R.id.nav_view)
    }

    private val drawerLayout: DrawerLayout by lazy {
        findViewById(R.id.drawer_layout)
    }

    private var pendingMenuItemId = 0

    private val navController by lazy {
        navController(R.id.nav_host_fragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.open_navigation_drawer, R.string.close_navigation_drawer
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        drawerLayout.addDrawerListener(
            object : DrawerLayout.SimpleDrawerListener() {
                override fun onDrawerClosed(drawerView: View) {
                    applyAwaitingDrawerAction()
                }
            }
        )

        toolbar.setupWithNavController(navController, AppBarConfiguration(navController.graph, drawerLayout))
        navigationView.setNavigationItemSelectedListener(this)
        navController.addOnDestinationChangedListener { _, destination, _ -> title = destination.label }
        userProfileBinding.executePendingBindings()

/*
        if (BuildConfig.FLAVOR == "googlePlay" || BuildConfig.FLAVOR == "fossReliant") {
            navigationView.menu.findItem(R.id.donate).isVisible = false
        }
*/

/*        if (hasIntroductionShown()) {
            if (changelogViewModel.shouldShowChangelog) {
                navController.navigate(NavHomeDirections.actionGlobalChangelogFragment())
            } else if (crashLogViewModel.shouldShowCrashLog) {
                navController.navigate(NavHomeDirections.actionGlobalCrashLogFragment())
            }
        }*/
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        when (intent?.action) {
            ACTION_OPEN_TRANSFER_DETAILS -> if (intent.hasExtra(EXTRA_TRANSFER)) {
                val transfer = intent.getParcelableExtra<Transfer>(EXTRA_TRANSFER)
                if (transfer != null) {
                    navController.navigate(NavHomeDirections.actionGlobalNavTransferDetails(transfer))
                }
            }
            ACTION_OPEN_SHARED_TEXT -> if (intent.hasExtra(EXTRA_SHARED_TEXT)) {
                val sharedText = intent.getParcelableExtra<SharedText>(EXTRA_SHARED_TEXT)
                if (sharedText != null) {
                    navController.navigate(NavHomeDirections.actionGlobalNavTextEditor(sharedText = sharedText))
                }
            }
            ACTION_OPEN_WEB_TRANSFER -> if (intent.hasExtra(EXTRA_WEB_TRANSFER)) {
                val webTransfer = intent.getParcelableExtra<WebTransfer>(EXTRA_WEB_TRANSFER)
                if (webTransfer != null) {
                    Log.d("HomeActivity", "onNewIntent: $webTransfer")
                    navController.navigate(NavHomeDirections.actionGlobalWebTransferDetailsFragment(webTransfer))
                }
            }
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        openItem(item.itemId)
        return true
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(Gravity.START)) {
            drawerLayout.close()
        } else {
            super.onBackPressed()
        }
    }

    private fun applyAwaitingDrawerAction() {
        if (pendingMenuItemId == 0) {
            return // drawer was opened, but nothing was clicked.
        }

        when (pendingMenuItemId) {
            R.id.edit_profile -> navController.navigate(NavHomeDirections.actionGlobalProfileEditorFragment())
            R.id.manage_clients -> navController.navigate(NavHomeDirections.actionGlobalNavManageDevices())
            R.id.about -> navController.navigate(NavHomeDirections.actionGlobalNavAbout())
            R.id.preferences -> navController.navigate(NavHomeDirections.actionGlobalNavPreferences())
            R.id.about_uprotocol -> navController.navigate(NavHomeDirections.actionGlobalAboutUprotocolFragment())
            R.id.music -> try {
                startActivity(
                    Intent(
                        applicationContext,
                        Class.forName("com.leaf.explorer.MusicActivity")
                    )
                )
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
            R.id.donate -> startActivity(Intent(Intent.ACTION_VIEW).setData(Uri.parse(AppConfig.URI_SHIV_SHAMBHU)))
        }

        pendingMenuItemId = 0
    }

    private fun openItem(@IdRes id: Int) {
        pendingMenuItemId = id
        drawerLayout.close()
    }

    companion object {
        const val ACTION_OPEN_TRANSFER_DETAILS = "org.monora.uprotocol.client.android.action.OPEN_TRANSFER_DETAILS"

        const val ACTION_OPEN_WEB_TRANSFER = "org.monora.uprotocol.client.android.action.OPEN_WEB_TRANSFER"

        const val ACTION_OPEN_SHARED_TEXT = "org.monora.uprotocol.client.android.action.OPEN_SHARED_TEXT"

        const val EXTRA_TRANSFER = "extraTransfer"

        const val EXTRA_WEB_TRANSFER = "extraWebTransfer"

        const val EXTRA_SHARED_TEXT = "extraSharedText"
    }
}
