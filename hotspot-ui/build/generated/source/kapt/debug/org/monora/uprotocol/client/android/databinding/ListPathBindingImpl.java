package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListPathBindingImpl extends ListPathBinding  {

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

    public ListPathBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ListPathBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.ImageView) bindings[1]
            );
        this.button.setTag(null);
        this.image.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
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
            setViewModel((org.monora.uprotocol.client.android.fragment.content.PathContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.monora.uprotocol.client.android.fragment.content.PathContentViewModel ViewModel) {
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
        int viewModelIsRootBooleanTrueViewModelIsFirstViewGONEViewVISIBLE = 0;
        boolean viewModelIsRootBooleanTrueViewModelIsFirst = false;
        java.lang.String viewModelTitle = null;
        boolean viewModelIsRoot = false;
        java.lang.String viewModelIsRootButtonAndroidStringRootFolderViewModelTitle = null;
        org.monora.uprotocol.client.android.fragment.content.PathContentViewModel viewModel = mViewModel;
        boolean viewModelIsFirst = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.isRoot
                    viewModelIsRoot = viewModel.isRoot();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelIsRoot) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (viewModel != null) {
                    // read viewModel.title
                    viewModelTitle = viewModel.getTitle();
                }
        }
        if ((dirtyFlags & 0x10L) != 0) {

                if (viewModel != null) {
                    // read viewModel.isFirst
                    viewModelIsFirst = viewModel.isFirst();
                }
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read viewModel.isRoot ? true : viewModel.isFirst
                viewModelIsRootBooleanTrueViewModelIsFirst = ((viewModelIsRoot) ? (true) : (viewModelIsFirst));
                // read viewModel.isRoot ? @android:string/root_folder : viewModel.title
                viewModelIsRootButtonAndroidStringRootFolderViewModelTitle = ((viewModelIsRoot) ? (button.getResources().getString(R.string.root_folder)) : (viewModelTitle));
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelIsRootBooleanTrueViewModelIsFirst) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read viewModel.isRoot ? true : viewModel.isFirst ? View.GONE : View.VISIBLE
                viewModelIsRootBooleanTrueViewModelIsFirstViewGONEViewVISIBLE = ((viewModelIsRootBooleanTrueViewModelIsFirst) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.button, viewModelIsRootButtonAndroidStringRootFolderViewModelTitle);
            this.image.setVisibility(viewModelIsRootBooleanTrueViewModelIsFirstViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
        flag 2 (0x3L): viewModel.isRoot ? true : viewModel.isFirst ? View.GONE : View.VISIBLE
        flag 3 (0x4L): viewModel.isRoot ? true : viewModel.isFirst ? View.GONE : View.VISIBLE
        flag 4 (0x5L): viewModel.isRoot ? true : viewModel.isFirst
        flag 5 (0x6L): viewModel.isRoot ? true : viewModel.isFirst
        flag 6 (0x7L): viewModel.isRoot ? @android:string/root_folder : viewModel.title
        flag 7 (0x8L): viewModel.isRoot ? @android:string/root_folder : viewModel.title
    flag mapping end*/
    //end
}