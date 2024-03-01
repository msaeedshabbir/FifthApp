package com.app.fifth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.app.fifth.databinding.ActivityCuiBinding
import com.app.fifth.databinding.ActivitySplashBinding

class CUI : AppCompatActivity() {
    private lateinit var mBinding:ActivityCuiBinding
    private lateinit var webView: WebView
    private var url:String = "https://www.sahiwal.comsats.edu.pk/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityCuiBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        webView = findViewById(R.id.webView)
        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.webViewClient = WebViewClient()

        // this will load the url of the website
        webView.loadUrl(url)

        // this will enable the javascript settings, it can also allow xss vulnerabilities
        webView.settings.javaScriptEnabled = true

        // if you want to enable zoom feature
        webView.settings.setSupportZoom(true)
    }

    // if you press Back button this code will work
    override fun onBackPressed() {
        // if your web view can go back it will go back
        if (webView.canGoBack())
            webView.goBack()
        // if your web view cannot go back
        // it will exit the application
        else
            super.onBackPressed()
    }


}