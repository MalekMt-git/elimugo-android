package ngo.dean.elimugo.services.hotspot_server.server;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

import fi.iki.elonen.NanoHTTPD;

@Singleton
public class Server extends NanoHTTPD {
    private static final String TAG = "Server";
    public static final int PORT = 8080;

    @Inject
    public Server() {
        super(Server.PORT);

        Log.v(TAG, "Started...");
    }

    @Override
    public Response serve(IHTTPSession session) {
        Method method = session.getMethod();
        String uri = session.getUri();

        String msg = "<html><body><h1>Hello server</h1></body></html>";




        return newFixedLengthResponse(msg);
    }
}
