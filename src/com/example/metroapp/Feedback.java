package com.example.metroapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Feedback extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.feedback);
	}
	public void mail(View v)
	{
		Toast.makeText(this,"Thank You", Toast.LENGTH_SHORT).show();
	}

}
