package lesson10;

import lesson10.User.Query;

public class User_Main {
	public static void main(String[] args) {
		User user = new User("fdf,", 123);
		user.new Query().printToLog();
		new User("Bestlogin", 1234).new Query().printToLog();
		User1 user1 = new User1("igor", 123);
		user1.createQuery1();
	}

}
