package Homework2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	private Pattern p = Pattern.compile("^[A-Z0-9a-z._%+-]+@[A-Za-z0-9\\.-]+\\.[A-Za-z]{2,64}$");

	public boolean validate(String vString) {

		Matcher m = p.matcher(vString);

		return m.find();

	}

}
