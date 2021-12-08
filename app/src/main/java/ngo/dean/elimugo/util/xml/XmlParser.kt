package ngo.dean.elimugo.util.xml

import android.util.Xml
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import ngo.dean.elimugo.repositories.models.FileSize
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL

private val ns: String? = null

class XmlParser() {

    @Throws(XmlPullParserException::class, IOException::class)
    fun parse(inputStream: InputStream): List<*> {
        inputStream.use { inputStream ->
            val parser: XmlPullParser = Xml.newPullParser()
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false)
            parser.setInput(inputStream, null)
            parser.nextTag()
            return getPackagesData(parser)
        }
    }

    @Throws(XmlPullParserException::class, IOException::class)
    private fun getPackagesData(parser: XmlPullParser): List<Package> {
        val entries = mutableListOf<Package>()

        parser.require(XmlPullParser.START_TAG, ns, "Packages")
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.eventType != XmlPullParser.START_TAG) {
                continue
            }
            // Starts by looking for the entry tag
            if (parser.name == "Package") {
                entries.add(readEntry(parser))
            } else {
                skip(parser)
            }
        }
        return entries
    }
}

data class Package(    var uniqueId: String? = null,
                       var descriptions: String? = null,
                       var type: String? = null,
                       var contentVersion: String? = null,
                       var releaseDate: String? = null,
                       var size: String? = null,
                       var accessibility: String? = null
)


// Parses the contents of an entry. If it encounters a title, summary, or link tag, hands them off
// to their respective "read" methods for processing. Otherwise, skips the tag.
@Throws(XmlPullParserException::class, IOException::class)
private fun readEntry(parser: XmlPullParser): Package {
    parser.require(XmlPullParser.START_TAG, ns, "Package")
    var uniqueId: String? = null
    var descriptions: String? = null
    var type: String? = null
    var contentVersion: String? = null
    var releaseDate: String? = null
    var size: String? = null
    var accessibility: String? = null
    while (parser.next() != XmlPullParser.END_TAG) {
        if (parser.eventType != XmlPullParser.START_TAG) {
            continue
        }
        when (parser.name) {
            "UniqueId" -> uniqueId = readTitle(parser)
            "Descriptions" -> descriptions = readLink(parser)
            "Type" -> type = readSummary(parser)
            "ContentVersion" -> contentVersion = readLink(parser)
            "Accessibility" -> accessibility = readLink(parser)
            "ReleaseDate" -> releaseDate = readLink(parser)
            "ReleaseDate" -> size = readLink(parser)
            else -> skip(parser)
        }
    }
    return Package(uniqueId = uniqueId , descriptions = descriptions , type = type, contentVersion = contentVersion, releaseDate = releaseDate, size = size,accessibility=accessibility)
}

// Processes title tags in the feed.
@Throws(IOException::class, XmlPullParserException::class)
private fun readTitle(parser: XmlPullParser): String {
    parser.require(XmlPullParser.START_TAG, ns, "title")
    val title = readText(parser)
    parser.require(XmlPullParser.END_TAG, ns, "title")
    return title
}

// Processes link tags in the feed.
@Throws(IOException::class, XmlPullParserException::class)
private fun readLink(parser: XmlPullParser): String {
    var link = ""
    parser.require(XmlPullParser.START_TAG, ns, "link")
    val tag = parser.name
    val relType = parser.getAttributeValue(null, "rel")
    if (tag == "link") {
        if (relType == "alternate") {
            link = parser.getAttributeValue(null, "href")
            parser.nextTag()
        }
    }
    parser.require(XmlPullParser.END_TAG, ns, "link")
    return link
}

// Processes summary tags in the feed.
@Throws(IOException::class, XmlPullParserException::class)
private fun readSummary(parser: XmlPullParser): String {
    parser.require(XmlPullParser.START_TAG, ns, "summary")
    val summary = readText(parser)
    parser.require(XmlPullParser.END_TAG, ns, "summary")
    return summary
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

    // Given a string representation of a URL, sets up a connection and gets
// an input stream.
}

@Throws(IOException::class)
private fun downloadUrl(urlString: String): InputStream? {
    val url = URL(urlString)
    return (url.openConnection() as? HttpURLConnection)?.run {
        readTimeout = 10000
        connectTimeout = 15000
        requestMethod = "GET"
        doInput = true
        // Starts the query
        connect()
        inputStream
    }
}

