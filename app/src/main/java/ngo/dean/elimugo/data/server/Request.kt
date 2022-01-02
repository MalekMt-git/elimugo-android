package ngo.dean.elimugo.data.server

import android.app.DownloadManager
import android.content.Context
import android.content.Context.DOWNLOAD_SERVICE
import android.net.Uri
import android.os.Environment
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.provider.Settings.Global.getString
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import ngo.dean.elimugo.util.xml.XmlParser


class Request {

    private val baseUrl = "https://www.elimupi.online/"
    private val contentsUrl = "${baseUrl}content"
    lateinit var listOfPackages : ArrayList<Package>
    fun query(context: Context, query: String, callBack: (result: ArrayList<Package>) -> Unit) {


        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(context)
        val url = baseUrl + query

        // Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                listOfPackages = XmlParser().parse(response.toByteArray().inputStream()) as ArrayList<Package>
                with(listOfPackages){
                    callBack(this)
                }
            },
            {
                Log.i("TAG", "$it : failed ")
            })

// Add the request to the RequestQueue.
        queue.add(stringRequest)
    }

    fun download(listOfPackages: List<Package>, context: Context) {
        var link = ""
        val policy = ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        val appLanguage = context.getSharedPreferences(
            getString(context.contentResolver ,context.resources.getString(ngo.dean.elimugo.R.string.app_name)), Context.MODE_PRIVATE).getString(context.resources.getString(
            ngo.dean.elimugo.R.string.shared_pref_app_language) , "en")

        for (learnPackage in listOfPackages) {
            if (learnPackage.type == "Html"){
            link = "$contentsUrl/${learnPackage.uniqueId}/$appLanguage/index.html"
            }else if (learnPackage.type == "Apk"){
            link = "$contentsUrl/${learnPackage.uniqueId}/example.apk"
            }
            val request = DownloadManager.Request(Uri.parse(link))
            request.setTitle("${learnPackage.uniqueId} is Downloading")
            request.setDescription("please be wait")
            request.setDestinationInExternalFilesDir(context, "Elimugo" ,"${learnPackage.uniqueId}.${learnPackage.type}" )
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            val manager = context.getSystemService(DOWNLOAD_SERVICE) as DownloadManager?
            manager!!.enqueue(request)

        }
    }

}
