package com.csao.cybersecurity.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.csao.cybersecurity.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val startAct= Intent(this@SplashActivity,
                MainActivity::class.java)
            startActivity(startAct)
        },2000)


    }
}