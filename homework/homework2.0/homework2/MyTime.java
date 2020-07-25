package lesson4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyTime {
	GregorianCalendar calendar = new GregorianCalendar();

	public void getMyTime() {
		System.out.println(calendar.get(Calendar.YEAR) + ":" + calendar.get(Calendar.MONTH) + ":"
				+ calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":"
				+ calendar.get(Calendar.SECOND));
	}
}
