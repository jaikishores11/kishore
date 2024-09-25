package com.example.bookmyshow.theaterbean;

import org.apache.coyote.ContinueResponseTiming;
import org.springframework.stereotype.Component;
@Component
public class theaterbean {
	String theatername;
	int  numberofSeat;
	String timing;
	public String getTheatername() {
		return theatername;
	}
	public void setTheatername(String theatername) {
		this.theatername = theatername;
	}
	public int getNumberofSeat() {
		return numberofSeat;
	}
	public void setNumberofSeat(int numberofSeat) {
		this.numberofSeat = numberofSeat;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public theaterbean(String theatername, int numberofSeat, String timing) {
		super();
		this.theatername = theatername;
		this.numberofSeat = numberofSeat;
		this.timing = timing;
	}
	@Override
	public String toString() {
		return "theaterbean [theatername=" + theatername + ", numberofSeat=" + numberofSeat + ", timing=" + timing
				+ "]";
	} 
	public theaterbean() {
		
	}
	}
	


