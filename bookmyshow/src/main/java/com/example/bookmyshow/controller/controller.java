package com.example.bookmyshow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmyshow.service.bookmyshowservice;
import com.example.bookmyshow.theaterbean.theaterbean;
@RestController
@RequestMapping("/ticketbooking")
class Ticketcontroller {
	@Autowired
	 private bookmyshowservice bms;
	@PostMapping("/pvr")
public  List<theaterbean> retrivePVRname() {
		   //  List<theaterbean> list = bms.givedata();
		return bms.givedata() ;
		
	}
@PostMapping("/sathyam")
public  List<theaterbean> retriveSathyamname1() {
		
	 // List<theaterbean> list1 = bms.givedata1();
	
		return bms.givedata1() ;
		
	}
@PostMapping
public List<theaterbean> ticketBooking(@RequestParam String theater) {
    if ("pvr".equalsIgnoreCase(theater)) {
        return bms.givedata();  // Return PVR data
    } else if ("sathyam".equalsIgnoreCase(theater)) {
        return bms.givedata1(); // Return Sathyam data
    } else {
        throw new IllegalArgumentException("Invalid theater name: " + theater);
    }
}


}
