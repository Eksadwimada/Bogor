package com.example.tripbogor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

@Suppress("DEPRECATION")
class SplashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_splashscreen)
        supportActionBar?.hide()

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
        // ketika aplikasi pertama kli dibuka dia menuju splashcreen dan akan delay
        // selama 2000s kmdn lgsg menuju halaman login

        //agar saat program dirun munculnya di splass page, kita hrs menyettingnya di manifest
    }
}