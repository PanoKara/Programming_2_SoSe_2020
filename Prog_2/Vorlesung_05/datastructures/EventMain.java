package datastructures;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;

public class EventMain {

	public static void main(String[] args) {
		
		//SimpleDateFormat date = new SimpleDateFormat("DD.MM.YYYY");
		
		Calendar cal1 =Calendar.getInstance();
		Calendar cal2 =Calendar.getInstance();
		Calendar cal3 =Calendar.getInstance();
		
		cal1.set(2020, 05, 23);
		cal2.set(2021, 11, 23);
		cal3.set(2022, 06, 13);

		HashSet <Event> event = new HashSet <>();
		
		event.add(new Event ("Metal Bash", "Wedel", cal1));
		event.add(new Event ("DockLand", "Cuxhaven", cal2));
		event.add(new Event ("GetJazzed", "HafenCity", cal3));
		
	
	}
}
