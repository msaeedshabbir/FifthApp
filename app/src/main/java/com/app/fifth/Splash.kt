package com.app.fifth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.WindowManager
import com.app.fifth.databinding.ActivitySplashBinding

//@Suppress("DEPRECATION")
class Splash : AppCompatActivity() {
    private lateinit var mBinding:ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )



        android.os.Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Countries::class.java)
            startActivity(intent)
            finish()
        }, 5000)


        }
}