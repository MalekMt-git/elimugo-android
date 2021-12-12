package ngo.dean.elimugo.data.server

import android.app.Activity
import android.app.DownloadManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Context.DOWNLOAD_SERVICE
import android.content.Intent
import android.content.IntentFilter
import android.net.Uri
import android.os.Environment
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.util.Log
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.net.toUri
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.io.File
import java.io.FileOutputStream
import java.net.URI
import java.net.URL
import java.util.regex.Matcher
import java.util.regex.Pattern


class Request {

    private val baseUrl = "https://www.elimupi.online/"
    private val contentsUrl = "https://www.elimupi.online/content"
    private var responseData = ""
    fun query(context: Context, query: String, callBack: (result: ArrayList<String>?) -> Unit) {


        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(context)
        val url = baseUrl + query

        // Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->

                responseData = response

                patternMatcher(response, "UniqueId") {
                    callBack(it)
                }

            },
            {
                Log.i("TAG", "$it : failed ")
            })

// Add the request to the RequestQueue.
        queue.add(stringRequest)
    }

    fun download(learnPackagesArrayList: ArrayList<String>, context: Context) {
        val policy = ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        patternMatcher(responseData, "Type") {

        for (learnPackage in learnPackagesArrayList) {
            val link = "$contentsUrl/$learnPackage/en/index.html"
            val request = DownloadManager.Request(Uri.parse(link))
            request.setTitle("$learnPackage is Downloading")
            request.setDescription("please be wait ")
            request.setDestinationInExternalFilesDir(context, Environment.DIRECTORY_DOCUMENTS ,"$learnPackage.html" )
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            val manager = context.getSystemService(DOWNLOAD_SERVICE) as DownloadManager?
            manager!!.enqueue(request)

        }

        }


    }

    private fun patternMatcher(
        input: String,
        pattern: String,
        callback: (ArrayList<String>) -> Unit
    ) {
        val pattern: Pattern = Pattern.compile("<$pattern>(.*?)</$pattern>", Pattern.DOTALL)
        val matcher: Matcher = pattern.matcher(input)
        val uniqueIds = ArrayList<String>()
        while (matcher.find()) {
            uniqueIds.add(matcher.group(1))
        }
        callback(uniqueIds)
    }
}
