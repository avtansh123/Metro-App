package com.example.metroapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class Intermediate extends Activity {
	private ListView list;
	private TextView tv;
	LinearLayout col;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		list=(ListView) findViewById(R.id.listView1);
		tv=(TextView) findViewById(R.id.textView1);
		col=(LinearLayout) findViewById(R.id.bg);
		
		Bundle b=this.getIntent().getExtras();
		String[] line=b.getStringArray("name");
		tv.setText("INTERMEDIATE STATIONS");
		col.setBackgroundResource(R.drawable.r1);
		
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,line);
		list.setAdapter(adapter);
	}

}
