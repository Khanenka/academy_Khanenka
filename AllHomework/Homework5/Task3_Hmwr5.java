package Homework5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task3_Hmwr5 {
	public static void main(String[] args) {
		ArrayList<User> userlist = new ArrayList<>();
		userlist.add(new User("Вася", "Первый", 18));
		userlist.add(new User("Саша", "Второй", 21));
		userlist.add(new User("Маша", "Третой", 22));
		userlist.add(new User("Юля", "Четвертый", 24));
		userlist.add(new User("Миша", "Пятый", 44));
		userlist.add(new User("Леша", "Шестой", 34));
		userlist.add(new User("Антон", "Седьмой", 32));
		userlist.add(new User("Витя", "Восьмой", 54));
		userlist.add(new User("Юра", "Девятый", 23));
		userlist.add(new User("Валера", "Десятый", 5));

		try {
			File file = new File("users");
			file.mkdir();
			String filename;

			for (User u : userlist) {
				filename = u.firstName + "_" + u.lastName + ".txt";
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
						"C:\\Users\\wimbi\\eclipse-workspace\\Homework-academy\\users\\" + filename));
				oos.writeObject(u.toString());
				oos.close();
			}

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

}
