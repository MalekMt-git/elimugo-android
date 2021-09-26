package ngo.dean.elimugo.fragments.home.explore;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import ngo.dean.elimugo.App;
import ngo.dean.elimugo.R;
import ngo.dean.elimugo.repositories.models.ContentModule;

public class ContentListAdapter extends RecyclerView.Adapter<ContentListAdapter.ViewHolder> {

    private final MutableLiveData<ContentModule[]> data;
    private final OnClickListener listener;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView title;
        
        public ViewHolder(View view) {
            super(view);

            title = view.findViewById(R.id.title);
        }

        public TextView getTitle() {
            return title;
        }
    }

    public ContentListAdapter(ContentModule[] data, OnClickListener listener) {
        this.data = new MutableLiveData<>();
        this.data.setValue(data);
        this.listener = listener;
    }

    public void update(ContentModule[] data) {
        this.data.setValue(data);
        this.notifyDataSetChanged();
    }

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.content_row_explore_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NotNull ViewHolder viewHolder, final int position) {
        ContentModule[] dataValue = this.data.getValue();
        if (dataValue.length > position) {
            String title = dataValue[position].descriptions.getDescriptionByLocale(App.LOCALE);
            viewHolder.getTitle().setText(title);
            viewHolder.getTitle().setOnClickListener(view -> listener.onClick(view, dataValue[position]));
        }
    }

    @Override
    public int getItemCount() {
        return Objects.requireNonNull(data.getValue()).length;
    }
}
