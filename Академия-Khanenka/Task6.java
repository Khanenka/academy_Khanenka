package by.academy;

import java.io.IOException;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) throws IOException {
		byte[] letters = new byte[256];
		boolean f = true;

		System.out.println("String1:");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("String2:");
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.nextLine();

		byte[] result = new byte[256];

		for (char c : str.toCharArray()) {

			result[c]++;

		}

		for (char c : str1.toCharArray()) {

			result[c]--;

		}

		for (byte b : result) {

			if (b != 0) {

				System.out.println("Strings noteqals");

				f = false;

				break;

			}

		}

		if (f) {

			System.out.println("string eqals!!!");
			sc.close();
			sc1.close();
		}
	}
}
