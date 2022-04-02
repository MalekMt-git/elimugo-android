/*
 * Copyright (C) 2021 Veli Tasalı
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

package org.monora.uprotocol.client.android.fragment

import android.content.Context
import android.os.Bundle
import android.os.Parcelable
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.database.model.UTransferItem
import org.monora.uprotocol.client.android.databinding.LayoutContentBrowserBinding
import org.monora.uprotocol.client.android.fragment.ContentFragmentStateAdapter.PageItem
import org.monora.uprotocol.client.android.fragment.content.AppBrowserFragment
import org.monora.uprotocol.client.android.fragment.content.AudioBrowserFragment
import org.monora.uprotocol.client.android.fragment.content.FileBrowserFragment
import org.monora.uprotocol.client.android.fragment.content.ImageBrowserFragment
import org.monora.uprotocol.client.android.fragment.content.VideoBrowserFragment
import org.monora.uprotocol.client.android.util.CommonErrors
import org.monora.uprotocol.client.android.viewmodel.ClientPickerViewModel
import org.monora.uprotocol.client.android.viewmodel.SharingSelectionViewModel
import org.monora.uprotocol.client.android.viewmodel.SharingState
import org.monora.uprotocol.client.android.viewmodel.SharingViewModel
import javax.inject.Inject

@AndroidEntryPoint
class ContentBrowserFragment : Fragment(R.layout.layout_content_browser) {
    private val selectionViewModel: SharingSelectionViewModel by activityViewModels()

    private val clientPickerViewModel: ClientPickerViewModel by activityViewModels()

    private val sharingViewModel: SharingViewModel by viewModels()

    private val contentBrowserViewModel: ContentBrowserViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = LayoutContentBrowserBinding.bind(view)
        val pagerAdapter = ContentFragmentStateAdapter(requireContext(), childFragmentManager, lifecycle)
        val snackbar = Snackbar.make(view, R.string.sending, Snackbar.LENGTH_INDEFINITE)

//        pagerAdapter.add(PageItem(getString(R.string.app), AppBrowserFragment::class.java.name))
        pagerAdapter.add(PageItem(getString(R.string.packages), FileBrowserFragment::class.java.name))
//        pagerAdapter.add(PageItem(getString(R.string.music), AudioBrowserFragment::class.java.name))
//        pagerAdapter.add(PageItem(getString(R.string.photo), ImageBrowserFragment::class.java.name))
//        pagerAdapter.add(PageItem(getString(R.string.video), VideoBrowserFragment::class.java.name))

        binding.viewPager.isUserInputEnabled = false
        binding.viewPager.adapter = pagerAdapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = pagerAdapter.getItem(position).title
        }.attach()

        sharingViewModel.state.observe(viewLifecycleOwner) {
            when (it) {
                is SharingState.Running -> snackbar.setText(R.string.sending).show()
                is SharingState.Error -> snackbar.setText(CommonErrors.messageOf(view.context, it.exception)).show()
                is SharingState.Success -> {
                    snackbar.dismiss()
                    findNavController().navigate(
                        ContentBrowserFragmentDirections.actionContentBrowserFragmentToNavTransferDetails(it.transfer)
                    )
                }
            }
        }

        clientPickerViewModel.bridge.observe(viewLifecycleOwner) { bridge ->
            val (groupId, items) = contentBrowserViewModel.items ?: return@observe
            sharingViewModel.consume(bridge, groupId, items)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.sharing, menu)

        val selections = menu.findItem(R.id.selections)
        val share = menu.findItem(R.id.share)
        val shareOnWeb = menu.findItem(R.id.shareOnWeb)

        selectionViewModel.selectionState.observe(this) {
            val enable = it.isNotEmpty()

            selections.title = it.size.toString()
            selections.isEnabled = enable
            share.isEnabled = enable
            shareOnWeb.isEnabled = enable
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.share -> findNavController().navigate(
                ContentBrowserFragmentDirections.actionContentBrowserFragmentToPrepareIndexFragment()
            )
            R.id.shareOnWeb -> findNavController().navigate(
                ContentBrowserFragmentDirections.actionContentBrowserFragmentToWebShareLauncherFragment()
            )
            R.id.selections -> findNavController().navigate(
                ContentBrowserFragmentDirections.actionContentBrowserFragmentToSelectionsFragment()
            )
        }

        return super.onOptionsItemSelected(item)
    }
}

class ContentFragmentStateAdapter(
    val context: Context, fm: FragmentManager, lifecycle: Lifecycle,
) : FragmentStateAdapter(fm, lifecycle) {
    private val fragments: MutableList<PageItem> = ArrayList()

    private val fragmentFactory: FragmentFactory = fm.fragmentFactory

    fun add(fragment: PageItem) {
        fragments.add(fragment)
    }

    override fun createFragment(position: Int): Fragment {
        val item = getItem(position)
        val fragment = item.fragment ?: fragmentFactory.instantiate(context.classLoader, item.clazz)

        item.fragment = fragment

        return fragment
    }

    override fun getItemCount(): Int = fragments.size

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    fun getItem(position: Int): PageItem = synchronized(fragments) { fragments[position] }

    @Parcelize
    data class PageItem(var title: String, var clazz: String) : Parcelable {
        @IgnoredOnParcel
        var fragment: Fragment? = null
    }
}

@HiltViewModel
class ContentBrowserViewModel @Inject internal constructor() : ViewModel() {
    var items: Pair<Long, List<UTransferItem>>? = null
}
