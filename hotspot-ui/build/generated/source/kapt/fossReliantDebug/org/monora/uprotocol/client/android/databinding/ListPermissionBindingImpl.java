package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListPermissionBindingImpl extends ListPermissionBinding  {

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

    public ListPermissionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ListPermissionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.button.setTag(null);
        this.description.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.title.setTag(null);
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
            setViewModel((org.monora.uprotocol.client.android.activity.PermissionContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.monora.uprotocol.client.android.activity.PermissionContentViewModel ViewModel) {
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
        boolean viewModelGranted = false;
        org.monora.uprotocol.client.android.activity.PermissionContentViewModel viewModel = mViewModel;
        int viewModelTitle = 0;
        int viewModelDescription = 0;
        java.lang.String viewModelGrantedButtonAndroidStringGrantedButtonAndroidStringGrant = null;
        boolean ViewModelGranted1 = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.title
                    viewModelTitle = viewModel.getTitle();
                    // read viewModel.description
                    viewModelDescription = viewModel.getDescription();
                    // read viewModel.granted
                    ViewModelGranted1 = viewModel.getGranted();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(ViewModelGranted1) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read !viewModel.granted
                viewModelGranted = !ViewModelGranted1;
                // read viewModel.granted ? @android:string/granted : @android:string/grant
                viewModelGrantedButtonAndroidStringGrantedButtonAndroidStringGrant = ((ViewModelGranted1) ? (button.getResources().getString(R.string.granted)) : (button.getResources().getString(R.string.grant)));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.button.setEnabled(viewModelGranted);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.button, viewModelGrantedButtonAndroidStringGrantedButtonAndroidStringGrant);
            this.description.setText(viewModelDescription);
            this.title.setText(viewModelTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
        flag 2 (0x3L): viewModel.granted ? @android:string/granted : @android:string/grant
        flag 3 (0x4L): viewModel.granted ? @android:string/granted : @android:string/grant
    flag mapping end*/
    //end
}