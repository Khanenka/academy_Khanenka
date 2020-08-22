package homework2;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class BelarusPhoneValidator {

	private Pattern p = Pattern.compile("^\\+37529[\\d]{7}$");

	public boolean validate(String vString) {

		Matcher m = p.matcher(vString);

		return m.find();

	}

}