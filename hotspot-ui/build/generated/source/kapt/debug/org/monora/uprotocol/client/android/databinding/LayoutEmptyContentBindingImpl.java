package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutEmptyContentBindingImpl extends LayoutEmptyContentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.emptyImage, 2);
        sViewsWithIds.put(R.id.emptyText, 3);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutEmptyContentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LayoutEmptyContentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ProgressBar) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar5.setTag(null);
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
            setViewModel((org.monora.uprotocol.client.android.viewmodel.EmptyContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.EmptyContentViewModel ViewModel) {
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
                return onChangeViewModelLoading((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelHasContent((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLoading(androidx.databinding.ObservableBoolean ViewModelLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHasContent(androidx.databinding.ObservableBoolean ViewModelHasContent, int fieldId) {
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
        androidx.databinding.ObservableBoolean viewModelLoading = null;
        androidx.databinding.ObservableBoolean viewModelHasContent = null;
        int viewModelHasContentViewGONEViewVISIBLE = 0;
        boolean viewModelLoadingGet = false;
        boolean viewModelHasContentGet = false;
        int viewModelLoadingViewVISIBLEViewGONE = 0;
        org.monora.uprotocol.client.android.viewmodel.EmptyContentViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loading
                        viewModelLoading = viewModel.getLoading();
                    }
                    updateRegistration(0, viewModelLoading);


                    if (viewModelLoading != null) {
                        // read viewModel.loading.get()
                        viewModelLoadingGet = viewModelLoading.get();
                    }
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelLoadingGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read viewModel.loading.get() ? View.VISIBLE : View.GONE
                    viewModelLoadingViewVISIBLEViewGONE = ((viewModelLoadingGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hasContent
                        viewModelHasContent = viewModel.getHasContent();
                    }
                    updateRegistration(1, viewModelHasContent);


                    if (viewModelHasContent != null) {
                        // read viewModel.hasContent.get()
                        viewModelHasContentGet = viewModelHasContent.get();
                    }
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewModelHasContentGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewModel.hasContent.get() ? View.GONE : View.VISIBLE
                    viewModelHasContentViewGONEViewVISIBLE = ((viewModelHasContentGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView0.setVisibility(viewModelHasContentViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.progressBar5.setVisibility(viewModelLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.loading
        flag 1 (0x2L): viewModel.hasContent
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.hasContent.get() ? View.GONE : View.VISIBLE
        flag 5 (0x6L): viewModel.hasContent.get() ? View.GONE : View.VISIBLE
        flag 6 (0x7L): viewModel.loading.get() ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.loading.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}