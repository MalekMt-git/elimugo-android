package ngo.dean.elimugo.domain.usecase

import android.content.Context
import ngo.dean.elimugo.domain.entites.Package
import java.io.File

class PackageUseCase {
    fun getListOfNewPackages(
        onlinePackageList: ArrayList<Package>,
        localPackageList: ArrayList<Package>,
        context: Context
    ): ArrayList<Package> {
        val directory = File(context.getExternalFilesDir(null), "Public")
        val files: Array<File> = directory.listFiles() as Array<File>
        val extraPackages = ArrayList<Package>()
        for (onlinePackage in onlinePackageList) {
            for (localPackage in localPackageList) {
                if (onlinePackage.uniqueId == localPackage.uniqueId) {
                    if (onlinePackage.contentVersion <= localPackage.contentVersion) {
                        for (file in files){
                            if (file.name == onlinePackage.uniqueId){
                                extraPackages.add(onlinePackage)
                            }
                        }
                    }
                }
            }
        }
        onlinePackageList.removeAll(extraPackages.toSet())
        return onlinePackageList
    }
}