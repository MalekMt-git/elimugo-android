package ngo.dean.elimugo.domain.usecase

import ngo.dean.elimugo.domain.entites.Package

interface GetPackagesUseCase : BaseUseCase<Package> {
    override suspend fun invoke(param: String, callBack: (result: ArrayList<Package>) -> Unit)
}