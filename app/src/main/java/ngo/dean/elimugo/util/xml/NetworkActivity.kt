package ngo.dean.elimugo.util.xml

import StackOverflowXmlParser
import android.app.Activity
import android.os.AsyncTask
import android.preference.PreferenceManager
import android.util.Log
import ngo.dean.elimugo.R
import org.xmlpull.v1.XmlPullParserException
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

class NetworkActivity {
    @Throws(IOException::class)
     fun downloadUrl(urlString: String): InputStream? {
        val url = URL(urlString)
        return (url.openConnection() as? HttpURLConnection)?.run {
            readTimeout = 10000
            connectTimeout = 15000
            requestMethod = "GET"
            doInput = true
            // Starts the query
            connect()
            inputStream
        }
    }
}