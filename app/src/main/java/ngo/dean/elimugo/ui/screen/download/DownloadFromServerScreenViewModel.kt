package ngo.dean.elimugo.ui.screen.download

import androidx.lifecycle.ViewModel
import ngo.dean.elimugo.data.server.repository.PackageRepository

class DownloadFromServerScreenViewModel(private val repository: PackageRepository,
) : ViewModel() {
    GetPackagesUseCaseImpl()
}