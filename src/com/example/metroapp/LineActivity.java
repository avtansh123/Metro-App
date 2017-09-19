package com.example.metroapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class LineActivity extends Activity{
	private ListView list;
	private TextView tv;
	private LinearLayout col;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		
		col=(LinearLayout) findViewById(R.id.bg);
		list=(ListView) findViewById(R.id.listView1);
		tv=(TextView) findViewById(R.id.textView1);
		
		Intent i=getIntent();
		String title=i.getStringExtra("title");
		String[] line=i.getStringArrayExtra("line");
		int c=i.getIntExtra("c", 0);
		tv.setText(title);
		if(c==0)  col.setBackgroundResource(R.drawable.r1);
		else if(c==1)  col.setBackgroundResource(R.drawable.b1);
		else if(c==2)  col.setBackgroundResource(R.drawable.v1);
		else if(c==3)  col.setBackgroundResource(R.drawable.y1);
		else if(c==4)  col.setBackgroundResource(R.drawable.g1);
		else if(c==5)  col.setBackgroundResource(R.drawable.o1);
		
		ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,line);
		list.setAdapter(adapter);
		if(c==0)
		{
		list.setOnItemClickListener(new OnItemClickListener() {

			
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			AlertDialog.Builder adb=new AlertDialog.Builder(LineActivity.this);
			adb.setTitle("Station Information");
		 if(arg2==0)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nGate No 1: Towards Vivek Vihar\n\nGate No 2:Towards J&K Pocket Dilshad Garden\n\nContact No: 8800793100");
		 }
		 if(arg2==1)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Jhilmil\n\nGate No 2:Towards DDA Flats\n\nContact No: 8800793101");
		 }
		 if(arg2==2)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Shahdara Industrial Area\n\nGate No 2:Towards MCD Office\n\nContact No: 8800793102");
		 }
		 if(arg2==3)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Shahdara Bus Terminal\n\nGate No 2:Towards Shahdara Railway Stn\n\nContact No: 8800793103");
		 }
		 if(arg2==4)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards MCD Office\n\nContact No: 8800793104");
		 }
		 if(arg2==5)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards SDM Office\n\nContact No: 8800793105");
		 }
		 if(arg2==6)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Shastri Park\n\nGate No 2:IT Park, Metro Vihar\n\nContact No: 8800793106");
		 }
		 if(arg2==7)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards HUDA City Centre\n\nPlatform No 2: Towards Jahangirpuri\n\nPlatform No 3: Towards Rithala\n\nPlatform No 4: Towards Dilshad Garden\n\nGate No 1: Towards MCD Park\n\nGate No 2:Towards Maharaja Aggrasan Park\n\nGate No 3:Towards Mori Gate Bus Stand\n\nGate No 4:Towards Shamnath Marg\n\nGate No 5:Towards Kudasiya Park\n\nGate No 6:Towards ISBT Road\n\nGate No 7:Towards ISBT\n\nContact No: 8800793107");
		 }
		 if(arg2==8)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards District Court Tis Hazari\n\nGate No 2:Towards St. Stephen Hospital\n\nGate No 3:Towards DMRC Parking\n\nContact No: 8800793108");
		 }
		 if(arg2==9)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Baraf Khana\n\nGate No 2:Towards Parking\n\nContact No: 8800793109");
		 }
		 if(arg2==10)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Pratibha Vikas Vidyalaya Krishan Ganj\n\nGate No 2:Towards Sabzi Mandi Railway Station\n\nContact No: 8800793110");
		 }
		 if(arg2==11)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Sarai Rohilla Railway Station\n\nGate No 2:Towards Shastri Nagar\n\nContact No: 8800793111");
		 }
		 if(arg2==12)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nPlatform No 3/4: Towards Mundka\n\nGate No 1: Towards JJ Colony, Anand Nagar\n\nGate No 2:Towards M Block Shastri Nagar\n\nGate No 3:Towards Inderlok Line-5\n\nGate No 4:Towards Inderlok Cooler Market\n\nGate No 5:Towards Inderlok Masid\n\nContact No: 8800793112");
		 }
		 if(arg2==13)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Tota Ram Bazar, Ganesh Pura\n\nGate No 2:Towards Maharishi Dayanand Park\n\nContact No: 8800793113");
		 }
		 if(arg2==14)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Lawrence Road\n\nGate No 2: Nanak Kunj\n\nGate No 3:Towards Parking\n\nGate No 4:Towards Ashok Vihar\n\nContact No: 8800793114");
		 }
		 if(arg2==15)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Big Bazar, Ring Road\n\nGate No 2:Towards Netaji Subhash Palace, District Centre\n\nGate No 3:Towards Delhi haat, TV Tower\n\nContact No: 8800793115");
		 }
		 if(arg2==16)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Morya Enclave Police Station\n\nGate No 2:Towards Shakur Pur Basti\n\nGate Np 3: Towards Kapil Vihar Nishant Kunj\n\nContact No: 8800793116");
		 }
		 if(arg2==17)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Mandakini Apartment\n\nGate No 2:Towards Madhubun Chowk\n\nGate No 3:Towards South Pitampura, Vishaka Enclave\n\nGate No 4:Towards Prashant Vihar, District Court Rohini\n\nContact No: 8800793117");
		 }
		 if(arg2==18)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1/2: Towards Om Sai Apartment, Rohini Sec-1,2,3,6,7 & 8\n\nGate No 3:Towards Metro Parking Rohini Sec 9,10,13 & 14\n\nContact No: 8800793118");
		 }
		 if(arg2==19)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Rithala\n\nPlatform No 2: Towards Dilshad Garden\n\nGate No 1: Towards Rohini Sec-7, Lotus Apartment\n\nGate No 2:Towards Baba Saheb Ambedkar Hospital\n\nGate No 3:Towards Swarna Jayanti Park\n\nContact No: 8800793119");
		 }
		 if(arg2==20)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1/2: Towards Rithala\n\nGate No 1: Towards Jagan Institute of Management Studies\n\nGate No 2:Towards Rohini Sec. 24\n\nGate No 3:Towards Metro Walk, Rohini Sec. 11 & 15\n\nContact No: 8800793120");
		 }
                    adb.setPositiveButton("OK", null);
                    adb.show();    
			}
		});
		}
		
		if(c==1)
		{
		list.setOnItemClickListener(new OnItemClickListener() {

			
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			AlertDialog.Builder adb=new AlertDialog.Builder(LineActivity.this);
			adb.setTitle("Station Information");
		 if(arg2==0)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1/2: Towards Noida City Centre/ Vaishali\n\nPlatform No 3: Towards New Delhi\n\nGate No 1:Towards NH-8, Bijwasan Village\n\nContact No: 8800793197");
		 }
		 if(arg2==1)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Spg Complex\n\nContact No: 8800793196");
		 }
		 if(arg2==2)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Pf Office\n\nGate No 2:Towards Bharat gas Godown\n\nContact No: 8800793195");
		 }
		 if(arg2==3)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Pinacle Mall\n\nGate No 2:Towards Dwarka District Court\n\nContact No: 8800793194");
		 }
		 if(arg2==4)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Amrahi Village\n\nGate No 2: Towards St. Gregorious School\n\nContact No: 8800793193");
		 }
		 if(arg2==5)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Sam International School\n\nGate No 1: Towards Bansup Hospital\n\nContact No: 8800793192");
		 }
		 if(arg2==6)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 2: Towards Metro View Apartment\n\nContact No: 8800793191");
		 }
		 if(arg2==7)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Eros Etro Mall\n\nGate No 2:Towards Nirmal Bhartiya Public School\n\nContact No: 8800793190");
		 }
		 if(arg2==8)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards CRPF Quarters\n\nGate No 2:Towards Kakrola Village\n\nContact No: 8800793189");
		 }
		 if(arg2==9)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Vipin Garden\n\nGate No 2:Towards RAMA Park\n\nContact No: 8800793188");
		 }
		 if(arg2==10)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Rnayar Hospital\n\nGate No 3:Towards Dwarka Mor\n\ngate No 4/5: Towards Mahendru Hospital\n\nContact No: 8800793187");
		 }
		 if(arg2==11)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards OM Vihar\n\nGate No 2:Towards Dal Mill Road\n\nGate No 3:Towards Prem Nagar\n\nGate No 4/5:Towards Arya Samaj Road\n\nContact No: 8800793186");
		 }
		 if(arg2==12)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Pankha Road\n\nGate No 2:Towards DTC Bus Terminal\n\nContact No: 8800793185");
		 }
		 if(arg2==13)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Vikas Puri\n\nGate No 2:Towards District Centre\n\nGate No 3:Towards DMRC Parking\n\nContact No: 8800793184");
		 }
		 if(arg2==14)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Mahavir Nagar\n\nGate No 2: Towards Kanjawal Nagar\n\nGate No 3:Towards Janakpuri B1,B2\n\nContact No: 8800793183");
		 }
		 if(arg2==15)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Central Market Tilak Nagar\n\nGate No 2:Towards 7th Floor Temple\n\nGate No 3:Towards Jail Road Gurudwara\n\nGate No 4:Towards Prem Nagar\n\nContact No: 8800793182");
		 }
		 if(arg2==16)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards SBI, Tilak Nagar\n\nGate No 2:Towards Pacific Mall\n\nGate No 3: Towards Tilak Nagar Police Station\n\nGate No 4: Minakshi Garden\n\nContact No: 8800793181");
		 }
		 if(arg2==17)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Khyala Kendriya Vidyalaya\n\nGate No 2:Towards Kukreja Hospital\n\nGate No 3:Towards Cambridge School\n\nGate No 4:Towards Rajouri Garden J Block\n\nContact No: 8800793180");
		 }
		 if(arg2==18)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1:Towards MTNL Office\n\nGate No 2: Towards Rajouri Garden Metro Thana\n\nGate No 3:Towards Vishal Cinema\n\nGate No 4:Towards City Square Mall\n\nGate No 5/6: Towards Illahabad Bank\n\nGate No 7/8:Towards Bikanerwala\n\nContact No: 8800793179");
		 }
		 if(arg2==19)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Metro Parking\n\nGate No 2:Towards Ramesh Nagar\n\nGate No 3:Towards Sun Temple\n\nGate No 4:Towards Main Najafgarh Road\n\nGate No 5:Towards Nandhari Colony\n\nContact No: 8800793178");
		 }
		 if(arg2==20)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1/2: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Mn Fire Station\n\nGate No 2:Towards Main Moti Nagar Market\n\nGate No 3:Towards Kirti Nagar\n\nGate No 4:Towards DMRC Parking\n\nContact No: 8800793177");
		 }
		 if(arg2==21)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Vivek Vihar\n\nGate No 2:Towards J&K Pocket Dilshad Garden\n\nContact No: 8800793176");
		 }
		 if(arg2==22)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards DTC Bus Depot\n\nGate No 4:Towards Shanti Place Hotel\n\nGate No 6: Towards DTC Colony\n\nGate No 7: Towards Satyam Cinema\n\nContact No: 8800793175");
		 }
		 if(arg2==23)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Ayur House\n\nGate No 2:Towards BB Patel Nagar Hospital\n\nGate No 3: Towards Hotel Bricks\n\nGate No 4:Towards Pusa Institute\n\nGate No 5:Towards DMRC Parking Area\n\nGate No 6: Towards Ranjeet Nagar\n\nContact No: 8800793174");
		 }
		 if(arg2==24)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Hotel Sidartha\n\nGate No 2:Towards Blk Hospital\n\nGate No 3: Towards Fire Station\n\nGate No 4:Towards Pusa Institute\n\nContact No: 8800793173");
		 }
		 if(arg2==25)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards KarolBagh Market\n\nGate No 2:Towards Pusa Road\n\nContact No: 8800793172");
		 }
		 if(arg2==26)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards SDM Office\n\nContact No: 8800793105");
		 }
		 if(arg2==27)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Shastri Park\n\nGate No 2:IT Park, Metro Vihar\n\nContact No: 8800793106");
		 }
		 if(arg2==28)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards MCD Park\n\nGate No 2:Towards Maharaja Aggrasan Park\n\nGate No 3:Towards Mori Gate Bus Stand\n\nGate No 4:Towards Shamnath Marg\n\nGate No 5:Towards Kudasiya Park\n\nGate No 6:Towards ISBT Road\n\nGate No 7:Towards ISBT\n\nContact No: 8800793107");
		 }
		 if(arg2==29)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards District Court Tis Hazari\n\nGate No 2:Towards St. Stephen Hospitak\n\nGate No 3:Towards DMRC Parking\n\nContact No: 8800793108");
		 }
		 if(arg2==30)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Baraf Khana\n\nGate No 2:Towards Parking\n\nContact No: 8800793109");
		 }
		 if(arg2==31)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Pratibha Vikas Vidyalaya Krishan Ganj\n\nGate No 2:Towards Sabzi Mandi Railway Station\n\nContact No: 8800793110");
		 }
		 if(arg2==32)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Sarai Rohilla Railway Station\n\nGate No 2:Towards Shastri Nagar\n\nContact No: 8800793111");
		 }
		 if(arg2==33)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards JJ Colony, Anand Nagar\n\nGate No 2:Towards M Block Shastri Nagar\n\nGate No 3:Towards Inderlok Line-5\n\nGate No 4:Towards Inderlok Cooler Market\n\nGate No 5:Towards Inderlok Masid\n\nContact No: 8800793112");
		 }
		 if(arg2==34)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21: Towards Tota Ram Bazar, Ganesh Pura\n\nGate No 2:Towards Maharishi Dayanand Park\n\nContact No: 8800793113");
		 }
		 if(arg2==35)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Lawrence Road\n\nGate No 2: Nanak Kunj\n\nGate No 3:Towards Parking\n\nGate No 4:Towards Ashok Vihar\n\nContact No: 8800793114");
		 }
		 if(arg2==36)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Big Bazar, Ring Road\n\nGate No 2:Towards Netaji Subhash Palace, District Centre\n\nGate No 3:Towards Delhi haat, TV Tower\n\nContact No: 8800793115");
		 }
		 if(arg2==37)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Morya Enclave Police Station\n\nGate No 2:Towards Shakur Pur Basti\n\nGate Np 3: Towards Kapil Vihar Nishant Kunj\n\nContact No: 8800793116");
		 }
		 if(arg2==38)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Mandakini Apartment\n\nGate No 2:Towards Madhubun Chowk\n\nGate No 3:Towards South Pitampura, Vishaka Enclave\n\nGate No 4:Towards Prashant Vihar, District Court Rohini\n\nContact No: 8800793117");
		 }
		 if(arg2==39)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21 Sai Apartment, Rohini Sec-1,2,3,6,7 & 8\n\nGate No 3:Towards Metro Parking Rohini Sec 9,10,13 & 14\n\nContact No: 8800793118");
		 }
		 if(arg2==40)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21\n\nGate No 1: Towards Rohini Sec-7, Lotus Apartment\n\nGate No 2:Towards Baba Saheb Ambedkar Hospital\n\nGate No 3:Towards Swarna Jayanti Park\n\nContact No: 8800793119");
		 }
		 if(arg2==41)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1/2: Towards Noida City Centre/ Vaishali\n\nPlatform No 2: Towards Dwarka Sector 21Towards Jagan Institute of Management Studies\n\nGate No 2:Towards Rohini Sec. 24\n\nGate No 3:Towards Metro Walk, Rohini Sec. 11 & 15\n\nContact No: 8800793120");
		 }

                    adb.setPositiveButton("OK", null);
                    adb.show();    
			}
		});
		}
		if(c==2)
		{
		list.setOnItemClickListener(new OnItemClickListener() {

			
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			AlertDialog.Builder adb=new AlertDialog.Builder(LineActivity.this);
			adb.setTitle("Station Information");
		 if(arg2==0)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards HUDA City Centre\n\nPlatform No 2: Towards Jahangirpuri\n\nPlatform No 3/4: Towards Badarpur\n\nGate No 1: Towards Red Cross Building\n\nGate No 2: Towards Krishi Bhawan\n\nGate No 3:Towards India Gate, Boat Club\n\nGate No 4:Towards Vijay Chowk\n\nGate No 5:Towards Rail Bhawan\n\nContact No: 8800793135");
			
		 }
		 if(arg2==1)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Badarpur\n\nPlatform No 2: Towards Central Secretariat\n\nGate No 1: Towards UPSC Bhawan\n\nGate No 2:Towards Pandara Road, Golf Link\n\nGate No 3: Towards Lodhi Road\n\nGate No 4:Towards Khan Market\n\nContact No: 8800793218");
		 }
		 if(arg2==2)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Badarpur\n\nPlatform No 2: Towards Central Secretariat\n\nGate No 1: Towards Delhi Transco Ltd.\n\nGate No 2/3:Towards CGO Complex\n\nGate No 4:Towards CRPF Ground\n\nGate No 5:Towards Dayal Singh College\n\nContact No: 8800793219");
		 }                    adb.setPositiveButton("OK", null);
                    adb.show();    
			}
		});
		}
		if(c==3)
		{
		list.setOnItemClickListener(new OnItemClickListener() {

			
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			AlertDialog.Builder adb=new AlertDialog.Builder(LineActivity.this);
			adb.setTitle("Station Information");
		 if(arg2==0)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards HUDA City Centre\n\nGate No 1: Towards Jahangirpuri Complex\n\nGate No 2: Towards DDA Flat, Mahendra Park\n\nGate No 3:Towards Fruit Mandi\n\nGate No 4:Towards GTK Bus Depot\n\nContact No: 8800793121");
			
		 }
		 if(arg2==1)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards HUDA City Centre\n\nPlatform No 2: Towards Jahangirpuri\n\nGate No 1: Towards Moolchand Colony\n\nGate No 2:Towards Keval Park, Majlish Park\n\nGate No 3: Towards New Sabzi Mandi\n\nGate No 4:Towards Fruit Mandi\n\nContact No: 88007932122");
		 }
		 if(arg2==2)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards HUDA City Centre\n\nPlatform No 2: Towards Jahangirpuri\n\nGate No 1: Towards Mahendru Enclave\n\nContact No: 8800793123");
		 }                    adb.setPositiveButton("OK", null);
                    adb.show();    
			}
		});
		}

		if(c==4)
		{
		list.setOnItemClickListener(new OnItemClickListener() {

			
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			AlertDialog.Builder adb=new AlertDialog.Builder(LineActivity.this);
			adb.setTitle("Station Information");
		 if(arg2==0)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Mundka\n\nPlatform No 2: Towards Kirti Nagar\n\nGate No 1: Towards Patel Nagar Railway Station\n\nContact No: 8800793234");
			
		 }
		 if(arg2==1)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Mundka\n\nPlatform No 2: Towards Kirti Nagar/Inderlok\n\nGate No 1: Towards Madan Park, Ashok Park Extn.\n\nGate No 2:Towards Ashok Park Colony, Rampura\n\nContact No: 8800793204");
		 }
		 if(arg2==2)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Mundka\n\nPlatform No 2: Towards Inderlok\n\nGate No 1: Towards Punjabi Bagh, Railway Colony\n\nGate No 2:Towards Transport Centre\n\nContact No: 8800793205");
		 }                    adb.setPositiveButton("OK", null);
                    adb.show();    
			}
		});
		}
		if(c==5)
		{
		list.setOnItemClickListener(new OnItemClickListener() {

			
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
			AlertDialog.Builder adb=new AlertDialog.Builder(LineActivity.this);
			adb.setTitle("Station Information");
		 if(arg2==0)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards HUDA City Centre\n\nPlatform No 2: Towards Jahangirpuri/Dwarka Sector 21\n\nGate No 1/2: Towards New Delhi Railway Station\n\nGate No 3: Towards Kamla Market\n\nGate No 4:Towards Rail Yatri Niwas\n\nGate No 5:Towards Airport Line\n\nContact No: 8800793132");
			
		 }
		 if(arg2==1)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Dwarka Sector 21\n\nPlatform No 2: Towards New Delhi\n\nContact No: 8527390342");
		 }
		 if(arg2==2)
		 {
			adb.setMessage("Station is: "
                    +arg0.getItemAtPosition(arg2)+"\n\nPlatform No 1: Towards Dwarka Sector 21\n\nPlatform No 2: Towards New Delhi\n\nContact No: 852790343");
		 }                    adb.setPositiveButton("OK", null);
                    adb.show();    
			}
		});
		}

	}


}
