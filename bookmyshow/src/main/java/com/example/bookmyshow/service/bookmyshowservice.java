package com.example.bookmyshow.service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Box.Filler;

import org.springframework.stereotype.Service;

import com.example.bookmyshow.theaterbean.theaterbean;
@Service
public class bookmyshowservice {
	
	public List<theaterbean> givedata() {
		List<theaterbean> arrayList=new ArrayList<theaterbean>();
		theaterbean ob=new theaterbean("pvr",25,"10:00 AM ,1:00 PM,4:00 PM,8:00PM");
		
		arrayList.add(ob);
		return arrayList;
		
	}
	public ArrayList<theaterbean> givedata1() {
		theaterbean ob=new theaterbean("sathyam",50,"10:00 AM ,1:00 PM,4:00 PM,8:00PM");
		ArrayList<theaterbean> arrayList1=new ArrayList<theaterbean>();
		arrayList1.add(ob);
		return arrayList1;
		
	}
	
	

}
