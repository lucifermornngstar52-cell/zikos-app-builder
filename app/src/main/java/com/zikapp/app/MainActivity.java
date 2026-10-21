package com.zikapp.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView w = new WebView(this);
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setDomStorageEnabled(true);
        w.getSettings().setAllowFileAccess(true);
        w.getSettings().setAllowFileAccessFromFileURLs(true);
        w.getSettings().setAllowUniversalAccessFromFileURLs(true);
        w.setBackgroundColor(0xFF000000);
        setContentView(w);
        w.loadUrl("file:///android_asset/app/index.html");
    }
}
