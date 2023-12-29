/** AppointmentDemo.java - Demonstration of Calendar and Appointment classes
*/

public class AppointmentDemo {
public static void main(String[] args) {
Calendar calendar = new Calendar();
//create some appointments and add them to our calendar
//note the method calls here imply that
//your Appointment class will need to have a 4 argument constructor
//that accepts year, month, day, and description
//the first call is year:2000, month: 8, day: 13
calendar.add(new Daily(2000, 8, 13, "Brush your teeth."));
calendar.add(new Monthly(2003, 5, 20, "Visit grandma."));
calendar.add(new Onetime(2004, 11, 2, "Dentist appointment."));
calendar.add(new Onetime(2004, 10, 31, "Trick or Treat."));
calendar.add(new Monthly(2004, 11, 2, "Dentist appointment."));
calendar.add(new Onetime(2004, 11, 2, "Dentist appointment."));
//note here we can simply use + calendar because we have
//implemented the toString() method
System.out.println("Before removal of appointment: " + "\n" + calendar);
calendar.remove(2004, 11, 2);
//note that the daily appointment is removed because it occurs on
//11/2/2004 (as well as many other days).
System.out.println("After removal of 11/2/2004: " + "\n" + calendar);

// test 2
Calendar myCalendar = new Calendar();
myCalendar.add(new Onetime(2007, 10, 1, "October Appointment"));
myCalendar.add(new Daily(2007, 11, 7, "Semiannual Checkup"));
myCalendar.add(new Monthly(2008, 5, 10, "Shopping Trip."));
myCalendar.add(new Onetime(2008, 9, 4, "Dentist appointment."));
myCalendar.add(new Onetime(2008, 10, 29, "Birthday Party."));
myCalendar.add(new Monthly(2008, 9, 4, "Doctor appointment."));
myCalendar.add(new Onetime(2008, 9, 4, "Hair appointment."));

System.out.println("Before removal of appointment: " + "\n" + myCalendar);
myCalendar.remove(2004, 9, 4);
System.out.println("After removal of 9/4/2008: " + "\n" + myCalendar);

// test 3
Calendar yourCalendar = new Calendar();
yourCalendar.add(new Onetime(2010, 10, 1, "Eye Doctor Appointment"));
yourCalendar.add(new Daily(2011, 11, 7, " Checkup"));
yourCalendar.add(new Monthly(2011, 4, 10, "Car wash."));
yourCalendar.add(new Onetime(2011, 4, 10, "Dentist."));
yourCalendar.add(new Onetime(2011, 4, 10, "Welcome Party."));
yourCalendar.add(new Monthly(2012, 9, 4, "Coffee date."));
yourCalendar.add(new Onetime(2011, 4, 10, "Bridal appointment."));

System.out.println("Before removal of appointment: " + "\n" + yourCalendar);
yourCalendar.remove(2011, 4, 10);
System.out.println("After removal of 4/10/2011: " + "\n" + yourCalendar);
}
}
