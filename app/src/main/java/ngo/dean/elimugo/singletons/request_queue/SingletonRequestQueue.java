package ngo.dean.elimugo.singletons.request_queue;

import android.annotation.SuppressLint;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class SingletonRequestQueue {

    // Context should only ever be the ApplicationContext, which does not leak
    @SuppressLint("StaticFieldLeak")
    private static SingletonRequestQueue instance;
    @SuppressLint("StaticFieldLeak")
    private static Context applicationContext;

    private RequestQueue requestQueue;

    private SingletonRequestQueue(Context applicationContext) {
        SingletonRequestQueue.applicationContext = applicationContext;
        requestQueue = getRequestQueue();
    }

    public static synchronized SingletonRequestQueue getInstance(Context context) {
        if (instance == null) {
            instance = new SingletonRequestQueue(context);
        }
        return instance;
    }

    public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
            requestQueue = Volley.newRequestQueue(applicationContext.getApplicationContext());
        }
        return requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> request) {
        getRequestQueue().add(request);
    }
}
