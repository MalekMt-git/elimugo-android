package ngo.dean.elimugo.fragments.home.explore;

import androidx.lifecycle.ViewModelProvider;

import android.Manifest;
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

import ngo.dean.elimugo.R;
import ngo.dean.elimugo.repositories.models.ContentModule;
import ngo.dean.elimugo.repositories.models.ParcelableContentModule;

public class ExploreFragment extends Fragment implements OnClickListener {

    private ExploreViewModel viewModel;
    private ContentListAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_explore, container, false);

        bindViewModel(root);
        requestPermissions(new String[] { Manifest.permission.READ_EXTERNAL_STORAGE }, 0);
        requestPermissions(new String[] { Manifest.permission.INTERNET }, 0);

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void bindViewModel(View root) {
        viewModel = new ViewModelProvider(this).get(ExploreViewModel.class);

        RecyclerView recyclerView = root.findViewById(R.id.explorePackageList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ContentListAdapter(new ContentModule[0], this);
        recyclerView.setAdapter(adapter);
        viewModel.getContentModules().observe(getViewLifecycleOwner(),
                contentPackages -> adapter.update(contentPackages));
    }

    @Override
    public void onClick(View view, ContentModule module) {
        ParcelableContentModule parcelableContentModule = new ParcelableContentModule(module);
        ExploreFragmentDirections.ActionNavExploreToHtml action = ExploreFragmentDirections.actionNavExploreToHtml(parcelableContentModule);
        Navigation.findNavController(view).navigate(action);
    }
}