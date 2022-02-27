package ngo.dean.elimugo.data.server.usecase

import ngo.dean.elimugo.data.server.repository.PackageRepository

class GetPackagesUseCaseImpl(private val packageRepository: PackageRepository) : GetPackagesUseCase {
    override suspend fun invoke(param: String, callBack: (result: ArrayList<Package>) -> Unit) {
        packageRepository.getPackageWithQuery(param , callBack)
    }
}