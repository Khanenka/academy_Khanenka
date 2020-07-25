package by.academy.classwork.regax;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
	public static void main(String[] args) {
		String s = "asas dsd ds";
		Pattern p = Pattern.compile("[a-zA-Z]+\\s");
		Matcher m = p.matcher(s);
		int counter = 0;

		while (m.find()) {
	
			counter++;
		}
		System.out.println("Counter=" + counter++);
	}

}
