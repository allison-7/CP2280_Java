/*
Allison Power 20179041
Represents a hotel
*/
public class Hotel{
	private Guest guest;
	private String hotelName;
	private double rate;
/*
Creates hotel object
@param hotelName - name of hotel	as string
*/
	public Hotel (String hotelName){
		this.hotelName = hotelName;
	}
/*
Sets guest attribute
@param g - guest object
*/
	public void setGuest(Guest g){
		this.guest = g;
	}
/*
Returns guest object
@returns guest object
*/
	public Guest getGuest(){
		return guest;
	}
/*
Sets hotel name
@param name - hotel name as string
*/
	public void setHotelName(String name){
		this.hotelName = name;
	}
/*
Gets hotel name
@returns hotelName - hotel name as string
*/
	public String getHotelName() {
		return hotelName;
	}
/*
Set hotel rate
@param rate - hotel rate as double
*/
	public void setRate(double rate){
		this.rate = rate; 
	}
/*
Get hotel rate
@returns rate - hotel rate as double
*/
	public double getRate(){
		return rate;
	}
/*
Prints the guest in hotel
*/
	public void printRegister(){
		System.out.println(hotelName);
		System.out.println("====================");
		double cost = rate * 3;
		System.out.println(guest.getGuest() + " " + cost);
	}
}