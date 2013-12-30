package com.route.bus;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class cdmaplarge extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cdmaplarge);
        ImageView image= (ImageView) findViewById(R.id.map);
    }



}
