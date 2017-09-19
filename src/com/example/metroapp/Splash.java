package com.example.metroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class Splash extends Activity{
	RelativeLayout fpage;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.splash);
	fpage=(RelativeLayout) findViewById(R.id.firstpage);
	
Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try
			{
				Thread.sleep(4000);
			}
			catch(InterruptedException e)
			{
				
			}
			Intent in=new Intent(Splash.this,MainActivity.class);
			startActivity(in);
			finish();
			
		}
	});
    t1.start();
    }
public boolean onTouchEvent(MotionEvent event)
{
	int a=event.getAction();
	switch(a)
	{
	case MotionEvent.ACTION_DOWN:
		fpage.setBackgroundResource(R.drawable.bgr2);
		break;
	case MotionEvent.ACTION_OUTSIDE:
		fpage.setBackgroundResource(R.drawable.bgr5);
		break;
	case MotionEvent.ACTION_SCROLL:
		fpage.setBackgroundResource(R.drawable.bgr3);
		break;
	case MotionEvent.ACTION_UP:
		fpage.setBackgroundResource(R.drawable.bgr4);
		break;
	case MotionEvent.ACTION_MOVE:
		fpage.setBackgroundResource(R.drawable.bgr6);
	}
	return true;
}
}

