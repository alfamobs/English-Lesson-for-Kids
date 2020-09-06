package com.arifudesu.englishlessonforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Pelajaran1_2 extends AppCompatActivity {
    WebView webViewSaya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelajaran1_2);

        webViewSaya = (WebView) findViewById(R.id.webViewSaya);

        // setting
        webViewSaya.setWebViewClient(new WebViewClient());
        webViewSaya.setWebChromeClient(new WebChromeClient());
        webViewSaya.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webViewSaya.getSettings().setJavaScriptEnabled(true);
        webViewSaya.getSettings().setPluginState(WebSettings.PluginState.ON);
        webViewSaya.getSettings().setDefaultFontSize(18);
    }

    private void muatVideo(String kode_youtube) {
        String kodeHTML = "<head></head><body>" +
                "<iframe width=\"310\" height=\"160\" src=\"https://www.youtube.com/embed/" +
                kode_youtube +
                "\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>" +
                "</body>";
        webViewSaya.loadData(kodeHTML, "text/html; charset=utf-8", null);
    }

    public void video1(View view) {
        muatVideo("x23rTDl4AMs");
    }

    public void video2(View view) {
        muatVideo("PraN5ZoSjiY");
    }

    public void home(View view) {
        Intent intent = new Intent(Pelajaran1_2.this, HomeActivity.class);
        startActivity(intent);
    }
}
