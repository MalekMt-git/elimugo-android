package ngo.dean.elimugo.fragments.home.explore;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import ngo.dean.elimugo.repositories.models.ContentModule;
import ngo.dean.elimugo.utils.xml.PackagesXml;

public class ExploreViewModel extends AndroidViewModel {
    private MutableLiveData<ContentModule[]> modules;

    public ExploreViewModel(Application application) {
        super(application);

        modules = new MutableLiveData<>(parsePackages());
    }

    public LiveData<ContentModule[]> getContentModules() {
        return modules;
    }

    private ContentModule[] parsePackages() {
        PackagesXml packages = new PackagesXml();
        packages.deserialize(readPackageXml());
        return packages.values;
    }

    private String readPackageXml() {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(packageXMLFile()))) {
            while(reader.ready()) stringBuilder.append(reader.readLine()).append("\n");
        } catch (IOException e) { e.printStackTrace(); }
        return stringBuilder.toString();
    }

    private File packageXMLFile() {
        return new File(getApplication().getApplicationContext().getExternalFilesDir("content"), "packages.xml");
    }
}


enum ModuleTypes {
    APK,
    HTML
}