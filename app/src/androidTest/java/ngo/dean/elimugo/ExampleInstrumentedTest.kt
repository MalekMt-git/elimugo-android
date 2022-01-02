package ngo.dean.elimugo

import android.content.Context
import android.widget.Toast
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import ngo.dean.elimugo.ui.base.BaseActivity

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
        fun query() {
            // Instantiate the RequestQueue.
            val queue = Volley.newRequestQueue(BaseActivity().baseContext)
            val url = "https://www.elimupi.online/content/developmentHtmlExamPapers2019/index.xml"

            // Request a string response from the provided URL.
            val stringRequest = StringRequest(
                Request.Method.GET, url,
                { response ->
                    // Display the first 500 characters of the response string.

                    Toast.makeText(BaseActivity().baseContext , response , Toast.LENGTH_LONG).show()

                },
                {

                    Toast.makeText(BaseActivity().baseContext , it.toString() + "Failed" , Toast.LENGTH_LONG).show()

                })

// Add the request to the RequestQueue.
            queue.add(stringRequest)
        }
    }
