/* Calendar.java - Class that manages appointments
 * @author Kimberly Ramos
 * @date oct-29-23
 * 
 */
import java.util.ArrayList; // ArrayList

class Calendar {
	// Calendar class manages appointments
	private ArrayList<Appointment> appointments;
	public Calendar() {
		// constructor, initializes calendar
		appointments = new ArrayList<Appointment>();
	}
	public void add(Appointment apt) {
		// method that adds appointment to calendar
		appointments.add(apt);
	}
	public void remove(int year, int month, int day) {
		// method that removes appointment from calendar
		appointments.removeIf(apt -> apt.occursOn(year, month, day));
	}
	public String toString() {
		// method that returns a string representation of the Calendar object
		StringBuilder result = new StringBuilder();
		for (Appointment apt: appointments) {
			result.append(apt.toString() + "\n");
		}
		return result.toString();
	}	
}