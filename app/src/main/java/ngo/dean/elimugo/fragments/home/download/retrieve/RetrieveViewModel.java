package ngo.dean.elimugo.fragments.home.download.retrieve;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import ngo.dean.elimugo.repositories.PackageRepository;
import ngo.dean.elimugo.repositories.models.ContentModule;


public class RetrieveViewModel extends AndroidViewModel {

    private final MutableLiveData<ContentModule[]> contentPackages;

    public RetrieveViewModel(@NonNull Application application) {
        super(application);
        contentPackages = new MutableLiveData<>();

        PackageRepository repository = new PackageRepository(application, "https://www.elimupi.online/content/");
        repository.getPackagesXml(contentPackages);
    }

    public LiveData<ContentModule[]> getContentPackages() { return contentPackages; }

}
