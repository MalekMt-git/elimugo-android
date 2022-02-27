package ngo.dean.elimugo.data.server.entites

import ngo.dean.elimugo.data.server.Accessibility

data class Package(
    val uniqueId: String,
    val descriptions: Descriptions,
    val type: String,
    val contentVersion: Int,
    val accessibility: Accessibility,
    val releaseDate: String,
    val size: Int,
)
