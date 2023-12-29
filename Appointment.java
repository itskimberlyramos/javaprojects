/* Appointment.java - Class that creates and manages appointments
 * @author Kimberly Ramos
 * @date 27-Dec-23
 * project
 */
public class Appointment { // superclass
	private String description;
	private int year, month, day; // instance variables

public Appointment(int year, int month, int day, String description){
	// constructor that creates appointment
	this.year = year;
	this.month = month;
	this.day = day;
	this.description = description;
	}

	public int getYear() {
		// getter method
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public String getDescription() {
		return description;
	}
	public String toString(){
		// print format of appointment
		return description + " on: " + year + " / " + month + " / " + day;
}

	public boolean occursOn(int year, int month, int day) {
		//check if appointment happens on certain date
		return (year == this.year) && (month == this.month) && (day == this.day);
	}
}

class Onetime extends Appointment {
	// one time appointment, subclass
	public Onetime (int year, int month, int day, String description) {
		super(year,month,day,description); // calls superclass constructor
	}
}

class Daily extends Appointment{
	// daily appointment, subclass
	public Daily (int year, int month, int day, String description) {
		super(year, month, day, description); // calls superclass constructor
	}
	
	public boolean occursOn(int year, int month, int day) {
		// override, returns true for daily 
		return true;
	}
}
class Monthly extends Appointment{
	// monthly appointment, subclass
	public Monthly (int year, int month, int day, String description) {
		super(year, month, day, description); // calls superclass constructor
	}
	public boolean occursOn(int year, int month, int day) {
		// check if appointment occurs on specific day every month
		return (this.getMonth() == month) && (day == this.getDay());
	}
}
