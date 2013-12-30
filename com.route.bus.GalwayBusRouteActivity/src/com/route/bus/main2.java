package com.route.bus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class main2 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salt);
        ImageView image= (ImageView) findViewById(R.id.map);
    }

    public void handlemaplarge(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,maplarge.class);
        startActivity(intent);
       }

}
