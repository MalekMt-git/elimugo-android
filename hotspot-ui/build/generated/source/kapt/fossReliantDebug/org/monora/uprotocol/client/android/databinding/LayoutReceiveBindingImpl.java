package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutReceiveBindingImpl extends LayoutReceiveBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.statusText, 3);
        sViewsWithIds.put(R.id.warningIcon, 4);
        sViewsWithIds.put(R.id.progressBar, 5);
        sViewsWithIds.put(R.id.storageFolderContainer, 6);
        sViewsWithIds.put(R.id.storageFolderNotice, 7);
        sViewsWithIds.put(R.id.storageFolderText, 8);
        sViewsWithIds.put(R.id.changeStorageButton, 9);
        sViewsWithIds.put(R.id.webShareButton, 10);
        sViewsWithIds.put(R.id.button, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutReceiveBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private LayoutReceiveBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[11]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (androidx.core.widget.ContentLoadingProgressBar) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            );
        this.image.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.text.setTag(null);
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
            setViewModel((org.monora.uprotocol.client.android.viewmodel.content.SenderClientContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.SenderClientContentViewModel ViewModel) {
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
        boolean viewModelHasClient = false;
        org.monora.uprotocol.core.protocol.Client viewModelClient = null;
        org.monora.uprotocol.client.android.viewmodel.content.SenderClientContentViewModel viewModel = mViewModel;
        int viewModelHasClientViewVISIBLEViewGONE = 0;
        java.lang.String viewModelNickname = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.hasClient
                    viewModelHasClient = viewModel.getHasClient();
                    // read viewModel.client
                    viewModelClient = viewModel.getClient();
                    // read viewModel.nickname
                    viewModelNickname = viewModel.getNickname();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelHasClient) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read viewModel.hasClient ? View.VISIBLE : View.GONE
                viewModelHasClientViewVISIBLEViewGONE = ((viewModelHasClient) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            org.monora.uprotocol.client.android.binding.UserProfileBindingsKt.loadPictureOfClient(this.image, viewModelClient);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text, viewModelNickname);
            this.text.setVisibility(viewModelHasClientViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
        flag 2 (0x3L): viewModel.hasClient ? View.VISIBLE : View.GONE
        flag 3 (0x4L): viewModel.hasClient ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}