package homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator {

	private Pattern p = Pattern.compile("^\\+1[\\d]{11}$");

	public boolean validate(String vString) {

		Matcher m = p.matcher(vString);

		return m.find();

	}

}
