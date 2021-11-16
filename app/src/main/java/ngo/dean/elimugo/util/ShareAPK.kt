package ngo.dean.elimugo.util

import android.app.Activity
import android.widget.Toast

import androidx.core.content.ContentProviderCompat.requireContext

import android.content.Intent
import android.content.pm.ApplicationInfo

import androidx.core.content.ContextCompat.startActivity

import androidx.core.content.FileProvider

import android.net.Uri
import android.provider.Settings.Global.getString

import ngo.dean.elimugo.BuildConfig
import java.io.*

class ShareAPK {
    fun share(context: Activity) {
        val app: ApplicationInfo = context.applicationInfo
        val originalApk = app.publicSourceDir
        try {
            //Make new directory in new location
            var tempFile: File = File(context.externalCacheDir.toString()
                    + "/ExtractedApk")
            //If directory doesn't exists create new
            if (!tempFile.isDirectory) if
                    (!tempFile.mkdirs()) return
            //rename apk file to app name
            tempFile = File(tempFile.path + "/" + context.getString(app.labelRes)
                .replace(" ", "") + ".apk")
            //If file doesn't exists create new
            if (!tempFile.exists()) {
                if (!tempFile.createNewFile()) {
                    return
                }
            }
            //Copy file to new location
            val inp: InputStream = FileInputStream(originalApk)
            val out: OutputStream = FileOutputStream(tempFile)
            val buf = ByteArray(1024)
            var len: Int
            while (inp.read(buf).also { len = it } > 0) {
                out.write(buf, 0, len)
            }
            inp.close()
            out.close()
            //Open share dialog
            val intent = Intent(Intent.ACTION_SEND)
            //MIME type for apk, might not work in bluetooth sahre as it doesn't support apk MIME type

            intent.type = "application/vnd.android.package-archive"
            intent.putExtra(
                Intent.EXTRA_STREAM, FileProvider.getUriForFile(
                    context, BuildConfig.APPLICATION_ID + ".fileprovider", File(tempFile.path)
                )
            )
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(context,intent,null)
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}