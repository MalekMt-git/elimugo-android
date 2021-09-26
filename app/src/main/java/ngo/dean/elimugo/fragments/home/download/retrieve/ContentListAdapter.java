package ngo.dean.elimugo.fragments.home.download.retrieve;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import ngo.dean.elimugo.App;
import ngo.dean.elimugo.R;
import ngo.dean.elimugo.repositories.models.ContentModule;

public class ContentListAdapter extends RecyclerView.Adapter<ContentListAdapter.ViewHolder> {

    private MutableLiveData<ContentModule[]> data;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView sizeTextView;
        private final TextView updateTextView;
        private final CheckBox checkbox;
        
        public ViewHolder(View view) {
            super(view);

            checkbox = view.findViewById(R.id.contentCheckBox);
            sizeTextView = view.findViewById(R.id.sizeTextView);
            updateTextView = view.findViewById(R.id.updateTextView);
        }

        public CheckBox getContentCheckbox() {
            return checkbox;
        }

        public TextView getSizeTextView() {
            return sizeTextView;
        }

        public TextView getUpdateTextView() {
            return updateTextView;
        }
    }

    public ContentListAdapter(ContentModule[] data) {
        this.data = new MutableLiveData<>();
        this.data.setValue(data);
    }

    public LiveData<ContentModule[]> getData() {
        return this.data;
    }

    public void update(ContentModule[] data) {
        this.data.setValue(data);
        this.notifyDataSetChanged();
    }

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.content_row_retrieve_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, final int position) {
        ContentModule[] dataValue = this.data.getValue();
        if (dataValue.length > position) {
            CheckBox checkbox = viewHolder.getContentCheckbox();
            checkbox.setChecked(dataValue[position].isToggled);
            checkbox.setText(dataValue[position].descriptions.getDescriptionByLocale(App.LOCALE));
            viewHolder.getSizeTextView().setText(dataValue[position].size.asHumanReadable());
            if (dataValue[position].isUpdate) {
                viewHolder.getUpdateTextView().setVisibility(View.VISIBLE);
            }

            checkbox.setOnClickListener(view -> {
                dataValue[position].isToggled = ((CheckBox) view).isChecked();
                data.setValue(dataValue);
                notifyItemChanged(position);
            });
        }
    }

    @Override
    public int getItemCount() {
        return Objects.requireNonNull(data.getValue()).length;
    }
}
