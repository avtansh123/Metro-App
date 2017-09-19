package com.example.metroapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLines(View v)
    {
    	Intent in=new Intent(this,MetroLines.class);
    	startActivity(in);
    }
    public void showPage(View v)
    {
    	Intent in=new Intent(this,SearchActivity.class);
    	startActivity(in);
    }
    public void route(View v)
    {
    	Intent in=new Intent(this,MapActivity.class);
    	startActivity(in);
    	
    }
    public void taxi(View v)
    {
    	Intent in=new Intent(this,Choose.class);
    	startActivity(in);
    	
    }
    public void about(View v)
    {
    	Intent in=new Intent(this,About.class);
    	startActivity(in);
    	
    }
    public void feedback(View v)
    {
    	Intent in=new Intent(this,Feedback.class);
    	startActivity(in);
    	
    }
}
