package com.example.metroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MapActivity extends Activity{
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.map);
}
public void yellow(View v)
{
	Intent in=new Intent(this,Yellow.class);
	startActivity(in);
}
public void red(View v)
{
	Intent in=new Intent(this,Red.class);
	startActivity(in);
}
public void orange(View v)
{
	Intent in=new Intent(this,Orange.class);
	startActivity(in);
}
public void green(View v)
{
	Intent in=new Intent(this,Green.class);
	startActivity(in);
}
public void violet(View v)
{
	Intent in=new Intent(this,Violet.class);
	startActivity(in);
}
public void blue(View v)
{
	Intent in=new Intent(this,Blue.class);
	startActivity(in);
}

}
