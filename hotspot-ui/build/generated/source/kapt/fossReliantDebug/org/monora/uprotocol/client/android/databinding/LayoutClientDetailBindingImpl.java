package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutClientDetailBindingImpl extends LayoutClientDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(1, 
            new String[] {"include_layout_client_detail"},
            new int[] {3},
            new int[] {org.monora.uprotocol.client.android.R.layout.include_layout_client_detail});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnRemoveAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public LayoutClientDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LayoutClientDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (org.monora.uprotocol.client.android.databinding.IncludeLayoutClientDetailBinding) bindings[3]
            , (android.widget.Button) bindings[2]
            );
        setContainedBinding(this.include);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.removeButton.setTag(null);
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
        android.view.View.OnClickListener viewModelOnRemoveAndroidViewViewOnClickListener = null;
        org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x6L) != 0) {



                if (viewModel != null) {
                    // read viewModel::onRemove
                    viewModelOnRemoveAndroidViewViewOnClickListener = (((mViewModelOnRemoveAndroidViewViewOnClickListener == null) ? (mViewModelOnRemoveAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnRemoveAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.include.setViewModel(viewModel);
            this.removeButton.setOnClickListener(viewModelOnRemoveAndroidViewViewOnClickListener);
        }
        executeBindingsOn(include);
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel value;
        public OnClickListenerImpl setValue(org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onRemove(arg0); 
        }
    }
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