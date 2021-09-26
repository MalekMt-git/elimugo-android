package ngo.dean.elimugo.fragments.home.download.retrieve;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Arrays;
import java.util.Objects;

import ngo.dean.elimugo.R;
import ngo.dean.elimugo.repositories.models.ContentModule;
import ngo.dean.elimugo.repositories.models.ParcelableContentModule;

public class RetrieveFragment extends Fragment {
    private static final String TAG = "RetrieveFragment";

    private RetrieveViewModel viewModel;
    private ContentListAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_retrieve, container, false);

        bindViewModel(root);

        return root;
    }

    private void bindViewModel(View root) {
        viewModel = new ViewModelProvider(this).get(RetrieveViewModel.class);

        RecyclerView recyclerView = root.findViewById(R.id.retrievePackageList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ContentListAdapter(new ContentModule[0]);
        recyclerView.setAdapter(adapter);
        viewModel.getContentPackages().observe(getViewLifecycleOwner(), contentPackages -> {
            adapter.update(contentPackages);
        });

        final FloatingActionButton navigate = root.findViewById(R.id.downloadContent);
        navigate.setOnClickListener(view -> {
            ContentModule[] packages = getToggled(Objects.requireNonNull(viewModel.getContentPackages().getValue()));
            ParcelableContentModule[] parcelableContentModules = Arrays.stream(packages).map(ParcelableContentModule::new).toArray(ParcelableContentModule[]::new);
            RetrieveFragmentDirections.ActionNavRetrieveToStatus action = RetrieveFragmentDirections.actionNavRetrieveToStatus(parcelableContentModules);
            Navigation.findNavController(root).navigate(action);
        });

        adapter.getData().observe(getViewLifecycleOwner(), contentPackages ->
                navigate.setVisibility((getToggled(contentPackages).length > 0) ? View.VISIBLE : View.INVISIBLE));
    }

    private ContentModule[] getToggled(ContentModule[] modules) {
        return Arrays.stream(modules)
                .map( p -> p.isToggled ? p : null)
                .filter(Objects::nonNull).toArray(ContentModule[]::new);
    }

}
