package ngo.dean.elimugo.repositories;

import android.app.Application;

import androidx.annotation.Nullable;

import com.android.volley.Response;

import ngo.dean.elimugo.singletons.request_queue.SingletonRequestQueue;
import ngo.dean.elimugo.util.xml.XmlObject;
import ngo.dean.elimugo.util.xml.XmlRequest;


public abstract class BaseRepository {

    private final String TAG;
    protected SingletonRequestQueue queue;
    protected final String url;

    protected BaseRepository(Application application, String url, String queueTag) {
        queue = SingletonRequestQueue.getInstance(application.getApplicationContext());
        this.url = url;
        this.TAG = queueTag;
    }

    public <T extends XmlObject> void requestXML(String url, Class<T> type, Response.Listener<T> response, @Nullable Response.ErrorListener error) {
        XmlRequest<T> request = new XmlRequest<>(url, type, response, error);
        request.setTag(TAG);
        queue.addToRequestQueue(request);
    }

}
