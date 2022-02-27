package ngo.dean.elimugo.data.server.usecase

interface BaseUseCase<T : Any> {
    suspend operator fun invoke(param : String, callBack: (result: ArrayList<T>) -> Unit)
}