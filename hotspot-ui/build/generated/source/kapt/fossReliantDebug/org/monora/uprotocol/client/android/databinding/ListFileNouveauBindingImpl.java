package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListFileNouveauBindingImpl extends ListFileNouveauBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.selection, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListFileNouveauBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ListFileNouveauBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.icon.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.secondaryText.setTag(null);
        this.thumbnail.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((org.monora.uprotocol.client.android.viewmodel.content.FileContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.FileContentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewModelIndexCount = 0;
        java.lang.String viewModelIsDirectorySecondaryTextAndroidPluralsFilesViewModelIndexCountViewModelIndexCountViewModelSizeText = null;
        int viewModelIcon = 0;
        boolean viewModelIsDirectory = false;
        java.lang.String secondaryTextAndroidPluralsFilesViewModelIndexCountViewModelIndexCount = null;
        java.lang.String viewModelName = null;
        org.monora.uprotocol.client.android.viewmodel.content.FileContentViewModel viewModel = mViewModel;
        java.lang.String viewModelSizeText = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.icon
                    viewModelIcon = viewModel.getIcon();
                    // read viewModel.isDirectory
                    viewModelIsDirectory = viewModel.isDirectory();
                    // read viewModel.name
                    viewModelName = viewModel.getName();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelIsDirectory) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (viewModel != null) {
                    // read viewModel.indexCount
                    viewModelIndexCount = viewModel.getIndexCount();
                }


                // read @android:plurals/files
                secondaryTextAndroidPluralsFilesViewModelIndexCountViewModelIndexCount = secondaryText.getResources().getQuantityString(R.plurals.files, viewModelIndexCount, viewModelIndexCount);
                // read @android:plurals/files
                secondaryTextAndroidPluralsFilesViewModelIndexCountViewModelIndexCount = secondaryText.getResources().getQuantityString(R.plurals.files, viewModelIndexCount, viewModelIndexCount);
        }
        if ((dirtyFlags & 0x4L) != 0) {

                if (viewModel != null) {
                    // read viewModel.sizeText
                    viewModelSizeText = viewModel.getSizeText();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read viewModel.isDirectory ? @android:plurals/files : viewModel.sizeText
                viewModelIsDirectorySecondaryTextAndroidPluralsFilesViewModelIndexCountViewModelIndexCountViewModelSizeText = ((viewModelIsDirectory) ? (secondaryTextAndroidPluralsFilesViewModelIndexCountViewModelIndexCount) : (viewModelSizeText));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.icon.setImageResource(viewModelIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondaryText, viewModelIsDirectorySecondaryTextAndroidPluralsFilesViewModelIndexCountViewModelIndexCountViewModelSizeText);
            org.monora.uprotocol.client.android.binding.ContentBindingsKt.loadThumbnailOf(this.thumbnail, viewModel);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, viewModelName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
        flag 2 (0x3L): viewModel.isDirectory ? @android:plurals/files : viewModel.sizeText
        flag 3 (0x4L): viewModel.isDirectory ? @android:plurals/files : viewModel.sizeText
    flag mapping end*/
    //end
}