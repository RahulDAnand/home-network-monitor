package me.rahulanand.network;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import android.view.View.OnClickListener;


public class BlockDevice extends Activity {

    Button button2;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.block_device);
        button2 = (Button) findViewById(R.id.clickButton);

        WebView myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://192.168.1.100");



            // Capture button clicks
            button2.setOnClickListener(new OnClickListener() {
                public void onClick(View arg0) {

                    // Start NewActivity.class
                    Intent myIntent = new Intent(BlockDevice.this,
                            BlockHelp.class);
                    startActivity(myIntent);
                }
            });
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            return true;
        }
    }
