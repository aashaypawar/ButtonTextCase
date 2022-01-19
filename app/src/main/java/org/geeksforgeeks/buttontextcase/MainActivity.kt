package org.geeksforgeeks.buttontextcase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //You are inheriting the theme Theme.Holo.Light.DarkActionBar, that contains that setting. You have to add new explicit property for styling buttons,

    }
}