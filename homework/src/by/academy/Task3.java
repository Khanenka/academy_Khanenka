package by.academy;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		System.out.println("vvedite chislo ot 1 do 10");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(x + "*" + i + "=" + i * x);
			sc.close();
		}
	}
}