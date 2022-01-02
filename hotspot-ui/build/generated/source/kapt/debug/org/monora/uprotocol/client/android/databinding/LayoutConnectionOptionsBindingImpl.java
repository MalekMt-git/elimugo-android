package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutConnectionOptionsBindingImpl extends LayoutConnectionOptionsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(18);
        sIncludes.setIncludes(1, 
            new String[] {"layout_empty_content"},
            new int[] {6},
            new int[] {org.monora.uprotocol.client.android.R.layout.layout_empty_content});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideStart, 7);
        sViewsWithIds.put(R.id.guideEnd, 8);
        sViewsWithIds.put(R.id.textView2, 9);
        sViewsWithIds.put(R.id.barrierClientsHeader, 10);
        sViewsWithIds.put(R.id.recyclerView, 11);
        sViewsWithIds.put(R.id.barrierOnlineList, 12);
        sViewsWithIds.put(R.id.textView3, 13);
        sViewsWithIds.put(R.id.textView4, 14);
        sViewsWithIds.put(R.id.senderAwaitImage, 15);
        sViewsWithIds.put(R.id.senderAwaitText, 16);
        sViewsWithIds.put(R.id.senderNoticeViews, 17);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutConnectionOptionsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private LayoutConnectionOptionsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[10]
            , (androidx.constraintlayout.widget.Barrier) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[2]
            , (org.monora.uprotocol.client.android.databinding.LayoutEmptyContentBinding) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.TextView) bindings[16]
            , (androidx.constraintlayout.widget.Group) bindings[17]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[14]
            );
        this.clientsButton.setTag(null);
        setContainedBinding(this.emptyView);
        this.generateQrCodeButton.setTag(null);
        this.manualAddressButton.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.scanQrCodeButton.setTag(null);
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
        if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
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
        android.view.View.OnClickListener clickListener = mClickListener;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.clientsButton.setOnClickListener(clickListener);
            this.generateQrCodeButton.setOnClickListener(clickListener);
            this.manualAddressButton.setOnClickListener(clickListener);
            this.scanQrCodeButton.setOnClickListener(clickListener);
        }
        executeBindingsOn(emptyView);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): emptyView
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}