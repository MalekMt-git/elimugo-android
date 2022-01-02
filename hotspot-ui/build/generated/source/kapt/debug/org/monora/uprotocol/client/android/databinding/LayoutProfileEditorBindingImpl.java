package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutProfileEditorBindingImpl extends LayoutProfileEditorBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textInputLayout, 5);
        sViewsWithIds.put(R.id.editorBottomBarrier, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutProfileEditorBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private LayoutProfileEditorBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (androidx.constraintlayout.widget.Barrier) bindings[6]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            );
        this.button2.setTag(null);
        this.button3.setTag(null);
        this.container.setTag(null);
        this.editText.setTag(null);
        this.picture.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.pickPhotoClickListener == variableId) {
            setPickPhotoClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.monora.uprotocol.client.android.viewmodel.UserProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPickPhotoClickListener(@Nullable android.view.View.OnClickListener PickPhotoClickListener) {
        this.mPickPhotoClickListener = PickPhotoClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.pickPhotoClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.UserProfileViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelClient((androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.database.model.UClient>) object, fieldId);
            case 1 :
                return onChangeViewModelHasPicture((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeViewModelHasPicture(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelHasPicture, int fieldId) {
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
        int viewModelHasPictureViewVISIBLEViewGONE = 0;
        java.lang.String viewModelClientClientNickname = null;
        androidx.lifecycle.MutableLiveData<org.monora.uprotocol.client.android.database.model.UClient> viewModelClient = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelHasPictureGetValue = false;
        android.view.View.OnClickListener viewModelDeletePictureListener = null;
        android.view.View.OnClickListener pickPhotoClickListener = mPickPhotoClickListener;
        org.monora.uprotocol.client.android.database.model.UClient viewModelClientGetValue = null;
        java.lang.Boolean viewModelHasPictureGetValue = null;
        org.monora.uprotocol.client.android.viewmodel.UserProfileViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelHasPicture = null;

        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

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
                        // read viewModel.client.getValue().clientNickname
                        viewModelClientClientNickname = viewModelClientGetValue.getClientNickname();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.deletePictureListener
                        viewModelDeletePictureListener = viewModel.getDeletePictureListener();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hasPicture
                        viewModelHasPicture = viewModel.getHasPicture();
                    }
                    updateLiveDataRegistration(1, viewModelHasPicture);


                    if (viewModelHasPicture != null) {
                        // read viewModel.hasPicture.getValue()
                        viewModelHasPictureGetValue = viewModelHasPicture.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasPicture.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelHasPictureGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelHasPictureGetValue);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelHasPictureGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasPicture.getValue()) ? View.VISIBLE : View.GONE
                    viewModelHasPictureViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelHasPictureGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.button2.setOnClickListener(viewModelDeletePictureListener);
            org.monora.uprotocol.client.android.binding.UserProfileBindingsKt.listenNicknameChanges(this.editText, viewModel);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.button2.setVisibility(viewModelHasPictureViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.button3.setOnClickListener(pickPhotoClickListener);
            this.picture.setOnClickListener(pickPhotoClickListener);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editText, viewModelClientClientNickname);
            org.monora.uprotocol.client.android.binding.UserProfileBindingsKt.loadPictureOfClient(this.picture, viewModelClientGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.client
        flag 1 (0x2L): viewModel.hasPicture
        flag 2 (0x3L): pickPhotoClickListener
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasPicture.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasPicture.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}