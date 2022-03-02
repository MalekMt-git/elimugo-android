package ngo.dean.elimugo.domain.usecase

import ngo.dean.elimugo.domain.entites.Package
import ngo.dean.elimugo.domain.repository.PackageRepository

class GetPackagesUseCaseImpl(private val repository: PackageRepository) : GetPackagesUseCase {
    override suspend fun invoke(param: String, callBack: (result: ArrayList<Package>) -> Unit) {
        repository.getPackageWithQuery(param , callBack)
    }
}