package com.example.metroapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MetroLines extends Activity{
	private String red[]={"Dilshad Garden","Jhilmil","Mansarover Park","Shahdara","Welcome","Seelampur","Shastri Park","Kashmere Gate","Tis Hazari","Pul Bangash","Pratap Nagar","Shastri Nagar","Inder Lok","Kanhaiya Nagar","Keshav Puram","Netaji Subash Place","Kohat Enclave","Pitam Pura","Rohini East","Rohini West","Rithala"};
	private String blue[]={"Dwarka Sec-21","Dwarka Sec-08","Dwarka Sec-09","Dwarka Sec-10","Dwarka Sec-11","Dwarka Sec-12","Dwarka Sec-13","Dwarka Sec-14","Dwarka","Dwarka Mor","Nawada","Uttam Nagar West","Uttam Nagar East","Janak Puri West","Janak Puri East","Tilak Nagar","Subash Nagar","Tagore Garden","Rajouri Garden","Ramesh Nagar","Moti Nagar","Kirti Nagar","Shadi Pur","Patel Nagar","Rajendra Place","Karol Bagh","Jhandewalan","R K Ashram Marg","Rajiv Chowk","Barakhamba","Mandi House","Pragati Maidan","Indraprastha","Yamuna Bank","Akshardham","Mayur Vihar Phase-1","Mayur Vihar Extension","New Ashok Nagar","Noida Sector-15","Noida Sector-16","Noida Sector-18","Botanical Garden","Golf Course","Noida City Center"};
	private String orange[]={"New Delhi-Airport Express","Shivaji Stadium","Dhaula Kuan","Delhi Aero City","IGI Airport","Dwarka Sec-21-Airport"};
	private String green[]={"Satguru Ramsingh Marg","Ashok Park Main","Punjabi Bagh","Shivaji Park","Madi Pur","Paschim Vihar (East)","Paschim Vihar (West)","Peera Garhi","Udyog Nagar","Surajmal Stadium","Nangloai","Nangloai Rly Station","Rajdhani Park","Mundka"};
	private String violet[]={"Central Secretariat","Khan Market","Jawaharlal Nehru Stadium","Jangpura","Lajpat Nagar","Moolchand","Kailash Colony","Nehru Place","Kalkaji Mandir","Govind Puri","Okhla","Jasola Apollo","Sarita Vihar","Mohan Estate","Tughlakabad","Badarpur"};
	private String yellow[]={"Jahangirpuri","Adarsh Nagar","Azadpur","Model Town","GTB Nagar","Vishwa Vidyalaya","Vidhan Sabha","Civil Lines","Kashmere Gate","Chandi Chowk","Chawri Bazar","New Delhi","Rajiv Chowk","Patel Chowk","Central Secretariat","Udyog Bhawan","Race Course","Jor Bagh","INA","AIIMS","Green Park","Hauz Khas","Malviya Nagar","Saket","Qutub Minar","Chhatarpur","Sultanpur","Ghitorni","Arjan Garh","Guru Dronacharya","Sikandarpur","MG Road","IFFCO Chowk","HUDA City Centre"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.metrolines);
	}
	public void showRed(View v)
	{
		Intent in=new Intent(this,LineActivity.class);
		in.putExtra("title", "RED LINE STATIONS");
		in.putExtra("line", red);
		in.putExtra("c", 0);
		startActivity(in);
	}
	public void showBlue(View v)
	{
		Intent in=new Intent(this,LineActivity.class);
		in.putExtra("title", "BLUE LINE STATIONS");
		in.putExtra("line", blue);
		in.putExtra("c", 1);
		startActivity(in);
	}
	
	public void showViolet(View v)
	{
		Intent in=new Intent(this,LineActivity.class);
		in.putExtra("title", "VIOLET LINE STATIONS");
		in.putExtra("line", violet);
		in.putExtra("c", 2);
		startActivity(in);
	}
	public void showYellow(View v)
	{
		Intent in=new Intent(this,LineActivity.class);
		in.putExtra("title", "YELLOW LINE STATIONS");
		in.putExtra("line", yellow);
		in.putExtra("c", 3);
		startActivity(in);
	}
	public void showGreen(View v)
	{
		Intent in=new Intent(this,LineActivity.class);
		in.putExtra("title", "GREEN LINE STATIONS");
		in.putExtra("line", green);
		in.putExtra("c", 4);
		startActivity(in);
	}
	public void showOrange(View v)
	{
		Intent in=new Intent(this,LineActivity.class);
		in.putExtra("title", "ORANGE LINE STATIONS");
		in.putExtra("line", orange);
		in.putExtra("c", 5);
		startActivity(in);
	}
}
