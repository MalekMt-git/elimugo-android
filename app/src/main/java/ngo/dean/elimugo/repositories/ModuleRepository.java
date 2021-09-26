package ngo.dean.elimugo.repositories;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import ngo.dean.elimugo.repositories.models.ContentIndex;
import ngo.dean.elimugo.repositories.models.ContentFile;
import ngo.dean.elimugo.utils.xml.FilesXml;
import ngo.dean.elimugo.utils.xml.IndexXml;

public class ModuleRepository extends BaseRepository {

    public ModuleRepository(Application application, String url) {
        super(application, url, ModuleRepository.class.getName());
    }

    public void getIndexXml(String moduleName, MutableLiveData<ContentIndex> liveData) {
        requestXML(
                String.format("%s/%s/index.xml", url, moduleName),
                IndexXml.class,
                response -> liveData.setValue(response.values),
                error -> {}
        );
    }

    public void getFilesXml(String moduleName, MutableLiveData<ContentFile[]> liveData) {
        requestXML(
            String.format("%s/%s/files.xml", url, moduleName),
            FilesXml.class,
            response -> liveData.setValue(response.values),
            error -> {}
        );
    }

}
