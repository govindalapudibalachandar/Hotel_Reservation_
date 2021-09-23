package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class HotelTest {
	    //Test to check Hotel Name
	    @Test
	    void addGivenHotelName() throws Exception {
	        Hotel hotelRes = new Hotel();
	        try {
	            Hotel hotel1 = hotelRes.addHotel("LakeWood");
	            Assert.assertEquals("LakeWood", hotel1);
	        } 
	        catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
