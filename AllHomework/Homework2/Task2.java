package Homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	public static Pattern p = Pattern.compile("^([0]?[1-9]|[1|2][0-9]|[3][0|1])/([0][1-9]|1[0-2])/\\d{4}");
	public static Pattern p1 = Pattern.compile("^([0]?[1-9]|[1|2][0-9]|[3][0|1])-([0]?[1-9]|1[0-2])-\\d{4}");

	public static void main(String[] args) {
		String[] tests = { "50/50/9999", "00/00/0000", "43/12/2020", "12/12/2020" };
		String[] tests1 = { "50/50/9999", "00/00/0000", "12/12/2020,12-12-89" };
		for (String t : tests) {

			Matcher m1 = p.matcher(t);

			if (m1.find()) {
				System.out.println(m1.group(0));

			} else
				System.out.println("filed");
		}

		for (String t : tests1) {
			Matcher m2 = p.matcher(t);

			if (m2.find(0)) {
				System.out.println(m2.group(0));
			} else {
				System.out.println("filed");

			}
		}

	}

	public static boolean isValidDateString(String stringDate) {
		Matcher m1 = p.matcher(stringDate);
		if (m1.find()) {
			return true;
		}
		Matcher m2 = p1.matcher(stringDate);
		if (m2.find()) {
			return true;
		}
		return false;
	}
}
