package homework;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		System.out.println("Введите  число а: ");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		System.out.println("Введите  число b: ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c;
		if (a >= b) {
			System.out.println("число a>b  Среднее арифметическое " + (a + b) / 2);

		}
		if (a <= b) {
			System.out.println("число a<b  Среднее арифметическое " + (a + b) / 2);
		} else {
			System.out.println("число a=b  Среднее арифметическое " + (a + b) / 2);
		}

	}

}
