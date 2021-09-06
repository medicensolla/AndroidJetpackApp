package com.tutorials.eu.favdish.activites

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tutorials.eu.favdish.databinding.ActivitySplashBinding

/**
 * A Splash Screen
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val splashBinding: ActivitySplashBinding = ActivitySplashBinding.inflate(layoutInflater)

        setContentView(splashBinding.root)



    }
}