package homework3_0;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

	
	public static Pattern p = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");

	

	public static boolean validate(String string) {

		Matcher m = p.matcher(string);

		if (m.find()) {

			return true;

		}

		return false;

	}

	

}