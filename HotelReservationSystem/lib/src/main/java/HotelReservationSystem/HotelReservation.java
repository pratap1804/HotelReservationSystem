
package HotelReservationSystem;

public class HotelReservation {
	
	//Declaring hotel variables.
	
	String hotelName;
	int hotelRating;
	
	// Generated constructors.
	
	public HotelReservation(String hotelName, int hotelRating) {
		this.hotelName = hotelName;
		this.hotelRating = hotelRating;
	}
	
	// Generated getter and setters for both instance variables
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(int hotelRating) {
		this.hotelRating = hotelRating;
	}


	//Displaying welcome message.
	
   public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system!");
    }

 }
