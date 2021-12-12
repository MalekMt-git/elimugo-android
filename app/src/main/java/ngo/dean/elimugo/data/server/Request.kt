package ngo.dean.elimugo.data.server

import android.content.Context
import android.util.Log
import androidx.compose.runtime.Composable
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.util.regex.Matcher
import java.util.regex.Pattern

class Request {

    fun query(context: Context, query: String, callBack: (result: ArrayList<String>?) -> Unit  )  {


        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(context)
        val url = "https://www.elimupi.online/$query"

        // Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->

                patternMatcher(response, "UniqueId") {
                    callBack(it)
                }


            },
            {
                 Log.i( "TAG","$it : failed ")
            })

// Add the request to the RequestQueue.
        queue.add(stringRequest)
    }

    fun download(stringArrayList : ArrayList<String>){


    }

    private fun patternMatcher(input : String, pattern : String, callback : (ArrayList<String>)-> Unit){
        val pattern: Pattern = Pattern.compile("<$pattern>(.*?)</$pattern>", Pattern.DOTALL)
        val matcher: Matcher = pattern.matcher(input)
        val uniqueIds = ArrayList<String>()
        while (matcher.find()) {
            uniqueIds.add(matcher.group(1))
        }
        callback(uniqueIds)
    }
}