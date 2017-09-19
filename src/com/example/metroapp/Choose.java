package com.example.metroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Choose extends Activity{
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.taxiservice);
}
public void yes(View v)
{
	Intent in=new Intent(this,Info.class);
	startActivity(in);
	}
public void no(View v)
{
	Toast.makeText(this,"You can avail our services whenever you like! :)", Toast.LENGTH_SHORT).show();
}
}
