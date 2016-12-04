package com.src;

import java.util.HashSet;
import java.util.Set;

public class ShowInSingleton {

	private static final ShowInSingleton ShowInstance=new ShowInSingleton();
	private Set<String> availableSeats;
	
	private ShowInSingleton()
	{
		availableSeats=new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
		
	}
	public static ShowInSingleton getShowInstance() {
		return ShowInstance;
	}

	public static void main(String[] args) {
		ticketBooking("1A");//Now when ticketbooking is called as the constructor is private no more than one instance is created that to at the time when 
		//value of getinstance is assigned
		ticketBooking("1A");

	}

	private static void ticketBooking(String seat) {
		ShowInSingleton show=ShowInSingleton.getShowInstance();
		System.out.println(show.availableSeatsThere(seat));
		
	}
	private boolean availableSeatsThere(String seat) {
		return availableSeats.remove(seat);
		
	}

}
