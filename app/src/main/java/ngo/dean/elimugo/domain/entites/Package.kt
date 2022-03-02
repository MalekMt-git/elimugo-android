package ngo.dean.elimugo.domain.entites

data class Package(
    val uniqueId: String,
    val descriptions: Descriptions,
    val type: String,
    val contentVersion: Int,
    val accessibility: Accessibility,
    val releaseDate: String,
    val size: Int,
)
