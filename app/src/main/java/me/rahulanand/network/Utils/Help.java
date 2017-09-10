package me.rahulanand.network.Utils;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import me.rahulanand.network.Network.HostBean;
import me.rahulanand.network.R;

public class Help extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        WebView myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://networkhelp.rahulanand.me");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}