package com.dawn.assetsdawn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by 90449 on 2017/7/1.
 */

public class WebActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/index.html");
        // 装载URL
//        webView.loadUrl("http://www.baidu.com/");
        webView.getSettings().setJavaScriptEnabled(true);
        // 设置WebViewClient来接收处理请求和通知
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                // 返回true则表明使用的是WebView
                return  super.shouldOverrideUrlLoading(view, url);
            }
        });
        // 获取焦点
        webView.requestFocus();
    }
}
