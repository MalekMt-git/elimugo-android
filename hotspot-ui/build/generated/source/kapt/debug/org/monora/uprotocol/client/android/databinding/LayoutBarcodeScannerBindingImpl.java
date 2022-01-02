package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutBarcodeScannerBindingImpl extends LayoutBarcodeScannerBinding  {

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

    public LayoutBarcodeScannerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private LayoutBarcodeScannerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (org.monora.android.codescanner.CodeScannerView) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.barcodeView.setTag(null);
        this.button.setTag(null);
        this.image.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.text.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setViewModel((org.monora.uprotocol.client.android.fragment.pickclient.BarcodeScannerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.monora.uprotocol.client.android.fragment.pickclient.BarcodeScannerViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelNeedsAccess((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelStateText((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelRunning((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelStateButtonText((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelStateImage((androidx.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelNeedsAccess(androidx.databinding.ObservableBoolean ViewModelNeedsAccess, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStateText(androidx.databinding.ObservableField<java.lang.String> ViewModelStateText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRunning(androidx.databinding.ObservableBoolean ViewModelRunning, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStateButtonText(androidx.databinding.ObservableField<java.lang.String> ViewModelStateButtonText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStateImage(androidx.databinding.ObservableInt ViewModelStateImage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        androidx.databinding.ObservableBoolean viewModelNeedsAccess = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelStateText = null;
        int viewModelNeedsAccessViewVISIBLEViewGONE = 0;
        java.lang.String viewModelStateButtonTextGet = null;
        java.lang.String viewModelStateTextGet = null;
        android.view.View.OnClickListener viewModelClickListener = null;
        int viewModelRunningViewVISIBLEViewGONE = 0;
        boolean ViewModelNeedsAccess1 = false;
        boolean viewModelRunning = false;
        boolean viewModelRunningGet = false;
        java.lang.String viewModelRunningTextAndroidStringCompletingViewModelStateText = null;
        androidx.databinding.ObservableBoolean ViewModelRunning1 = null;
        int viewModelRunningBooleanTrueViewModelNeedsAccessViewVISIBLEViewGONE = 0;
        int viewModelStateImageGet = 0;
        androidx.databinding.ObservableField<java.lang.String> viewModelStateButtonText = null;
        boolean viewModelNeedsAccessGet = false;
        int viewModelRunningViewModelNeedsAccessBooleanFalseViewVISIBLEViewGONE = 0;
        org.monora.uprotocol.client.android.fragment.pickclient.BarcodeScannerViewModel viewModel = mViewModel;
        boolean viewModelRunningBooleanTrueViewModelNeedsAccess = false;
        androidx.databinding.ObservableInt viewModelStateImage = null;
        boolean viewModelRunningViewModelNeedsAccessBooleanFalse = false;
        java.lang.String viewModelRunningButtonAndroidStringCancelViewModelStateButtonText = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.needsAccess
                        viewModelNeedsAccess = viewModel.getNeedsAccess();
                    }
                    updateRegistration(0, viewModelNeedsAccess);


                    if (viewModelNeedsAccess != null) {
                        // read viewModel.needsAccess.get()
                        viewModelNeedsAccessGet = viewModelNeedsAccess.get();
                    }
                if((dirtyFlags & 0x61L) != 0) {
                    if(viewModelNeedsAccessGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.needsAccess.get() ? View.VISIBLE : View.GONE
                    viewModelNeedsAccessViewVISIBLEViewGONE = ((viewModelNeedsAccessGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x60L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.clickListener
                        viewModelClickListener = viewModel.getClickListener();
                    }
            }
            if ((dirtyFlags & 0x6fL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.running
                        ViewModelRunning1 = viewModel.getRunning();
                    }
                    updateRegistration(2, ViewModelRunning1);


                    if (ViewModelRunning1 != null) {
                        // read viewModel.running.get()
                        viewModelRunningGet = ViewModelRunning1.get();
                    }
                if((dirtyFlags & 0x64L) != 0) {
                    if(viewModelRunningGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x66L) != 0) {
                    if(viewModelRunningGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
                if((dirtyFlags & 0x65L) != 0) {
                    if(viewModelRunningGet) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
                if((dirtyFlags & 0x6cL) != 0) {
                    if(viewModelRunningGet) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }

                if ((dirtyFlags & 0x64L) != 0) {

                        // read viewModel.running.get() ? View.VISIBLE : View.GONE
                        viewModelRunningViewVISIBLEViewGONE = ((viewModelRunningGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x65L) != 0) {

                        // read !viewModel.running.get()
                        viewModelRunning = !viewModelRunningGet;
                    if((dirtyFlags & 0x65L) != 0) {
                        if(viewModelRunning) {
                                dirtyFlags |= 0x100000L;
                        }
                        else {
                                dirtyFlags |= 0x80000L;
                        }
                    }
                }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.stateImage
                        viewModelStateImage = viewModel.getStateImage();
                    }
                    updateRegistration(4, viewModelStateImage);


                    if (viewModelStateImage != null) {
                        // read viewModel.stateImage.get()
                        viewModelStateImageGet = viewModelStateImage.get();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x120000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.needsAccess
                    viewModelNeedsAccess = viewModel.getNeedsAccess();
                }
                updateRegistration(0, viewModelNeedsAccess);


                if (viewModelNeedsAccess != null) {
                    // read viewModel.needsAccess.get()
                    viewModelNeedsAccessGet = viewModelNeedsAccess.get();
                }
            if((dirtyFlags & 0x61L) != 0) {
                if(viewModelNeedsAccessGet) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }

            if ((dirtyFlags & 0x100000L) != 0) {

                    // read !viewModel.needsAccess.get()
                    ViewModelNeedsAccess1 = !viewModelNeedsAccessGet;
            }
        }
        if ((dirtyFlags & 0x800L) != 0) {

                if (viewModel != null) {
                    // read viewModel.stateText
                    viewModelStateText = viewModel.getStateText();
                }
                updateRegistration(1, viewModelStateText);


                if (viewModelStateText != null) {
                    // read viewModel.stateText.get()
                    viewModelStateTextGet = viewModelStateText.get();
                }
        }
        if ((dirtyFlags & 0x200000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.stateButtonText
                    viewModelStateButtonText = viewModel.getStateButtonText();
                }
                updateRegistration(3, viewModelStateButtonText);


                if (viewModelStateButtonText != null) {
                    // read viewModel.stateButtonText.get()
                    viewModelStateButtonTextGet = viewModelStateButtonText.get();
                }
        }

        if ((dirtyFlags & 0x66L) != 0) {

                // read viewModel.running.get() ? @android:string/completing : viewModel.stateText.get()
                viewModelRunningTextAndroidStringCompletingViewModelStateText = ((viewModelRunningGet) ? (text.getResources().getString(R.string.completing)) : (viewModelStateTextGet));
        }
        if ((dirtyFlags & 0x65L) != 0) {

                // read viewModel.running.get() ? true : viewModel.needsAccess.get()
                viewModelRunningBooleanTrueViewModelNeedsAccess = ((viewModelRunningGet) ? (true) : (viewModelNeedsAccessGet));
                // read !viewModel.running.get() ? !viewModel.needsAccess.get() : false
                viewModelRunningViewModelNeedsAccessBooleanFalse = ((viewModelRunning) ? (ViewModelNeedsAccess1) : (false));
            if((dirtyFlags & 0x65L) != 0) {
                if(viewModelRunningBooleanTrueViewModelNeedsAccess) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }
            if((dirtyFlags & 0x65L) != 0) {
                if(viewModelRunningViewModelNeedsAccessBooleanFalse) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read viewModel.running.get() ? true : viewModel.needsAccess.get() ? View.VISIBLE : View.GONE
                viewModelRunningBooleanTrueViewModelNeedsAccessViewVISIBLEViewGONE = ((viewModelRunningBooleanTrueViewModelNeedsAccess) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read !viewModel.running.get() ? !viewModel.needsAccess.get() : false ? View.VISIBLE : View.GONE
                viewModelRunningViewModelNeedsAccessBooleanFalseViewVISIBLEViewGONE = ((viewModelRunningViewModelNeedsAccessBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6cL) != 0) {

                // read viewModel.running.get() ? @android:string/cancel : viewModel.stateButtonText.get()
                viewModelRunningButtonAndroidStringCancelViewModelStateButtonText = ((viewModelRunningGet) ? (button.getResources().getString(R.string.cancel)) : (viewModelStateButtonTextGet));
        }
        // batch finished
        if ((dirtyFlags & 0x65L) != 0) {
            // api target 1

            this.barcodeView.setVisibility(viewModelRunningViewModelNeedsAccessBooleanFalseViewVISIBLEViewGONE);
            this.button.setVisibility(viewModelRunningBooleanTrueViewModelNeedsAccessViewVISIBLEViewGONE);
            this.text.setVisibility(viewModelRunningBooleanTrueViewModelNeedsAccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.button.setOnClickListener(viewModelClickListener);
        }
        if ((dirtyFlags & 0x6cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.button, viewModelRunningButtonAndroidStringCancelViewModelStateButtonText);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            this.image.setImageResource(viewModelStateImageGet);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.image.setVisibility(viewModelNeedsAccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.progressBar.setVisibility(viewModelRunningViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x66L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text, viewModelRunningTextAndroidStringCompletingViewModelStateText);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.needsAccess
        flag 1 (0x2L): viewModel.stateText
        flag 2 (0x3L): viewModel.running
        flag 3 (0x4L): viewModel.stateButtonText
        flag 4 (0x5L): viewModel.stateImage
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): viewModel.needsAccess.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.needsAccess.get() ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.running.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.running.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.running.get() ? @android:string/completing : viewModel.stateText.get()
        flag 12 (0xdL): viewModel.running.get() ? @android:string/completing : viewModel.stateText.get()
        flag 13 (0xeL): viewModel.running.get() ? true : viewModel.needsAccess.get() ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.running.get() ? true : viewModel.needsAccess.get() ? View.VISIBLE : View.GONE
        flag 15 (0x10L): !viewModel.running.get() ? !viewModel.needsAccess.get() : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): !viewModel.running.get() ? !viewModel.needsAccess.get() : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.running.get() ? true : viewModel.needsAccess.get()
        flag 18 (0x13L): viewModel.running.get() ? true : viewModel.needsAccess.get()
        flag 19 (0x14L): !viewModel.running.get() ? !viewModel.needsAccess.get() : false
        flag 20 (0x15L): !viewModel.running.get() ? !viewModel.needsAccess.get() : false
        flag 21 (0x16L): viewModel.running.get() ? @android:string/cancel : viewModel.stateButtonText.get()
        flag 22 (0x17L): viewModel.running.get() ? @android:string/cancel : viewModel.stateButtonText.get()
    flag mapping end*/
    //end
}