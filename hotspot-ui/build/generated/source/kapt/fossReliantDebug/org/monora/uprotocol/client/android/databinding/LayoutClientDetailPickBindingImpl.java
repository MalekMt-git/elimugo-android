package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutClientDetailPickBindingImpl extends LayoutClientDetailPickBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(1, 
            new String[] {"include_layout_client_detail"},
            new int[] {2},
            new int[] {org.monora.uprotocol.client.android.R.layout.include_layout_client_detail});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView6, 3);
        sViewsWithIds.put(R.id.reject_button, 4);
        sViewsWithIds.put(R.id.accept_button, 5);
        sViewsWithIds.put(R.id.left_guideLine, 6);
        sViewsWithIds.put(R.id.right_guideline, 7);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutClientDetailPickBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private LayoutClientDetailPickBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[5]
            , (org.monora.uprotocol.client.android.databinding.IncludeLayoutClientDetailBinding) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (android.widget.Button) bindings[4]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (android.widget.TextView) bindings[3]
            );
        setContainedBinding(this.include);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        include.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (include.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel ViewModel) {
        updateRegistration(1, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        include.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeInclude((org.monora.uprotocol.client.android.databinding.IncludeLayoutClientDetailBinding) object, fieldId);
            case 1 :
                return onChangeViewModel((org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeInclude(org.monora.uprotocol.client.android.databinding.IncludeLayoutClientDetailBinding Include, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.include.setViewModel(viewModel);
        }
        executeBindingsOn(include);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): include
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}