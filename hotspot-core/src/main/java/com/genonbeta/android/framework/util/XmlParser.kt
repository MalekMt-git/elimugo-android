package com.genonbeta.android.framework.util

import android.util.Xml
import com.genonbeta.android.framework.entites.Accessibility
import com.genonbeta.android.framework.entites.Descriptions
import com.genonbeta.android.framework.entites.File
import com.genonbeta.android.framework.entites.Package
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException
import java.io.IOException
import java.io.InputStream

class XmlParser {


    @Throws(XmlPullParserException::class, IOException::class)
    fun parseFilesUrls(inputStream: InputStream): ArrayList<File> {
        inputStream.use { inputStream ->
            val parser: XmlPullParser = Xml.newPullParser()
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false)
            parser.setInput(inputStream, null)
            parser.nextTag()
            return readFilesUrl(parser)
        }
    }

    @Throws(XmlPullParserException::class, IOException::class)
    private fun readFilesUrl(parser: XmlPullParser): ArrayList<File> {
        val filesUrl = ArrayList<File>()
        parser.require(XmlPullParser.START_TAG, null, "Files")
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }
            if (parser.name == "File") {
                filesUrl.add(readFilesUrls(parser))
            } else {
                skip(parser)
            }
        }
        return filesUrl
    }

    @Throws(XmlPullParserException::class, IOException::class)
    private fun readFilesUrls(parser: XmlPullParser): File {
        return readFile(parser)
    }

    @Throws(IOException::class, XmlPullParserException::class)
    private fun readFile(parser: XmlPullParser): File {
        parser.require(XmlPullParser.START_TAG, null, "File")
        val size = parser.getAttributeValue(0)
        val url =  readText(parser)
        return File(size.toInt(),url)
    }

    @Throws(XmlPullParserException::class, IOException::class)
    fun parsePackages(inputStream: InputStream): List<Package> {
        inputStream.use { inputStream ->
            val parser: XmlPullParser = Xml.newPullParser()
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false)
            parser.setInput(inputStream, null)
            parser.nextTag()
            return readPackages(parser)
        }
    }

    @Throws(XmlPullParserException::class, IOException::class)
    private fun readPackages(parser: XmlPullParser): List<Package> {
        val packages = mutableListOf<Package>()

        parser.require(XmlPullParser.START_TAG, null, "Packages")
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }
            // Starts by looking for the entry tag
            if (parser.name == "Package") {
                packages.add(readPackage(parser))
            } else {
                skip(parser)
            }
        }
        return packages
    }

    @Throws(XmlPullParserException::class, IOException::class)
    private fun readPackage(parser: XmlPullParser): Package {
        parser.require(XmlPullParser.START_TAG, null, "Package")
        var uniqueId: String = ""
        var descriptions: Descriptions = Descriptions("" , "")
        var type: String = ""
        var contentVersion: Int = 0
        var accessibility: Accessibility = Accessibility.PRIVATE
        var releaseDate: String = ""
        var size: Int = 0
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }
            when (parser.name) {
                "UniqueId" -> uniqueId = readUniqueId(parser)
                "Descriptions" -> descriptions = readDescriptions(parser)
                "Type" -> type = readType(parser)
                "ContentVersion" -> contentVersion = readContentVersion(parser)
                "Accessibility" -> accessibility = readAccessibility(parser)
                "ReleaseDate" -> releaseDate = readReleaseDate(parser)
                "Size" -> size = readSize(parser)
                else -> skip(parser)
            }
        }
        return Package(uniqueId, descriptions, type,contentVersion,accessibility,releaseDate,size)
    }

    @Throws(IOException::class, XmlPullParserException::class)
    private fun readUniqueId(parser: XmlPullParser): String {
        parser.require(XmlPullParser.START_TAG, null, "UniqueId")
        val title = readText(parser)
        parser.require(XmlPullParser.END_TAG, null, "UniqueId")
        return title
    }

    @Throws(IOException::class, XmlPullParserException::class)
    private fun readDescriptions(parser: XmlPullParser): Descriptions {
        var en = ""
        var sw = ""
        parser.require(XmlPullParser.START_TAG, null, "Descriptions")
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }
                parser.require(XmlPullParser.START_TAG, null, "Description")
                val lang = parser.getAttributeValue(0)
                if (lang == "en"){
                    en = readText(parser)
                }else if (lang == "sw"){
                    sw = readText(parser)
                }
        }
        return Descriptions(en,sw)
    }
    // Processes link tags in the feed.
    @Throws(IOException::class, XmlPullParserException::class)
    private fun readType(parser: XmlPullParser): String {
        parser.require(XmlPullParser.START_TAG, null, "Type")
        var type = readText(parser)
        parser.require(XmlPullParser.END_TAG, null, "Type")
        return type
    }

    private fun readContentVersion(parser: XmlPullParser): Int {
        parser.require(XmlPullParser.START_TAG, null, "ContentVersion")
        var size = readText(parser)
        parser.require(XmlPullParser.END_TAG, null, "ContentVersion")
        return size.toInt()
    }

    private fun readAccessibility(parser: XmlPullParser): Accessibility {
        parser.require(XmlPullParser.START_TAG, null, "Accessibility")
        var accessibility = readText(parser)
        parser.require(XmlPullParser.END_TAG, null, "Accessibility")
        return if (accessibility == "Public") Accessibility.PUBLIC else Accessibility.PRIVATE
    }

    private fun readReleaseDate(parser: XmlPullParser): String {
        parser.require(XmlPullParser.START_TAG, null, "ReleaseDate")
        var size = readText(parser)
        parser.require(XmlPullParser.END_TAG, null, "ReleaseDate")
        return size
    }

    private fun readSize(parser: XmlPullParser): Int {
        parser.require(XmlPullParser.START_TAG, null, "Size")
        var size = readText(parser)
        parser.require(XmlPullParser.END_TAG, null, "Size")
        return size.toInt()
    }
    // For the tags title and summary, extracts their text values.
    @Throws(IOException::class, XmlPullParserException::class)
    private fun readText(parser: XmlPullParser): String {
        var result = ""
        if (parser.next() == XmlPullParser.TEXT) {
            result = parser.text
            parser.nextTag()
        }
        return result
    }

    @Throws(XmlPullParserException::class, IOException::class)
    private fun skip(parser: XmlPullParser) {
        if (parser.eventType != XmlPullParser.START_TAG) {
            throw IllegalStateException()
        }
        var depth = 1
        while (depth != 0) {
            when (parser.next()) {
                XmlPullParser.END_TAG -> depth--
                XmlPullParser.START_TAG -> depth++
            }
        }
    }

}