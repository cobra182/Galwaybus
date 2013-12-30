package com.route.bus;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

class MyOnItemSelectedListener implements OnItemSelectedListener {
	   public void onItemSelected(AdapterView<?> parent,
		View view, int pos, long id) {
	Toast.makeText(parent.getContext(), "Bus Selected " +
		parent.getItemAtPosition(pos).toString(), Toast.LENGTH_LONG).show();
	   

		parent.getItemAtPosition(pos).toString();


				parent.getItemAtPosition(pos).toString();
	   
	   }
	public void onNothingSelected(AdapterView parent){								
	}

	   }