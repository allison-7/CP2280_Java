/*
Allison Power 20179041
Represents a guest
@param guest - guest name
*/
public class Guest{
   private String guest; 
	public Guest(String g){
		this.guest = g;
	}
/*
Sets the name of the guest
@param g - guest name
*/
	public void setGuest(String g){
		this.guest = g;
	}
/*
Returns name of guest
@return a string representing the guest's name
*/
	public String getGuest(){
		return guest;
	}
}