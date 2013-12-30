package com.route.bus;

import android.app.Activity;
import android.net.Uri;
import android.net.UrlQuerySanitizer.ValueSanitizer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;
import android.appwidget.*;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.R.layout;

public class ballybane extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ballybane);
        ImageView image = (ImageView) findViewById(R.id.map);
    }
        
    public void handlemaplarge(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,maplarge.class);
        startActivity(intent);
       }
    
    
    }


