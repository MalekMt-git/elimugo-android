package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutWebTransferDetailsBindingImpl extends LayoutWebTransferDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView13, 5);
        sViewsWithIds.put(R.id.profileBarrier, 6);
        sViewsWithIds.put(R.id.removeButton, 7);
        sViewsWithIds.put(R.id.openButton, 8);
        sViewsWithIds.put(R.id.guidelineStart, 9);
        sViewsWithIds.put(R.id.guidelineEnd, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutWebTransferDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private LayoutWebTransferDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (android.widget.ImageView) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (androidx.constraintlayout.widget.Barrier) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.image.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.sizeText.setTag(null);
        this.text1.setTag(null);
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
            setViewModel((org.monora.uprotocol.client.android.viewmodel.content.WebTransferContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.WebTransferContentViewModel ViewModel) {
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
        int viewModelIcon = 0;
        java.lang.String viewModelSize = null;
        java.lang.String viewModelName = null;
        org.monora.uprotocol.client.android.viewmodel.content.WebTransferContentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.icon
                    viewModelIcon = viewModel.getIcon();
                    // read viewModel.size
                    viewModelSize = viewModel.getSize();
                    // read viewModel.name
                    viewModelName = viewModel.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            org.monora.uprotocol.client.android.binding.ContentBindingsKt.loadThumbnailOf(this.image, viewModel);
            this.mboundView1.setImageResource(viewModelIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sizeText, viewModelSize);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text1, viewModelName);
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