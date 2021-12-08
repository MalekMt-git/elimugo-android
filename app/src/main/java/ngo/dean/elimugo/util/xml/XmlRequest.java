package ngo.dean.elimugo.util.xml;

import androidx.annotation.Nullable;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;

public class XmlRequest<T extends XmlObject> extends Request<T> {

    private final Response.Listener<T> listener;
    private final Class<T> type;

    public XmlRequest(String url, Class<T> type, Response.Listener<T> listener, @Nullable Response.ErrorListener error) {
        super(Method.GET, url, error);

        this.type = type;
        this.listener = listener;
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        try {
            String xml = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            T xmlObject = type.newInstance();
            xmlObject.deserialize(xml);

            return Response.success(xmlObject, HttpHeaderParser.parseCacheHeaders(response));
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    protected void deliverResponse(T response) {
        listener.onResponse(response);
    }

}
