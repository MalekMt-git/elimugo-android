package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutUserProfileBindingImpl extends LayoutUserProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.profileTopBarrier, 5);
        sViewsWithIds.put(R.id.profileBottomBarrier, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutUserProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private LayoutUserProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.Barrier) bindings[6]
            , (androidx.constraintlayout.widget.Barrier) bindings[5]
            , (android.widget.TextView) bindings[3]
            );
        this.button.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.nickname.setTag(null);
        this.picture.setTag(null);
        this.versionText.setTag(null);
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
        if (BR.editProfileClickListener == variableId) {
            setEditProfileClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.monora.uprotocol.client.android.viewmodel.UserProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEditProfileClickListener(@Nullable android.view.View.OnClickListener EditProfileClickListener) {
        this.mEditProfileClickListener = EditProfileClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.editProfileClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.UserProfileViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelClient((androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.database.model.UClient>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelClient(androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.database.model.UClient> ViewModelClient, int fieldId) {
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
        java.lang.String viewModelClientVersionName = null;
        java.lang.String viewModelClientClientNickname = null;
        androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.database.model.UClient> viewModelClient = null;
        android.view.View.OnClickListener editProfileClickListener = mEditProfileClickListener;
        org.monora.uprotocol.client.android.database.model.UClient viewModelClientGetValue = null;
        org.monora.uprotocol.client.android.viewmodel.UserProfileViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.client
                    viewModelClient = viewModel.getClient();
                }
                updateLiveDataRegistration(0, viewModelClient);


                if (viewModelClient != null) {
                    // read viewModel.client.getValue()
                    viewModelClientGetValue = viewModelClient.getValue();
                }


                if (viewModelClientGetValue != null) {
                    // read viewModel.client.getValue().versionName
                    viewModelClientVersionName = viewModelClientGetValue.getVersionName();
                    // read viewModel.client.getValue().clientNickname
                    viewModelClientClientNickname = viewModelClientGetValue.getClientNickname();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.button.setOnClickListener(editProfileClickListener);
            this.picture.setOnClickListener(editProfileClickListener);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nickname, viewModelClientClientNickname);
            org.monora.uprotocol.client.android.binding.UserProfileBindingsKt.loadPictureOfClient(this.picture, viewModelClientGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.versionText, viewModelClientVersionName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.client
        flag 1 (0x2L): editProfileClickListener
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}