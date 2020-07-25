package homework2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task3 {
	public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");

	public static void main(String[] args) throws ParseException {

		String[] tests = { "50/50/9999", "00/00/0000", "43/12/2020", "12/12/2020" };
		String[] tests1 = { "50-50-9999", "00-00-0000", "12-12-2020,12-12-89" };
		for (String p : tests) {
			boolean isValid = Task2.isValidDateString(p);
			if (isValid) {
				Date date = format1.parse(p);
				System.out.println(date);
			}

		}
		for (String p : tests1) {
			boolean isValid = Task2.isValidDateString(p);
			if (isValid) {
				Date date = format2.parse(p);
				System.out.println(date);
			}
		}
	}

}
