package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutWebShareLauncherBindingImpl extends LayoutWebShareLauncherBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(0, 
            new String[] {"layout_empty_content"},
            new int[] {2},
            new int[] {org.monora.uprotocol.client.android.R.layout.layout_empty_content});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image, 3);
        sViewsWithIds.put(R.id.title, 4);
        sViewsWithIds.put(R.id.detailsBottomBarrier, 5);
        sViewsWithIds.put(R.id.divider, 6);
        sViewsWithIds.put(R.id.recyclerView, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutWebShareLauncherBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private LayoutWebShareLauncherBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[5]
            , (android.view.View) bindings[6]
            , (org.monora.uprotocol.client.android.databinding.LayoutEmptyContentBinding) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        setContainedBinding(this.emptyView);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.subtitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        emptyView.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (emptyView.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((org.monora.uprotocol.client.android.fragment.content.transfer.WebShareViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.monora.uprotocol.client.android.fragment.content.transfer.WebShareViewModel ViewModel) {
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
        emptyView.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeEmptyView((org.monora.uprotocol.client.android.databinding.LayoutEmptyContentBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeEmptyView(org.monora.uprotocol.client.android.databinding.LayoutEmptyContentBinding EmptyView, int fieldId) {
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
        java.lang.String subtitleAndroidPluralsFilesViewModelSharedCountViewModelSharedCount = null;
        int viewModelSharedCount = 0;
        org.monora.uprotocol.client.android.fragment.content.transfer.WebShareViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x6L) != 0) {



                if (viewModel != null) {
                    // read viewModel.sharedCount
                    viewModelSharedCount = viewModel.getSharedCount();
                }


                // read @android:plurals/files
                subtitleAndroidPluralsFilesViewModelSharedCountViewModelSharedCount = subtitle.getResources().getQuantityString(R.plurals.files, viewModelSharedCount, viewModelSharedCount);
                // read @android:plurals/files
                subtitleAndroidPluralsFilesViewModelSharedCountViewModelSharedCount = subtitle.getResources().getQuantityString(R.plurals.files, viewModelSharedCount, viewModelSharedCount);
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtitle, subtitleAndroidPluralsFilesViewModelSharedCountViewModelSharedCount);
        }
        executeBindingsOn(emptyView);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): emptyView
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}