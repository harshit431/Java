package com.src;

import java.util.HashSet;
import java.util.Set;

public class ShowInNoSingleton {

	private Set<String> noOfSeats;
	public ShowInNoSingleton()
	{
		noOfSeats=new HashSet<String>();
		noOfSeats.add("1A");
		noOfSeats.add("1B");
	}
	
	public static void main(String[] args) {
		ticketToSeats("1A");//Calls private static and from then constructor is called every time ticketToSeats is called
		//Hence one seat is given twice which is not as expected
		ticketToSeats("1A");
	}

	private static void ticketToSeats(String seat) {
		ShowInNoSingleton show=new ShowInNoSingleton();
		System.out.println("Calling the availableseat ");
		System.out.println(show.available(seat));
		
	}

	private boolean available(String seat) {
	
		return noOfSeats.remove(seat);
		
	}

}
