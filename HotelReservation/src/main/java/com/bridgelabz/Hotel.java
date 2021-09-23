package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
String hotelName;
	
	public void HotelName(String hotelName) {
		this.hotelName =hotelName;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	//setter
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
public static void main(String[] args) {
	System.out.println("Welcome to  Hotel Reservation");
	String hotel1 = "Lakwood";
	String hotel2 ="Bridgeewood";
	String hotel3 = "Ridgewood";
}
		

	public static void addhotel() public class ListOfHotel {
	  //  public static Scanner sc = new Scanner(System.in);
	    //Created a List to Store Hotel Name and Rates
	    public static List<Hotel> nameOfHotel = new ArrayList<>();
	    // Method to add Hotel
	    public static void addHotel(String NameOfHotel) {
	        ListOfHotel obj = new ListOfHotel();

	        System.out.print("Enter Hotel Name : ");
//	        String hotelName = sc.next();
//	        HotelReservationSystem addHot = new HotelReservationSystem(hotelName);
	        nameOfHotel.add(NameOfHotel);
	    }
	}
		
	}
	}

