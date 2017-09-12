package me.rahulanand.network;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.DhcpInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.text.format.Formatter;

import org.apache.http.conn.util.InetAddressUtils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

import me.rahulanand.network.Network.HostBean;
import me.rahulanand.network.Network.NetInfo;
import me.rahulanand.network.Utils.Db;
import me.rahulanand.network.Utils.Help;
import me.rahulanand.network.Utils.Prefs;

import static me.rahulanand.network.R.id.ip;


public class BlockDevice extends Activity {

    Button button2;
    View v;
    TextView iptext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.block_device);
        button2 = (Button) findViewById(R.id.clickButton);
        iptext = (TextView) findViewById(R.id.textView);
        iptext.setText("For guide on how to block the device on router.\nClick on side button.");


        WebView myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://192.168.1.1");


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
}