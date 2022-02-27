package ngo.dean.elimugo.data.server.repository

interface PackageRepository  {
    suspend fun getPackageWithQuery(query: String , callBack: (result: ArrayList<Package>) -> Unit)
}