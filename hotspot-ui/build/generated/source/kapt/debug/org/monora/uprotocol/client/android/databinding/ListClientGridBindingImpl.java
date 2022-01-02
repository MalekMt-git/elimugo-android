package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListClientGridBindingImpl extends ListClientGridBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.infoContainer, 4);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListClientGridBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ListClientGridBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.LinearLayout) bindings[4]
            );
        this.container.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.detailsClickListener == variableId) {
            setDetailsClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setDetailsClickListener(@Nullable android.view.View.OnClickListener DetailsClickListener) {
        this.mDetailsClickListener = DetailsClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.detailsClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel ViewModel) {
        updateRegistration(0, ViewModel);
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
            case 0 :
                return onChangeViewModel((org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String viewModelClientType = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        android.view.View.OnClickListener detailsClickListener = mDetailsClickListener;
        org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel viewModel = mViewModel;
        org.monora.uprotocol.core.protocol.Client viewModelClient = null;
        java.lang.String viewModelNickname = null;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {
        }
        if ((dirtyFlags & 0x9L) != 0) {



                if (viewModel != null) {
                    // read viewModel.clientType
                    viewModelClientType = viewModel.getClientType();
                    // read viewModel.client
                    viewModelClient = viewModel.getClient();
                    // read viewModel.nickname
                    viewModelNickname = viewModel.getNickname();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.container.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            org.monora.uprotocol.client.android.binding.ViewBindingsKt.assignLongClickListener(this.container, detailsClickListener);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            org.monora.uprotocol.client.android.binding.UserProfileBindingsKt.loadPictureOfClient(this.mboundView1, viewModelClient);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelClientType);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): detailsClickListener
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}