package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutTransferDetailsBindingImpl extends LayoutTransferDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.openDirectoryButton, 13);
        sViewsWithIds.put(R.id.percentageSignPlaceholder, 14);
        sViewsWithIds.put(R.id.showFilesButton, 15);
        sViewsWithIds.put(R.id.targetBottomBarrier, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mTransferViewModelShowPopupMenuAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public LayoutTransferDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private LayoutTransferDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[14]
            , (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.Button) bindings[11]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (androidx.constraintlayout.widget.Barrier) bindings[16]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[9]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[12]
            );
        this.image.setTag(null);
        this.imageView4.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.optionsButton.setTag(null);
        this.progressBar.setTag(null);
        this.progressText.setTag(null);
        this.rejectButton.setTag(null);
        this.speedText.setTag(null);
        this.text.setTag(null);
        this.textView15.setTag(null);
        this.toggleButton.setTag(null);
        this.transferTypeText.setTag(null);
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
        if (BR.clientViewModel == variableId) {
            setClientViewModel((org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel) variable);
        }
        else if (BR.transferViewModel == variableId) {
            setTransferViewModel((org.monora.uprotocol.client.android.viewmodel.content.TransferDetailContentViewModel) variable);
        }
        else if (BR.stateViewModel == variableId) {
            setStateViewModel((org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClientViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel ClientViewModel) {
        updateRegistration(0, ClientViewModel);
        this.mClientViewModel = ClientViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clientViewModel);
        super.requestRebind();
    }
    public void setTransferViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.TransferDetailContentViewModel TransferViewModel) {
        this.mTransferViewModel = TransferViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.transferViewModel);
        super.requestRebind();
    }
    public void setStateViewModel(@Nullable org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel StateViewModel) {
        this.mStateViewModel = StateViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.stateViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeClientViewModel((org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeClientViewModel(org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel ClientViewModel, int fieldId) {
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
        int stateViewModelTotal = 0;
        android.view.View.OnClickListener transferViewModelShowPopupMenuAndroidViewViewOnClickListener = null;
        int transferViewModelNeedsApprovalViewVISIBLEViewGONE = 0;
        java.lang.String stateViewModelAverageSpeedText = null;
        java.lang.String stateViewModelPercentageText = null;
        org.monora.uprotocol.core.protocol.Client clientViewModelClient = null;
        java.lang.String stateViewModelOngoingJavaLangObjectNullTransferViewModelIsReceivingTransferTypeTextAndroidStringIncomingTransferTypeTextAndroidStringOutgoingStateViewModelOngoing = null;
        java.lang.String transferViewModelPercentageText = null;
        java.lang.String clientViewModelNickname = null;
        boolean transferViewModelFinished = false;
        boolean stateViewModelOngoingJavaLangObjectNull = false;
        int stateViewModelRunningStateViewModelProgressTransferViewModelProgress = 0;
        boolean transferViewModelWaitingApproval = false;
        int transferViewModelWaitingApprovalViewVISIBLEViewGONE = 0;
        int stateViewModelRunningStateViewModelTotalInt100 = 0;
        org.monora.uprotocol.client.android.viewmodel.content.ClientContentViewModel clientViewModel = mClientViewModel;
        boolean stateViewModelRunning = false;
        java.lang.String transferViewModelFinishedSpeedTextAndroidStringCompletedStateViewModelAverageSpeedText = null;
        boolean transferViewModelNeedsApproval = false;
        org.monora.uprotocol.client.android.viewmodel.content.TransferDetailContentViewModel transferViewModel = mTransferViewModel;
        boolean transferViewModelIsReceiving = false;
        int transferViewModelIcon = 0;
        org.monora.uprotocol.client.android.viewmodel.content.TransferStateContentViewModel stateViewModel = mStateViewModel;
        int transferViewModelProgress = 0;
        java.lang.String stateViewModelRunningStateViewModelPercentageTextTransferViewModelPercentageText = null;
        boolean TransferViewModelFinished1 = false;
        java.lang.String transferViewModelSizeText = null;
        int stateViewModelButtonIcon = 0;
        int stateViewModelProgress = 0;
        java.lang.String stateViewModelOngoing = null;
        java.lang.String transferViewModelIsReceivingTransferTypeTextAndroidStringIncomingTransferTypeTextAndroidStringOutgoing = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (clientViewModel != null) {
                    // read clientViewModel.client
                    clientViewModelClient = clientViewModel.getClient();
                    // read clientViewModel.nickname
                    clientViewModelNickname = clientViewModel.getNickname();
                }
        }
        if ((dirtyFlags & 0xeL) != 0) {


            if ((dirtyFlags & 0xaL) != 0) {

                    if (transferViewModel != null) {
                        // read transferViewModel::showPopupMenu
                        transferViewModelShowPopupMenuAndroidViewViewOnClickListener = (((mTransferViewModelShowPopupMenuAndroidViewViewOnClickListener == null) ? (mTransferViewModelShowPopupMenuAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mTransferViewModelShowPopupMenuAndroidViewViewOnClickListener).setValue(transferViewModel));
                        // read transferViewModel.waitingApproval
                        transferViewModelWaitingApproval = transferViewModel.getWaitingApproval();
                        // read transferViewModel.needsApproval
                        transferViewModelNeedsApproval = transferViewModel.getNeedsApproval();
                        // read transferViewModel.icon
                        transferViewModelIcon = transferViewModel.getIcon();
                        // read transferViewModel.sizeText
                        transferViewModelSizeText = transferViewModel.getSizeText();
                    }
                if((dirtyFlags & 0xaL) != 0) {
                    if(transferViewModelWaitingApproval) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
                if((dirtyFlags & 0xaL) != 0) {
                    if(transferViewModelNeedsApproval) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read transferViewModel.waitingApproval ? View.VISIBLE : View.GONE
                    transferViewModelWaitingApprovalViewVISIBLEViewGONE = ((transferViewModelWaitingApproval) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read transferViewModel.needsApproval ? View.VISIBLE : View.GONE
                    transferViewModelNeedsApprovalViewVISIBLEViewGONE = ((transferViewModelNeedsApproval) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                if (transferViewModel != null) {
                    // read transferViewModel.finished
                    TransferViewModelFinished1 = transferViewModel.isFinished();
                }
            if((dirtyFlags & 0xeL) != 0) {
                if(TransferViewModelFinished1) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
                if (stateViewModel != null) {
                    // read stateViewModel.running
                    stateViewModelRunning = stateViewModel.getRunning();
                    // read stateViewModel.ongoing
                    stateViewModelOngoing = stateViewModel.getOngoing();
                }
            if((dirtyFlags & 0xeL) != 0) {
                if(stateViewModelRunning) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x10000L;
                }
            }
            if((dirtyFlags & 0xcL) != 0) {
                if(stateViewModelRunning) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }

            if ((dirtyFlags & 0xaL) != 0) {

                    // read !transferViewModel.finished
                    transferViewModelFinished = !TransferViewModelFinished1;
            }

                // read stateViewModel.ongoing == null
                stateViewModelOngoingJavaLangObjectNull = (stateViewModelOngoing) == (null);
            if((dirtyFlags & 0xeL) != 0) {
                if(stateViewModelOngoingJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (stateViewModel != null) {
                        // read stateViewModel.buttonIcon
                        stateViewModelButtonIcon = stateViewModel.getButtonIcon();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2000L) != 0) {

                if (stateViewModel != null) {
                    // read stateViewModel.total
                    stateViewModelTotal = stateViewModel.getTotal();
                }
        }
        if ((dirtyFlags & 0x4000L) != 0) {

                if (stateViewModel != null) {
                    // read stateViewModel.averageSpeedText
                    stateViewModelAverageSpeedText = stateViewModel.getAverageSpeedText();
                }
        }
        if ((dirtyFlags & 0x20000L) != 0) {

                if (stateViewModel != null) {
                    // read stateViewModel.percentageText
                    stateViewModelPercentageText = stateViewModel.getPercentageText();
                }
        }
        if ((dirtyFlags & 0x10000L) != 0) {

                if (transferViewModel != null) {
                    // read transferViewModel.percentageText
                    transferViewModelPercentageText = transferViewModel.getPercentageText();
                }
        }
        if ((dirtyFlags & 0x80L) != 0) {

                if (transferViewModel != null) {
                    // read transferViewModel.isReceiving
                    transferViewModelIsReceiving = transferViewModel.isReceiving();
                }
            if((dirtyFlags & 0x80L) != 0) {
                if(transferViewModelIsReceiving) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read transferViewModel.isReceiving ? @android:string/incoming : @android:string/outgoing
                transferViewModelIsReceivingTransferTypeTextAndroidStringIncomingTransferTypeTextAndroidStringOutgoing = ((transferViewModelIsReceiving) ? (transferTypeText.getResources().getString(R.string.incoming)) : (transferTypeText.getResources().getString(R.string.outgoing)));
        }
        if ((dirtyFlags & 0x100L) != 0) {

                if (transferViewModel != null) {
                    // read transferViewModel.progress
                    transferViewModelProgress = transferViewModel.getProgress();
                }
        }
        if ((dirtyFlags & 0x200L) != 0) {

                if (stateViewModel != null) {
                    // read stateViewModel.progress
                    stateViewModelProgress = stateViewModel.getProgress();
                }
        }

        if ((dirtyFlags & 0xeL) != 0) {

                // read stateViewModel.ongoing == null ? transferViewModel.isReceiving ? @android:string/incoming : @android:string/outgoing : stateViewModel.ongoing
                stateViewModelOngoingJavaLangObjectNullTransferViewModelIsReceivingTransferTypeTextAndroidStringIncomingTransferTypeTextAndroidStringOutgoingStateViewModelOngoing = ((stateViewModelOngoingJavaLangObjectNull) ? (transferViewModelIsReceivingTransferTypeTextAndroidStringIncomingTransferTypeTextAndroidStringOutgoing) : (stateViewModelOngoing));
                // read stateViewModel.running ? stateViewModel.progress : transferViewModel.progress
                stateViewModelRunningStateViewModelProgressTransferViewModelProgress = ((stateViewModelRunning) ? (stateViewModelProgress) : (transferViewModelProgress));
                // read transferViewModel.finished ? @android:string/completed : stateViewModel.averageSpeedText
                transferViewModelFinishedSpeedTextAndroidStringCompletedStateViewModelAverageSpeedText = ((TransferViewModelFinished1) ? (speedText.getResources().getString(R.string.completed)) : (stateViewModelAverageSpeedText));
                // read stateViewModel.running ? stateViewModel.percentageText : transferViewModel.percentageText
                stateViewModelRunningStateViewModelPercentageTextTransferViewModelPercentageText = ((stateViewModelRunning) ? (stateViewModelPercentageText) : (transferViewModelPercentageText));
        }
        if ((dirtyFlags & 0xcL) != 0) {

                // read stateViewModel.running ? stateViewModel.total : 100
                stateViewModelRunningStateViewModelTotalInt100 = ((stateViewModelRunning) ? (stateViewModelTotal) : (100));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            org.monora.uprotocol.client.android.binding.UserProfileBindingsKt.loadPictureOfClient(this.image, clientViewModelClient);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.text, clientViewModelNickname);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.imageView4.setImageResource(transferViewModelIcon);
            this.optionsButton.setOnClickListener(transferViewModelShowPopupMenuAndroidViewViewOnClickListener);
            this.rejectButton.setVisibility(transferViewModelNeedsApprovalViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView15, transferViewModelSizeText);
            this.toggleButton.setEnabled(transferViewModelFinished);
            this.waitingApprovalText.setVisibility(transferViewModelWaitingApprovalViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.progressBar.setMax(stateViewModelRunningStateViewModelTotalInt100);
            this.toggleButton.setImageResource(stateViewModelButtonIcon);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.progressBar.setProgress(stateViewModelRunningStateViewModelProgressTransferViewModelProgress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.progressText, stateViewModelRunningStateViewModelPercentageTextTransferViewModelPercentageText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.speedText, transferViewModelFinishedSpeedTextAndroidStringCompletedStateViewModelAverageSpeedText);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transferTypeText, stateViewModelOngoingJavaLangObjectNullTransferViewModelIsReceivingTransferTypeTextAndroidStringIncomingTransferTypeTextAndroidStringOutgoingStateViewModelOngoing);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private org.monora.uprotocol.client.android.viewmodel.content.TransferDetailContentViewModel value;
        public OnClickListenerImpl setValue(org.monora.uprotocol.client.android.viewmodel.content.TransferDetailContentViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.showPopupMenu(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clientViewModel
        flag 1 (0x2L): transferViewModel
        flag 2 (0x3L): stateViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): transferViewModel.needsApproval ? View.VISIBLE : View.GONE
        flag 5 (0x6L): transferViewModel.needsApproval ? View.VISIBLE : View.GONE
        flag 6 (0x7L): stateViewModel.ongoing == null ? transferViewModel.isReceiving ? @android:string/incoming : @android:string/outgoing : stateViewModel.ongoing
        flag 7 (0x8L): stateViewModel.ongoing == null ? transferViewModel.isReceiving ? @android:string/incoming : @android:string/outgoing : stateViewModel.ongoing
        flag 8 (0x9L): stateViewModel.running ? stateViewModel.progress : transferViewModel.progress
        flag 9 (0xaL): stateViewModel.running ? stateViewModel.progress : transferViewModel.progress
        flag 10 (0xbL): transferViewModel.waitingApproval ? View.VISIBLE : View.GONE
        flag 11 (0xcL): transferViewModel.waitingApproval ? View.VISIBLE : View.GONE
        flag 12 (0xdL): stateViewModel.running ? stateViewModel.total : 100
        flag 13 (0xeL): stateViewModel.running ? stateViewModel.total : 100
        flag 14 (0xfL): transferViewModel.finished ? @android:string/completed : stateViewModel.averageSpeedText
        flag 15 (0x10L): transferViewModel.finished ? @android:string/completed : stateViewModel.averageSpeedText
        flag 16 (0x11L): stateViewModel.running ? stateViewModel.percentageText : transferViewModel.percentageText
        flag 17 (0x12L): stateViewModel.running ? stateViewModel.percentageText : transferViewModel.percentageText
        flag 18 (0x13L): transferViewModel.isReceiving ? @android:string/incoming : @android:string/outgoing
        flag 19 (0x14L): transferViewModel.isReceiving ? @android:string/incoming : @android:string/outgoing
    flag mapping end*/
    //end
}