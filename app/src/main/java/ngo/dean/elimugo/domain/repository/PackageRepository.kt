package ngo.dean.elimugo.domain.repository

import androidx.compose.runtime.MutableState
import ngo.dean.elimugo.domain.entites.File
import ngo.dean.elimugo.domain.entites.Package

interface PackageRepository  {
    suspend fun getPackageWithQuery(query: String , callBack: (result: ArrayList<Package>) -> Unit)
    suspend fun getFilesUrls(query: String , callBack: (result: ArrayList<File>) -> Unit)
    fun downloadPackages(listOfPackages: List<Package>, progress: MutableState<Float>)
    fun downloader(fileName: String, title : String? = null, description :String? = null, path : String, subPath: String , progress: MutableState<Float>? = null)
}