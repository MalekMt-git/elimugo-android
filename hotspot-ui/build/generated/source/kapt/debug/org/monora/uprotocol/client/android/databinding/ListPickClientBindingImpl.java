package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListPickClientBindingImpl extends ListPickClientBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListPickClientBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ListPickClientBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[4]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.accessStatusIcon.setTag(null);
        this.container.setTag(null);
        this.image.setTag(null);
        this.overflowButton.setTag(null);
        this.text1.setTag(null);
        this.text2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.detailsClickListener == variableId) {
            setDetailsClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDetailsClickListener(@Nullable android.view.View.OnClickListener DetailsClickListener) {
        this.mDetailsClickListener = DetailsClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.detailsClickListener);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel ViewModel) {
        updateRegistration(2, ViewModel);
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
                return onChangeViewModelBlocked((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelTrusted((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModel((org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelBlocked(androidx.databinding.ObservableBoolean ViewModelBlocked, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTrusted(androidx.databinding.ObservableBoolean ViewModelTrusted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModel(org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.trusted) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.blocked) {
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
        android.view.View.OnClickListener detailsClickListener = mDetailsClickListener;
        androidx.databinding.ObservableBoolean viewModelBlocked = null;
        androidx.databinding.ObservableBoolean viewModelTrusted = null;
        boolean viewModelTrustedBooleanTrueViewModelBlocked = false;
        int viewModelAccessLevelIcon = 0;
        org.monora.uprotocol.core.protocol.Client viewModelClient = null;
        int viewModelTrustedBooleanTrueViewModelBlockedViewVISIBLEViewGONE = 0;
        boolean viewModelTrustedGet = false;
        boolean viewModelBlockedGet = false;
        android.view.View.OnClickListener clickListener = mClickListener;
        org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel viewModel = mViewModel;
        java.lang.String viewModelProduct = null;
        java.lang.String viewModelNickname = null;

        if ((dirtyFlags & 0x28L) != 0) {
        }
        if ((dirtyFlags & 0x30L) != 0) {
        }
        if ((dirtyFlags & 0x27L) != 0) {



                if (viewModel != null) {
                    // read viewModel.trusted
                    viewModelTrusted = viewModel.getTrusted();
                }
                updateRegistration(1, viewModelTrusted);


                if (viewModelTrusted != null) {
                    // read viewModel.trusted.get()
                    viewModelTrustedGet = viewModelTrusted.get();
                }
            if((dirtyFlags & 0x27L) != 0) {
                if(viewModelTrustedGet) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if ((dirtyFlags & 0x24L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.accessLevelIcon
                        viewModelAccessLevelIcon = viewModel.getAccessLevelIcon();
                        // read viewModel.client
                        viewModelClient = viewModel.getClient();
                        // read viewModel.product
                        viewModelProduct = viewModel.getProduct();
                        // read viewModel.nickname
                        viewModelNickname = viewModel.getNickname();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (viewModel != null) {
                    // read viewModel.blocked
                    viewModelBlocked = viewModel.getBlocked();
                }
                updateRegistration(0, viewModelBlocked);


                if (viewModelBlocked != null) {
                    // read viewModel.blocked.get()
                    viewModelBlockedGet = viewModelBlocked.get();
                }
        }

        if ((dirtyFlags & 0x27L) != 0) {

                // read viewModel.trusted.get() ? true : viewModel.blocked.get()
                viewModelTrustedBooleanTrueViewModelBlocked = ((viewModelTrustedGet) ? (true) : (viewModelBlockedGet));
            if((dirtyFlags & 0x27L) != 0) {
                if(viewModelTrustedBooleanTrueViewModelBlocked) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read viewModel.trusted.get() ? true : viewModel.blocked.get() ? View.VISIBLE : View.GONE
                viewModelTrustedBooleanTrueViewModelBlockedViewVISIBLEViewGONE = ((viewModelTrustedBooleanTrueViewModelBlocked) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x27L) != 0) {
            // api target 1

            this.accessStatusIcon.setVisibility(viewModelTrustedBooleanTrueViewModelBlockedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            this.accessStatusIcon.setImageResource(viewModelAccessLevelIcon);
            org.monora.uprotocol.client.android.binding.UserProfileBindingsKt.loadPictureOfClient(this.image, viewModelClient);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text1, viewModelNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text2, viewModelProduct);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.container.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.overflowButton.setOnClickListener(detailsClickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.blocked
        flag 1 (0x2L): viewModel.trusted
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): detailsClickListener
        flag 4 (0x5L): clickListener
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.trusted.get() ? true : viewModel.blocked.get()
        flag 7 (0x8L): viewModel.trusted.get() ? true : viewModel.blocked.get()
        flag 8 (0x9L): viewModel.trusted.get() ? true : viewModel.blocked.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.trusted.get() ? true : viewModel.blocked.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}