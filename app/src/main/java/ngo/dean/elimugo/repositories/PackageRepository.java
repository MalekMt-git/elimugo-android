/*
package ngo.dean.elimugo.repositories;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import ngo.dean.elimugo.repositories.models.ContentModule;
import ngo.dean.elimugo.util.xml.PackagesXml;

public class PackageRepository extends BaseRepository{

    public PackageRepository(Application application, String url) {
        super(application, url, ModuleRepository.class.getName());
    }

    public void getPackagesXml(MutableLiveData<ContentModule[]> liveData) {
        requestXML(
                String.format("%s/packages.xml", url),
                PackagesXml.class,
                response -> liveData.setValue(response.values),
                error -> {}
        );
    }

}
*/
