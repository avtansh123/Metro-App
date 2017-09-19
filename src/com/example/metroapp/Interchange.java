package com.example.metroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Interchange extends Activity{
	private TextView tv;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.interchange);
	Intent i=getIntent();
	String change=i.getStringExtra("change");
	
	tv=(TextView) findViewById(R.id.textView2);
	tv.setText(change);
}
}
