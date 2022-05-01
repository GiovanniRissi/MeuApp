package com.example.meuapp

import android.content.Intent
import android.webkit.WebView
import android.app.Activity
import android.net.Uri
import android.webkit.WebViewClient


class WebViewImp(activity: Activity) : WebViewClient() {

    private var activity: Activity? = null

    init {
        this.activity = activity
    }
    override fun shouldOverrideUrlLoading(webView: WebView, url: String): Boolean {
        if (url.contains("https://sistemas.salvadorengenharia.com.br")) return false
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        activity!!.startActivity(intent)
        return true
    }
}