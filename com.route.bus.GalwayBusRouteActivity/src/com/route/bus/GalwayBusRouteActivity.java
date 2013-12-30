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


import com.route.bus.MyOnItemSelectedListener;


public class GalwayBusRouteActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void handleClick(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,main2.class);
        startActivity(intent);
       }
    
    public void handleClick1(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,merlin.class);
        startActivity(intent);
       }
    
    public void handleClick2(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,Castlepark.class);
        startActivity(intent);
       }
    
    public void handleClick3(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,newcastle.class);
        startActivity(intent);
       }
    
    public void handleClick5(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,ballybane.class);
        startActivity(intent);
       }
    
    
    public void handleClick6(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,bothar.class);
        startActivity(intent);
       }
    
    public void handleClick7(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,parkmore.class);
        startActivity(intent);
       }
    
    public void handleClick8(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,oranmore.class);
        startActivity(intent);
       }
    

    
    public void handleoverview(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,overview.class);
        startActivity(intent);
       }
    
  public void handleClick9(View v){
        
        //Create an intent to start the new activity.
           // Our intention is to start secondActivity
        Intent intent = new Intent();
        intent.setClass(this,direct411.class);
        startActivity(intent);
       }
    
  public void handleClick10(View v){
      
      //Create an intent to start the new activity.
         // Our intention is to start secondActivity
      Intent intent = new Intent();
      intent.setClass(this,direct412.class);
      startActivity(intent);
     }
  
  public void handleClick11(View v){
      
      //Create an intent to start the new activity.
         // Our intention is to start secondActivity
      Intent intent = new Intent();
      intent.setClass(this,direct413.class);
      startActivity(intent);
     }
  
  public void handleClick12(View v){
      
      //Create an intent to start the new activity.
         // Our intention is to start secondActivity
      Intent intent = new Intent();
      intent.setClass(this,direct414.class);
      startActivity(intent);
     }
  
  

    
   }
   
    
    


	

        

        			
        		
        	
        
    
    
        	
    	   
    

		  
    


			 
			 
		
			 
			 
			
		
		
	
		
		  
    
    
       
       
        
