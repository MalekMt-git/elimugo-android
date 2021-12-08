package ngo.dean.elimugo.data.server

import android.content.Context
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class Request {

    fun query(context: Context, query: String, callBack: (result: String?) -> Unit  )  {
        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(context)
        val url = "https://www.elimupi.online/$query"

        // Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->

                callBack(response)
              //  response.toString()
            },
            {
                callBack("$it : failed ")
               // it.toString()

            })

// Add the request to the RequestQueue.
        queue.add(stringRequest)
    }
}