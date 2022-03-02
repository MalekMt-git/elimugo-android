package ngo.dean.elimugo.data.server.api

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
import kotlinx.coroutines.runBlocking
import ngo.dean.elimugo.domain.entites.Package
import ngo.dean.elimugo.domain.repository.PackageRepository
import ngo.dean.elimugo.util.xml.XmlParser
import java.io.File

class Requests(var context: Context) : PackageRepository {

    private val baseUrl = "https://www.elimupi.online/"
    private val contentsUrl = "${baseUrl}content"
    private lateinit var listOfPackages : ArrayList<Package>
    lateinit var listOfPackagesFilesUrls : ArrayList<ngo.dean.elimugo.domain.entites.File>

    override fun downloadPackages(listOfPackages: List<Package>) {
        var fileName = ""
        val policy = ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)

        downloader("packages.xml", path = "Public/" , subPath ="packages.xml" )

        for (learnPackage in listOfPackages) {
            val folder = context.filesDir
            val f = File(folder, learnPackage.uniqueId)
            f.mkdir()
            runBlocking {
                getFilesUrls(learnPackage.uniqueId){
                    for (i in it){
                        fileName = "${learnPackage.uniqueId}/${i.url}"
                        downloader(fileName = fileName ,
                            title = "${learnPackage.uniqueId} is Downloading",
                            description= "please be wait",
                            path =  "Public/"+learnPackage.uniqueId,subPath = i.url)
                    }
                }
            }
        }
    }

    override fun downloader(fileName: String, title : String?, description :String?, path : String, subPath: String){
        val oldFile = File(context.getExternalFilesDir("Public") , fileName)
        if (oldFile.exists()){
            oldFile.canonicalFile.delete()
        }
        val request = DownloadManager.Request(Uri.parse("$contentsUrl/$fileName")).apply {
            setTitle(title)
            setDescription(description)
            setDestinationInExternalFilesDir(context, path ,subPath )
            setNotificationVisibility(DownloadManager.Request.VISIBILITY_HIDDEN)
        }
        val manager = context.getSystemService(DOWNLOAD_SERVICE) as DownloadManager?
        manager!!.enqueue(request)
    }

    override suspend fun getPackageWithQuery(
        query: String,
        callBack: (result: ArrayList<Package>) -> Unit
    ) {
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

    override suspend fun getFilesUrls(
        query: String,
        callBack: (result: ArrayList<ngo.dean.elimugo.domain.entites.File>) -> Unit
    ) {
        val queue = Volley.newRequestQueue(context)
        val url = "$contentsUrl/$query/files.xml"

        val filesUrlsRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                listOfPackagesFilesUrls = XmlParser().parseFilesUrls(response.toByteArray().inputStream()) as ArrayList<ngo.dean.elimugo.domain.entites.File>
                with(listOfPackagesFilesUrls){
                    callBack(this)
                }
            },
            {
                Log.i("TAG", "$it : failed ")
            })
        queue.add(filesUrlsRequest)
    }
}