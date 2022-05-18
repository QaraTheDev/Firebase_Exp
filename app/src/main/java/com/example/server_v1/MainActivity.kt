package com.example.server_v1


import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.initialize
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings
import java.net.URL

class MainActivity : AppCompatActivity() {

    private var ScreenTime: Long = 3500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Firebase.initialize(this)
        setContentView(R.layout.activity_main)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

/*        Handler(Looper.myLooper()!!).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, ScreenTime)*/

        val remoteConfig = Firebase.remoteConfig

/*        val configSettings = remoteConfigSettings {
            minimumFetchIntervalInSeconds = 3600
        }
        remoteConfig.setConfigSettingsAsync(configSettings)*/

/*
        val link = remoteConfig.getString("check_link")
*/
    }














/*    inner class serverTask() : AsyncTask<String, Void, String>() {

        override fun onPreExecute() {
            super.onPreExecute()
            *//* Showing the ProgressBar, Making the main design GONE *//*
            findViewById<ProgressBar>(R.id.ProgressBar).visibility = View.VISIBLE
            findViewById<RelativeLayout>(R.id.addressContainer).visibility = View.GONE
            findViewById<TextView>(R.id.errorText).visibility = View.GONE
        }

        override fun doInBackground(vararg p0: String?): String? {
            var response:String?
            try{
                response = URL("https://test-apk-1-fa3be-default-rtdb.firebaseio.com $ASD test-apk-1-fa3be$API")
                    .readText(Charsets.UTF_8)
            }catch (e: Exception){
                response = null
            }
            return response
        }
    }*/
}
