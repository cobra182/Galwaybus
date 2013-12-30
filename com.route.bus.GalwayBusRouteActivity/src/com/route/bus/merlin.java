package com.route.bus;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

public class merlin extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merlin);
        
    
		
    }
    public void handlemaplarge(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,maplarge.class);
        startActivity(intent);
       }


}

