package by.academy;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.println("Vvedite sum");
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		System.out.println("Vvedite age");
		Scanner sc1 = new Scanner(System.in);
		int age = sc.nextInt();
		if (sum < 100) {
			System.out.println("sum=" + sum * 0.95);
		} else if (sum < 200) {
			System.out.println("sum=" + sum * 0.93);
		} else if (sum < 300 && age > 18) {
			System.out.println("sum=" + (sum * 0.92));
		} else if (sum < 300) {
			System.out.println("sum=" + (sum * 0.88));
		} else if (sum < 400) {
			System.out.println("sum=" + sum * 0.85);
		} else if (sum > 400) {
			System.out.println("sum=" + sum * 0.80);
			sc.close();
			sc1.close();

		}

	}

}
