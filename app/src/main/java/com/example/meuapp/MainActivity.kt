package com.example.meuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewImp = WebViewImp(this)
        wvMain.webViewClient = webViewImp

        wvMain.loadUrl("https://sistemas.salvadorengenharia.com.br")

        // Deixando funcionar o javascript na página
        val webSettings = wvMain.settings
        webSettings.javaScriptEnabled = true

    }
    override fun onBackPressed() {
        wvMain.goBack()
    }
}

//webview.loadUrl("https://sistemas.salvadorengenharia.com.br")