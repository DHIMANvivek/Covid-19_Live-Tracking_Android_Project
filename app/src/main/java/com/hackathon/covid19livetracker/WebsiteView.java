/*
 * %W% %E% Zain-Ul-Abedin
 *
 * Copyright (c) 2017-2018. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of ZainMustafaaa.
 * You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement
 * for learning purposes.
 *
 */

package com.hackathon.covid19livetracker;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebsiteView extends AppCompatActivity {


    String message = "Loading...";

    private WebView webview = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website_view);


        webview = (WebView) findViewById(R.id.webView);

        setUpWebView();
    }


    void setUpWebView() {


        WebSettings webSettings = webview.getSettings();

        webSettings.setJavaScriptEnabled(true);

        webview.setWebViewClient(new MyWebViewClient());

        webSettings.setGeolocationEnabled(true);

        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            webSettings.setMediaPlaybackRequiresUserGesture(true);
        }


        webSettings.setLoadsImagesAutomatically(true);

        webSettings.setUseWideViewPort(true);
        webSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);
        webview.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        try {

            webview.loadUrl(getResources().getString(MedicinesController.getWebUrl()));
        } catch (Exception e) {

            webview.setWebChromeClient(new WebChromeClient() {

                @Override
                public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
                    callback.invoke(origin, true, false);
                }
            });
            message = "Scanning Location...";

            webview.loadUrl("file:///android_asset/myfile.html");
        }

    }


    @Override
    public void onBackPressed() {
        /** condition for if web can go back then go back */
        if (webview.canGoBack())
            webview.goBack();
        else /** else call to super method to go back from web view */
            super.onBackPressed();
    }


    class MyWebViewClient extends WebViewClient {


        ProgressDialog progressDialog;


        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {

            progressDialog = new ProgressDialog(WebsiteView.this);
            progressDialog.setTitle("Please wait");
            progressDialog.setMessage(message);
            progressDialog.show();

            super.onPageStarted(view, url, favicon);
        }


        @Override
        public void onPageFinished(WebView view, String url) {

            progressDialog.dismiss();

            super.onPageFinished(view, url);
        }
    }
}
