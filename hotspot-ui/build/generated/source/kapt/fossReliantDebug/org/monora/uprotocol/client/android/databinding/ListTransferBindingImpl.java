package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListTransferBindingImpl extends ListTransferBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rejectButton, 9);
        sViewsWithIds.put(R.id.acceptButton, 10);
        sViewsWithIds.put(R.id.barrierBottom, 11);
        sViewsWithIds.put(R.id.barrierTop, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListTransferBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ListTransferBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[10]
            , (androidx.constraintlayout.widget.Barrier) bindings[11]
            , (androidx.constraintlayout.widget.Barrier) bindings[12]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (androidx.constraintlayout.widget.Group) bindings[8]
            , (android.widget.ImageView) bindings[7]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[2]
            , (android.widget.Button) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.container.setTag(null);
        this.group.setTag(null);
        this.imageView5.setTag(null);
        this.progressBar.setTag(null);
        this.text.setTag(null);
        this.text1.setTag(null);
        this.text2.setTag(null);
        this.toggleButton.setTag(null);
        this.waitingApprovalText.setTag(null);
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
        if (BR.feederModel == variableId) {
            setFeederModel((org.monora.uprotocol.client.android.viewmodel.content.TransferStateFeederViewModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.monora.uprotocol.client.android.viewmodel.content.TransferDetailContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFeederModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.TransferStateFeederViewModel FeederModel) {
        this.mFeederModel = FeederModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.feederModel);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.TransferDetailContentViewModel ViewModel) {
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
                return onChangeFeederModelState((androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeFeederModelState(androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel> FeederModelState, int fieldId) {
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
        int viewModelFinishedIcon = 0;
        int viewModelProgress = 0;
        boolean viewModelNeedsApproval = false;
        org.monora.uprotocol.client.android.viewmodel.content.TransferStateFeederViewModel feederModel = mFeederModel;
        java.lang.String feederModelStateAverageSpeedText = null;
        androidx.lifecycle.LiveData<org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel> feederModelState = null;
        org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel feederModelStateGetValue = null;
        int viewModelFinishedViewModelFinishedIconFeederModelStateButtonIcon = 0;
        int feederModelStateButtonIcon = 0;
        int feederModelStateRunningFeederModelStateTotalInt100 = 0;
        java.lang.String text2AndroidPluralsFilesViewModelCountViewModelCount = null;
        int feederModelStateRunningFeederModelStateProgressViewModelProgress = 0;
        int feederModelStateProgress = 0;
        int viewModelNeedsApprovalViewVISIBLEViewGONE = 0;
        java.lang.String viewModelClientNickname = null;
        boolean feederModelStateRunning = false;
        int viewModelCount = 0;
        boolean viewModelWaitingApproval = false;
        int feederModelStateTotal = 0;
        int viewModelNeedsApprovalViewGONEViewVISIBLE = 0;
        int viewModelIcon = 0;
        java.lang.String feederModelStateRunningFeederModelStateAverageSpeedTextText2AndroidPluralsFilesViewModelCountViewModelCount = null;
        int viewModelFinishedViewINVISIBLEViewVISIBLE = 0;
        org.monora.uprotocol.client.android.viewmodel.content.TransferDetailContentViewModel viewModel = mViewModel;
        java.lang.String viewModelSizeText = null;
        int viewModelWaitingApprovalViewVISIBLEViewGONE = 0;
        boolean viewModelFinished = false;

        if ((dirtyFlags & 0xfL) != 0) {



                if (feederModel != null) {
                    // read feederModel.state
                    feederModelState = feederModel.getState();
                }
                updateLiveDataRegistration(0, feederModelState);
                if (viewModel != null) {
                    // read viewModel.finished
                    viewModelFinished = viewModel.isFinished();
                }
            if((dirtyFlags & 0xfL) != 0) {
                if(viewModelFinished) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(viewModelFinished) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                if (feederModelState != null) {
                    // read feederModel.state.getValue()
                    feederModelStateGetValue = feederModelState.getValue();
                }


                if (feederModelStateGetValue != null) {
                    // read feederModel.state.getValue().running
                    feederModelStateRunning = feederModelStateGetValue.getRunning();
                }
            if((dirtyFlags & 0xbL) != 0) {
                if(feederModelStateRunning) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0xfL) != 0) {
                if(feederModelStateRunning) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x4000L;
                }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    // read viewModel.finished ? View.INVISIBLE : View.VISIBLE
                    viewModelFinishedViewINVISIBLEViewVISIBLE = ((viewModelFinished) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.needsApproval
                        viewModelNeedsApproval = viewModel.getNeedsApproval();
                        // read viewModel.clientNickname
                        viewModelClientNickname = viewModel.getClientNickname();
                        // read viewModel.waitingApproval
                        viewModelWaitingApproval = viewModel.getWaitingApproval();
                        // read viewModel.icon
                        viewModelIcon = viewModel.getIcon();
                        // read viewModel.sizeText
                        viewModelSizeText = viewModel.getSizeText();
                    }
                if((dirtyFlags & 0xcL) != 0) {
                    if(viewModelNeedsApproval) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0xcL) != 0) {
                    if(viewModelWaitingApproval) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read viewModel.needsApproval ? View.VISIBLE : View.GONE
                    viewModelNeedsApprovalViewVISIBLEViewGONE = ((viewModelNeedsApproval) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.needsApproval ? View.GONE : View.VISIBLE
                    viewModelNeedsApprovalViewGONEViewVISIBLE = ((viewModelNeedsApproval) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read viewModel.waitingApproval ? View.VISIBLE : View.GONE
                    viewModelWaitingApprovalViewVISIBLEViewGONE = ((viewModelWaitingApproval) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

                if (viewModel != null) {
                    // read viewModel.finishedIcon
                    viewModelFinishedIcon = viewModel.getFinishedIcon();
                }
        }
        if ((dirtyFlags & 0x100L) != 0) {

                if (viewModel != null) {
                    // read viewModel.progress
                    viewModelProgress = viewModel.getProgress();
                }
        }
        if ((dirtyFlags & 0x8000L) != 0) {

                if (feederModelStateGetValue != null) {
                    // read feederModel.state.getValue().averageSpeedText
                    feederModelStateAverageSpeedText = feederModelStateGetValue.getAverageSpeedText();
                }
        }
        if ((dirtyFlags & 0x10L) != 0) {

                if (feederModelStateGetValue != null) {
                    // read feederModel.state.getValue().buttonIcon
                    feederModelStateButtonIcon = feederModelStateGetValue.getButtonIcon();
                }
        }
        if ((dirtyFlags & 0x200L) != 0) {

                if (feederModelStateGetValue != null) {
                    // read feederModel.state.getValue().progress
                    feederModelStateProgress = feederModelStateGetValue.getProgress();
                }
        }
        if ((dirtyFlags & 0x4000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.count
                    viewModelCount = viewModel.getCount();
                }


                // read @android:plurals/files
                text2AndroidPluralsFilesViewModelCountViewModelCount = text2.getResources().getQuantityString(R.plurals.files, viewModelCount, viewModelCount);
                // read @android:plurals/files
                text2AndroidPluralsFilesViewModelCountViewModelCount = text2.getResources().getQuantityString(R.plurals.files, viewModelCount, viewModelCount);
        }
        if ((dirtyFlags & 0x80L) != 0) {

                if (feederModelStateGetValue != null) {
                    // read feederModel.state.getValue().total
                    feederModelStateTotal = feederModelStateGetValue.getTotal();
                }
        }

        if ((dirtyFlags & 0xfL) != 0) {

                // read viewModel.finished ? viewModel.finishedIcon : feederModel.state.getValue().buttonIcon
                viewModelFinishedViewModelFinishedIconFeederModelStateButtonIcon = ((viewModelFinished) ? (viewModelFinishedIcon) : (feederModelStateButtonIcon));
                // read feederModel.state.getValue().running ? feederModel.state.getValue().progress : viewModel.progress
                feederModelStateRunningFeederModelStateProgressViewModelProgress = ((feederModelStateRunning) ? (feederModelStateProgress) : (viewModelProgress));
                // read feederModel.state.getValue().running ? feederModel.state.getValue().averageSpeedText : @android:plurals/files
                feederModelStateRunningFeederModelStateAverageSpeedTextText2AndroidPluralsFilesViewModelCountViewModelCount = ((feederModelStateRunning) ? (feederModelStateAverageSpeedText) : (text2AndroidPluralsFilesViewModelCountViewModelCount));
        }
        if ((dirtyFlags & 0xbL) != 0) {

                // read feederModel.state.getValue().running ? feederModel.state.getValue().total : 100
                feederModelStateRunningFeederModelStateTotalInt100 = ((feederModelStateRunning) ? (feederModelStateTotal) : (100));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.group.setVisibility(viewModelNeedsApprovalViewVISIBLEViewGONE);
            this.imageView5.setImageResource(viewModelIcon);
            this.progressBar.setVisibility(viewModelFinishedViewINVISIBLEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text, viewModelClientNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text1, viewModelSizeText);
            this.toggleButton.setVisibility(viewModelNeedsApprovalViewGONEViewVISIBLE);
            this.waitingApprovalText.setVisibility(viewModelWaitingApprovalViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.progressBar.setMax(feederModelStateRunningFeederModelStateTotalInt100);
        }
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            this.progressBar.setProgress(feederModelStateRunningFeederModelStateProgressViewModelProgress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text2, feederModelStateRunningFeederModelStateAverageSpeedTextText2AndroidPluralsFilesViewModelCountViewModelCount);
            this.toggleButton.setImageResource(viewModelFinishedViewModelFinishedIconFeederModelStateButtonIcon);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): feederModel.state
        flag 1 (0x2L): feederModel
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.finished ? viewModel.finishedIcon : feederModel.state.getValue().buttonIcon
        flag 5 (0x6L): viewModel.finished ? viewModel.finishedIcon : feederModel.state.getValue().buttonIcon
        flag 6 (0x7L): feederModel.state.getValue().running ? feederModel.state.getValue().total : 100
        flag 7 (0x8L): feederModel.state.getValue().running ? feederModel.state.getValue().total : 100
        flag 8 (0x9L): feederModel.state.getValue().running ? feederModel.state.getValue().progress : viewModel.progress
        flag 9 (0xaL): feederModel.state.getValue().running ? feederModel.state.getValue().progress : viewModel.progress
        flag 10 (0xbL): viewModel.needsApproval ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.needsApproval ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.needsApproval ? View.GONE : View.VISIBLE
        flag 13 (0xeL): viewModel.needsApproval ? View.GONE : View.VISIBLE
        flag 14 (0xfL): feederModel.state.getValue().running ? feederModel.state.getValue().averageSpeedText : @android:plurals/files
        flag 15 (0x10L): feederModel.state.getValue().running ? feederModel.state.getValue().averageSpeedText : @android:plurals/files
        flag 16 (0x11L): viewModel.finished ? View.INVISIBLE : View.VISIBLE
        flag 17 (0x12L): viewModel.finished ? View.INVISIBLE : View.VISIBLE
        flag 18 (0x13L): viewModel.waitingApproval ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.waitingApproval ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}