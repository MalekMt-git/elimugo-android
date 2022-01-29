package ngo.dean.elimugo.data.server

import android.app.DownloadManager
import android.content.Context
import android.content.Context.DOWNLOAD_SERVICE
import android.net.Uri
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import ngo.dean.elimugo.util.xml.XmlParser
import java.io.File


class Request {

    private val baseUrl = "https://www.elimupi.online/"
    private val contentsUrl = "${baseUrl}content"
    private lateinit var listOfPackages : ArrayList<Package>
    lateinit var listOfPackagesFilesUrls : ArrayList<ngo.dean.elimugo.data.server.File>

    fun query(context: Context, query: String, callBack: (result: ArrayList<Package>) -> Unit) {
        val queue = Volley.newRequestQueue(context)
        val url = baseUrl + query

        val packagesRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                listOfPackages = XmlParser().parsePackages(response.toByteArray().inputStream()) as ArrayList<Package>
                with(listOfPackages){
                    callBack(this)
                }
            },
            {
                Log.i("TAG", "$it : failed ")
            })

        queue.add(packagesRequest)
    }

    private fun queryFilesUrls(context: Context, query: String, callBack: (result: ArrayList<ngo.dean.elimugo.data.server.File>) -> Unit){
        val queue = Volley.newRequestQueue(context)
        val url = "$contentsUrl/$query/files.xml"

        val filesUrlsRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                listOfPackagesFilesUrls = XmlParser().parseFilesUrls(response.toByteArray().inputStream()) as ArrayList<ngo.dean.elimugo.data.server.File>
                with(listOfPackagesFilesUrls){
                    callBack(this)
                }
            },
            {
                Log.i("TAG", "$it : failed ")
            })
        queue.add(filesUrlsRequest)
    }
    fun download(listOfPackages: List<Package>, context: Context) {
        var link = ""
        val policy = ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        val appLanguage = context.resources.configuration.locale.language

        for (learnPackage in listOfPackages) {
            val folder = context.filesDir
            val f = File(folder, learnPackage.uniqueId)
            f.mkdir()

            queryFilesUrls(context , learnPackage.uniqueId){
                for (i in it){
                    link = "$contentsUrl/${learnPackage.uniqueId}/${i.url}"
                    val request = DownloadManager.Request(Uri.parse(link))
                    request.setTitle("${learnPackage.uniqueId} is Downloading")
                    request.setDescription("please be wait")
                    request.setDestinationInExternalFilesDir(context, "Public/"+learnPackage.uniqueId ,i.url )
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    val manager = context.getSystemService(DOWNLOAD_SERVICE) as DownloadManager?
                    manager!!.enqueue(request)
                }
            }
        }
    }

}
