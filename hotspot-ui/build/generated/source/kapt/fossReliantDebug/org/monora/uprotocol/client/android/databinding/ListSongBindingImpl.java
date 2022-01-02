package org.monora.uprotocol.client.android.databinding;
import org.monora.uprotocol.client.android.R;
import org.monora.uprotocol.client.android.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListSongBindingImpl extends ListSongBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.selection, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListSongBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ListSongBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.icon.setTag(null);
        this.layout.setTag(null);
        this.secondaryText.setTag(null);
        this.thumbnail.setTag(null);
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
            setViewModel((org.monora.uprotocol.client.android.fragment.content.SongContentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.monora.uprotocol.client.android.fragment.content.SongContentViewModel ViewModel) {
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
        android.net.Uri viewModelAlbumUri = null;
        org.monora.uprotocol.client.android.fragment.content.SongContentViewModel viewModel = mViewModel;
        java.lang.String viewModelTitle = null;
        java.lang.String viewModelArtist = null;
        java.lang.String viewModelMimeType = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.albumUri
                    viewModelAlbumUri = viewModel.getAlbumUri();
                    // read viewModel.title
                    viewModelTitle = viewModel.getTitle();
                    // read viewModel.artist
                    viewModelArtist = viewModel.getArtist();
                    // read viewModel.mimeType
                    viewModelMimeType = viewModel.getMimeType();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            org.monora.uprotocol.client.android.binding.ContentBindingsKt.loadIconOf(this.icon, viewModelMimeType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondaryText, viewModelArtist);
            org.monora.uprotocol.client.android.binding.ContentBindingsKt.loadThumbnailOf(this.thumbnail, viewModelAlbumUri);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, viewModelTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}