package com.example.parallelspace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class amazon extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);

        web=findViewById(R.id.Web);
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);

        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www.amazon.in");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (web.canGoBack()){
            web.goBack();
        }
    }
}