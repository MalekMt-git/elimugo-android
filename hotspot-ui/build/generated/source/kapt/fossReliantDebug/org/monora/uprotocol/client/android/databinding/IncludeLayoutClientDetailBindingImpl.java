package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeLayoutClientDetailBindingImpl extends IncludeLayoutClientDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.profileBarrier, 8);
        sViewsWithIds.put(R.id.guidelineStart, 9);
        sViewsWithIds.put(R.id.guidelineEnd, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnCheckedChangeListenerImpl mViewModelOnBlockedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener;
    private OnCheckedChangeListenerImpl1 mViewModelOnTrustChangedAndroidWidgetCompoundButtonOnCheckedChangeListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener switchCompatandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.blocked.get()
            //         is viewModel.blocked.set((boolean) callbackArg_0)
            boolean callbackArg_0 = switchCompat.isChecked();
            // localize variables for thread safety
            // viewModel.blocked
            androidx.databinding.ObservableBoolean viewModelBlocked = null;
            // viewModel
            org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.blocked != null
            boolean viewModelBlockedJavaLangObjectNull = false;
            // viewModel.blocked.get()
            boolean viewModelBlockedGet = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelBlocked = viewModel.getBlocked();

                viewModelBlockedJavaLangObjectNull = (viewModelBlocked) != (null);
                if (viewModelBlockedJavaLangObjectNull) {




                    viewModelBlocked.set(((boolean) (callbackArg_0)));
                }
            }
        }
    };

    public IncludeLayoutClientDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private IncludeLayoutClientDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.Guideline) bindings[10]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (androidx.appcompat.widget.SwitchCompat) bindings[6]
            , (androidx.appcompat.widget.SwitchCompat) bindings[7]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            );
        this.image.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.notSupportedText.setTag(null);
        this.switchCompat.setTag(null);
        this.switchCompat2.setTag(null);
        this.text1.setTag(null);
        this.textView13.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
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
        else if (fieldId == BR.blocked) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.trusted) {
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
        boolean viewModelBlocked = false;
        androidx.databinding.ObservableBoolean ViewModelBlocked1 = null;
        androidx.databinding.ObservableBoolean viewModelTrusted = null;
        int viewModelSupportedViewGONEViewVISIBLE = 0;
        boolean viewModelTrustedGet = false;
        boolean viewModelSupported = false;
        java.lang.String viewModelVersion = null;
        java.lang.String viewModelProduct = null;
        android.widget.CompoundButton.OnCheckedChangeListener viewModelOnBlockedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener = null;
        org.monora.uprotocol.core.protocol.Client viewModelClient = null;
        boolean viewModelBlockedGet = false;
        android.widget.CompoundButton.OnCheckedChangeListener viewModelOnTrustChangedAndroidWidgetCompoundButtonOnCheckedChangeListener = null;
        org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel viewModel = mViewModel;
        java.lang.String viewModelNickname = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.blocked
                        ViewModelBlocked1 = viewModel.getBlocked();
                    }
                    updateRegistration(0, ViewModelBlocked1);


                    if (ViewModelBlocked1 != null) {
                        // read viewModel.blocked.get()
                        viewModelBlockedGet = ViewModelBlocked1.get();
                    }


                    // read !viewModel.blocked.get()
                    viewModelBlocked = !viewModelBlockedGet;
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.trusted
                        viewModelTrusted = viewModel.getTrusted();
                    }
                    updateRegistration(1, viewModelTrusted);


                    if (viewModelTrusted != null) {
                        // read viewModel.trusted.get()
                        viewModelTrustedGet = viewModelTrusted.get();
                    }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.supported
                        viewModelSupported = viewModel.getSupported();
                        // read viewModel.version
                        viewModelVersion = viewModel.getVersion();
                        // read viewModel.product
                        viewModelProduct = viewModel.getProduct();
                        // read viewModel::onBlockedChanged
                        viewModelOnBlockedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener = (((mViewModelOnBlockedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener == null) ? (mViewModelOnBlockedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener = new OnCheckedChangeListenerImpl()) : mViewModelOnBlockedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener).setValue(viewModel));
                        // read viewModel.client
                        viewModelClient = viewModel.getClient();
                        // read viewModel::onTrustChanged
                        viewModelOnTrustChangedAndroidWidgetCompoundButtonOnCheckedChangeListener = (((mViewModelOnTrustChangedAndroidWidgetCompoundButtonOnCheckedChangeListener == null) ? (mViewModelOnTrustChangedAndroidWidgetCompoundButtonOnCheckedChangeListener = new OnCheckedChangeListenerImpl1()) : mViewModelOnTrustChangedAndroidWidgetCompoundButtonOnCheckedChangeListener).setValue(viewModel));
                        // read viewModel.nickname
                        viewModelNickname = viewModel.getNickname();
                    }
                if((dirtyFlags & 0xcL) != 0) {
                    if(viewModelSupported) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewModel.supported ? View.GONE : View.VISIBLE
                    viewModelSupportedViewGONEViewVISIBLE = ((viewModelSupported) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            org.monora.uprotocol.client.android.binding.UserProfileBindingsKt.loadPictureOfClient(this.image, viewModelClient);
            this.notSupportedText.setVisibility(viewModelSupportedViewGONEViewVISIBLE);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.switchCompat, (android.widget.CompoundButton.OnCheckedChangeListener)viewModelOnBlockedChangedAndroidWidgetCompoundButtonOnCheckedChangeListener, switchCompatandroidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.switchCompat2, (android.widget.CompoundButton.OnCheckedChangeListener)viewModelOnTrustChangedAndroidWidgetCompoundButtonOnCheckedChangeListener, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text1, viewModelNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView13, viewModelProduct);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.versionText, viewModelVersion);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.switchCompat, viewModelBlockedGet);
            this.switchCompat2.setEnabled(viewModelBlocked);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.switchCompat2, viewModelTrustedGet);
        }
    }
    // Listener Stub Implementations
    public static class OnCheckedChangeListenerImpl implements android.widget.CompoundButton.OnCheckedChangeListener{
        private org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel value;
        public OnCheckedChangeListenerImpl setValue(org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onCheckedChanged(android.widget.CompoundButton arg0, boolean arg1) {
            this.value.onBlockedChanged(arg0, arg1); 
        }
    }
    public static class OnCheckedChangeListenerImpl1 implements android.widget.CompoundButton.OnCheckedChangeListener{
        private org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel value;
        public OnCheckedChangeListenerImpl1 setValue(org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onCheckedChanged(android.widget.CompoundButton arg0, boolean arg1) {
            this.value.onTrustChanged(arg0, arg1); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.blocked
        flag 1 (0x2L): viewModel.trusted
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.supported ? View.GONE : View.VISIBLE
        flag 5 (0x6L): viewModel.supported ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}