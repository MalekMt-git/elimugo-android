package ngo.dean.elimugo.fragments.home.download.status;

import android.app.Application;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ngo.dean.elimugo.repositories.ModuleRepository;
import ngo.dean.elimugo.repositories.models.ContentFile;
import ngo.dean.elimugo.repositories.models.ContentIndex;
import ngo.dean.elimugo.repositories.models.ContentModule;
import ngo.dean.elimugo.utils.validity_check.ValidityCheck;
import ngo.dean.elimugo.utils.xml.PackagesXml;

public class DownloadStatusViewModel extends AndroidViewModel {
    private static final String TAG = DownloadStatusViewModel.class.getSimpleName();
    private static final String URL = "https://www.elimupi.online/content/";
    ModuleRepository repository;

    private final List<Long> requestIds;
    private final MutableLiveData<Double> downloadProgress;
    int combinedModuleSize;

    public DownloadStatusViewModel(@NonNull Application application) {
        super(application);

        repository = new ModuleRepository(application, URL);
        requestIds = new ArrayList<>();
        downloadProgress = new MutableLiveData<>();

        getApplication().registerReceiver(onComplete, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
    }

    public LiveData<Double> getDownloadProgress() { return downloadProgress; }

    public void checkModuleValidity(ContentModule[] modules) {
        combinedModuleSize = 0;
        for (ContentModule module : modules) {
            MediatorLiveData<ValidityRequirements> mediator = new MediatorLiveData<>();
            MutableLiveData<ContentIndex> index = new MutableLiveData<>();
            MutableLiveData<ContentFile[]> files = new MutableLiveData<>();
            mediator.addSource(index, value -> {
                ValidityRequirements requirements = mediator.getValue();
                if (requirements == null) {
                    requirements = new ValidityRequirements();
                }
                requirements.index = value;
                mediator.setValue(requirements);
            });
            mediator.addSource(files, value -> {
                ValidityRequirements requirements = mediator.getValue();
                if (requirements == null) {
                    requirements = new ValidityRequirements();
                }
                requirements.files = value;
                mediator.setValue(requirements);
            });

            mediator.observeForever(value -> {
                if (value.index != null && value.files != null && ValidityCheck.isValid(value.index, value.files)) {
                    Log.d(TAG, String.format("Package %s is valid, starting download.", value.index.uniqueId));
                    downloadModule(value.index, value.files);
                    updatePackageXML(module);
                    combinedModuleSize += value.index.size.value;
                }
            });

            repository.getIndexXml(module.uniqueId, index);
            repository.getFilesXml(module.uniqueId, files);
        }
    }

    private void downloadModule(ContentIndex index, ContentFile[] files) {
        DownloadManager manager = (DownloadManager) getApplication().getSystemService(Context.DOWNLOAD_SERVICE);
        for (ContentFile file : files) {
            String moduleFilePath = String.format("%s/%s", index.uniqueId, file.path);
            Uri uri = Uri.parse(String.format("%s%s", URL, moduleFilePath));

            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setDestinationInExternalFilesDir(
                    getApplication().getApplicationContext(),
                    "content",
                    moduleFilePath
            );
            requestIds.add(manager.enqueue(request));
        }
    }

    private void updatePackageXML(ContentModule module) {
        if (!packageXMLFile().exists()) createPackageXML();
        addNewPackageXML(module);
    }

    private void createPackageXML() {
        String baseContent = "<Packages>\n</Packages>\n";
        writePackageXml(baseContent);
    }

    private void addNewPackageXML(ContentModule contentModule) {
        String current = readPackageXml();
        String updated = current.replace("</Packages>\n", "") +
                PackagesXml.serializeModule(contentModule) +
                "</Packages>\n";
        writePackageXml(updated);
    }

    private String readPackageXml() {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(packageXMLFile()))) {
            while(reader.ready()) stringBuilder.append(reader.readLine()).append("\n");
        } catch (IOException e) { e.printStackTrace(); }
        return stringBuilder.toString();
    }

    private void writePackageXml(String fileContent) {
        try (FileOutputStream stream = new FileOutputStream(packageXMLFile())) {
            stream.write(fileContent.getBytes());
        } catch (IOException e) { e.printStackTrace(); }
    }

    private File packageXMLFile() {
        return new File(getApplication().getApplicationContext().getExternalFilesDir("content"), "packages.xml");
    }

    BroadcastReceiver onComplete = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterByStatus(DownloadManager.STATUS_SUCCESSFUL);
            DownloadManager manager = (DownloadManager) getApplication().getSystemService(Context.DOWNLOAD_SERVICE);
            Cursor cursor = manager.query(query);
            int size = 0;
            while(cursor.moveToNext()) {
                Long id = cursor.getLong(cursor.getColumnIndex(DownloadManager.COLUMN_ID));
                if (requestIds.contains(id)) {
                    size += cursor.getInt(cursor
                            .getColumnIndex(DownloadManager.COLUMN_BYTES_DOWNLOADED_SO_FAR));
                }
            }
            cursor.close();

            Double percentageComplete = (double) size * 100 / combinedModuleSize;
            downloadProgress.setValue(percentageComplete);
        }
    };
}

class ValidityRequirements {
    public ContentIndex index;
    public ContentFile[] files;
}
