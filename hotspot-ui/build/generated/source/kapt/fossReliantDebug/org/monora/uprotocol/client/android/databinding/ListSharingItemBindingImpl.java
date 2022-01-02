package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListSharingItemBindingImpl extends ListSharingItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListSharingItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ListSharingItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.imageView2.setTag(null);
        this.imageView3.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView7.setTag(null);
        this.textView8.setTag(null);
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
            setViewModel((org.monora.uprotocol.client.android.viewmodel.content.TransferItemContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.TransferItemContentViewModel ViewModel) {
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
        java.lang.String viewModelSize = null;
        java.lang.String viewModelName = null;
        org.monora.uprotocol.client.android.viewmodel.content.TransferItemContentViewModel viewModel = mViewModel;
        org.monora.uprotocol.client.android.database.model.UTransferItem viewModelTransferItem = null;
        java.lang.String viewModelMimeType = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.size
                    viewModelSize = viewModel.getSize();
                    // read viewModel.name
                    viewModelName = viewModel.getName();
                    // read viewModel.transferItem
                    viewModelTransferItem = viewModel.getTransferItem();
                    // read viewModel.mimeType
                    viewModelMimeType = viewModel.getMimeType();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            org.monora.uprotocol.client.android.binding.ContentBindingsKt.loadThumbnailOf(this.imageView2, viewModelTransferItem);
            org.monora.uprotocol.client.android.binding.ContentBindingsKt.loadIconOf(this.imageView3, viewModelMimeType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView7, viewModelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView8, viewModelSize);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}