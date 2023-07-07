package com.example.api1230;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FifthActivity extends AppCompatActivity {

    WebView mWebView;
    WebSettings mWebViewSettings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        //화면에 웹뷰 객체를 담는다
        mWebView = findViewById(R.id.webView);
        //웹뷰안에 웹뷰클라이언트 객체를 담는다.
        mWebView.setWebViewClient(new WebViewClient());
        //웹뷰의 세부등록 //자바스크립트도 쓸려면 세팅을 바꿔야한다
        mWebViewSettings = mWebView.getSettings();
        mWebViewSettings.setJavaScriptEnabled(true);//자바스크립트허용
        mWebViewSettings.setSupportMultipleWindows(false);//새창 안띄움
        mWebViewSettings.setBuiltInZoomControls(false);//화면 확대,축소 안함

        mWebView.loadUrl("https://m.naver.com");

    }
}