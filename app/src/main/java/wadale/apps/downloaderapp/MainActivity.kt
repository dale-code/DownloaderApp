package wadale.apps.downloaderapp

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate called")

        val downloadData = DownloadData()
        downloadData.execute("URL goes here")
        Log.d(TAG,"onCreate: done")
    }

    companion object {
        // this class extends the asynctask class
        private class DownloadData : AsyncTask<String, Void, String>(){
            private val TAG = "DownloadData"

            override fun onPostExecute(result: String?) {

                super.onPostExecute(result)

                Log.d(TAG, "onPostExecute: parameter $result")
            }

            override fun doInBackground(vararg params: String?): String {
              Log.d(TAG, "doInBackground")
                return "doInBackground completed"
            }
        }
    }

}
