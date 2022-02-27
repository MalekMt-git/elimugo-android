package ngo.dean.elimugo.data.server.usecase

interface GetPackagesUseCase : BaseUseCase<Package>  {
    override suspend fun invoke(param: String, callBack: (result: ArrayList<Package>) -> Unit)
}