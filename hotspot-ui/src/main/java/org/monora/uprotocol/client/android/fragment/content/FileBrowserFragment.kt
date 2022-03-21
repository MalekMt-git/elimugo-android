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

package org.monora.uprotocol.client.android.fragment.content

import android.annotation.TargetApi
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import org.monora.uprotocol.client.android.R
import org.monora.uprotocol.client.android.adapter.FileAdapter
import org.monora.uprotocol.client.android.databinding.LayoutEmptyContentBinding
import org.monora.uprotocol.client.android.databinding.ListPathBinding
import org.monora.uprotocol.client.android.model.FileModel
import org.monora.uprotocol.client.android.viewmodel.EmptyContentViewModel
import org.monora.uprotocol.client.android.viewmodel.FilesViewModel
import org.monora.uprotocol.client.android.viewmodel.SharingSelectionViewModel
import java.io.File

@AndroidEntryPoint
class FileBrowserFragment : Fragment(R.layout.layout_file_browser) {
    @TargetApi(19)
    private val addAccess = registerForActivityResult(ActivityResultContracts.OpenDocumentTree()) { uri: Uri? ->
        val context = context

        if (uri != null && context != null && Build.VERSION.SDK_INT >= 21) {
            viewModel.insertSafFolder(uri)
        }
    }

    private val viewModel: FilesViewModel by viewModels()

    private val selectionViewModel: SharingSelectionViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        val emptyView = LayoutEmptyContentBinding.bind(view.findViewById(R.id.emptyView))
        val floatingViewsContainer = view.findViewById<CoordinatorLayout>(R.id.floatingViewsContainer)
        val adapter = FileAdapter { fileModel, clickType ->
            when (clickType) {
/*                FileAdapter.ClickType.Default -> {
                    if (fileModel.file.isDirectory()) {
                        viewModel.requestPath(fileModel.file)
                    } else {
                        Activities.view(view.context, fileModel.file)
                    }
                    selectionViewModel.setSelected(fileModel, fileModel.isSelected)
                }*/
                FileAdapter.ClickType.ToggleSelect -> {
                    selectionViewModel.setSelected(fileModel, fileModel.isSelected)
                }
            }
        }
        val emptyContentViewModel = EmptyContentViewModel()
        val pathRecyclerView = view.findViewById<RecyclerView>(R.id.pathRecyclerView)
        val pathSelectorButton = view.findViewById<View>(R.id.pathSelectorButton)
        val pathAdapter = PathAdapter {
            viewModel.requestPath(it.file)
        }
        val safAddedSnackbar = Snackbar.make(floatingViewsContainer, R.string.add_success, Snackbar.LENGTH_LONG)

        emptyView.viewModel = emptyContentViewModel
        emptyView.emptyText.setText(/*R.string.empty_files_list*/ R.string.empty_packages_list)
        emptyView.emptyImage.setImageResource(R.drawable.ic_insert_drive_file_white_24dp)
        emptyView.executePendingBindings()
        adapter.setHasStableIds(true)
        recyclerView.adapter = adapter
        pathAdapter.setHasStableIds(true)
        pathRecyclerView.adapter = pathAdapter

        pathAdapter.registerAdapterDataObserver(
            object : RecyclerView.AdapterDataObserver() {
                override fun onItemRangeInserted(positionStart: Int, itemCount: Int) {
                    super.onItemRangeInserted(positionStart, itemCount)
                    pathRecyclerView.scrollToPosition(pathAdapter.itemCount - 1)
                }
            }
        )

        viewModel.files.observe(viewLifecycleOwner) {
            adapter.submitList(it)
            emptyContentViewModel.with(recyclerView, it.isNotEmpty())
        }

        viewModel.pathTree.observe(viewLifecycleOwner) {
            pathAdapter.submitList(it)
        }

        selectionViewModel.externalState.observe(viewLifecycleOwner) {
            adapter.notifyDataSetChanged()
        }

        viewModel.safAdded.observe(viewLifecycleOwner) {
            viewModel.requestPath(it)
            safAddedSnackbar.show()
        }
    }

}

class PathContentViewModel(fileModel: FileModel) {
    val isRoot = fileModel.file.getUri() == ROOT_URI

    val isFirst = fileModel.file.parent == null

    val title = fileModel.file.getName()

    companion object {
        val ROOT_URI: Uri = Uri.fromFile(File("/"))
    }
}

class FilePathViewHolder constructor(
    private val clickListener: (FileModel) -> Unit,
    private var binding: ListPathBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(fileModel: FileModel) {
        binding.viewModel = PathContentViewModel(fileModel)
        binding.button.setOnClickListener {
            clickListener(fileModel)
        }
        binding.button.isEnabled = fileModel.file.canRead()
        binding.executePendingBindings()
    }
}

class PathAdapter(
    private val clickListener: (FileModel) -> Unit,
) : ListAdapter<FileModel, FilePathViewHolder>(FileModelItemCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilePathViewHolder {
        return FilePathViewHolder(
            clickListener,
            ListPathBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: FilePathViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemId(position: Int): Long {
        return getItem(position).listId
    }

    override fun getItemViewType(position: Int): Int {
        return VIEW_TYPE_PATH
    }

    companion object {
        const val VIEW_TYPE_PATH = 0
    }
}

class FileModelItemCallback : DiffUtil.ItemCallback<FileModel>() {
    override fun areItemsTheSame(oldItem: FileModel, newItem: FileModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: FileModel, newItem: FileModel): Boolean {
        return oldItem.hashCode() == newItem.hashCode()
    }
}
