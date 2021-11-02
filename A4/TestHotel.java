/*
Allison Power 20179041
Test class for hotel
*/
public class TestHotel{
    public static void main(String[] args) {
	 Guest guest = new Guest("Walter Cronkite");
	 Hotel hotel = new Hotel("Walter Cronkite Hotel");
	 hotel.setRate(99.95);
	 hotel.setGuest(guest);
	 hotel.printRegister();
	 hotel.getGuest().getGuest();
    }         
}

/*
Guest class
*
* + Guest (String)
*
* constructor will be guest name
*
* getName -(String)
* setName -(String)
*
* Hotel Class
*
* - name of hotel = Allison Power
* - guest (Guest object)
* - rate (String)

* contstructor ( name of hotel)

* + hotelName - (String)
* + setGuest - (Guest)
* + getGuest - (Guest)
* + setRate - (Double)
* + getHotelName - (String)
* + getRate - (Double)
* + printRegister - (String)
*/