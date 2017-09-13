package me.rahulanand.network;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import me.rahulanand.network.BlockDevice;

public class BlockHelp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.block_help);

        WebView myWebView = (WebView) findViewById(R.id.webView2);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("file:///android_asset/help.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}