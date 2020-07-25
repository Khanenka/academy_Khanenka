package homework2;

import java.util.Scanner;

public class task11 {
	public static void main(String[] args) {
		String str;
		String str1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово 1");
		str = sc.nextLine();
		if (str.length() < 2) {
			System.out.println("Введите слово больше");
		} else if (str.length() % 2 != 0) {
			System.out.println("Введите слово с четным количеством букв");
		}
		System.out.println("Введите слово 2");

		str1 = sc.nextLine();
		if (str1.length() < 2) {
			System.out.println("Введите слово больше");
		} else if (str1.length() % 2 != 0) {
			System.out.println("Введите слово с четным количеством букв");
		}
		System.out.println(str.substring(0, str.length() / 2) + str1.substring(str1.length() / 2));
	}

}
