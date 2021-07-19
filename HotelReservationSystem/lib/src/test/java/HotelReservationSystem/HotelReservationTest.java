package HotelReservationSystem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Scanner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class HotelReservationTest {

	HashMap<String, Integer> hotelList = new HashMap<>();
	
	@Test
	void whenHotelName_AddedToTheHotelList_ShouldReturnTrue() {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter hotel name: ");
	String hotelName1 = scan.next();
	System.out.println("Enter its rating: ");
	int rating1 = scan.nextInt();
	
	HotelReservation hotelReservation1 = new HotelReservation(hotelName1, rating1);
	hotelReservation1.setHotelName(hotelName1);
	hotelReservation1.setHotelRating(rating1);
	hotelList.put(hotelName1, rating1);
	
	
	System.out.println("Enter hotel name: ");
	String hotelName2 = scan.next();
	System.out.println("Enter its rating: ");
	int rating2 = scan.nextInt();
	
	HotelReservation hotelReservation2 = new HotelReservation(hotelName2, rating2);
	hotelReservation2.setHotelName(hotelName2);
	hotelReservation2.setHotelRating(rating2);
	hotelList.put(hotelName2, rating2);
	
	
	
	System.out.println("Enter hotel name: ");
	String hotelName3 = scan.next();
	System.out.println("Enter its rating: ");
	int rating3 = scan.nextInt();

	HotelReservation hotelReservation3 = new HotelReservation(hotelName2, rating2);
	hotelReservation3.setHotelName(hotelName3);
	hotelReservation3.setHotelRating(rating3);
	hotelList.put(hotelName3, rating3);
	
	boolean result1 = hotelList.containsKey("Lakewood");
	boolean result2 = hotelList.containsKey("Bridgewood");
	boolean result3 = hotelList.containsKey("Ridgewood");
	}

}
