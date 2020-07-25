package lesson5;

import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		int lensmax = Integer.MIN_VALUE;
		int lensmin = Integer.MAX_VALUE;
		String smin = new String();
		String smax = new String();
		String setalon = new String();
		Scanner sin = new Scanner(System.in);
		System.out.println("Введите n строк, окончание ввода строк, завершите пустой строкой.");
		do {
			System.out.print("Введите строку символов: ");
			setalon = sin.nextLine();
			if (setalon.length() >= lensmax) {
				smax = setalon;
				lensmax = setalon.length();
			}
			if (setalon.length() <= lensmin && setalon.length() > 0) {
				smin = setalon;
				lensmin = setalon.length();
			}
		} while (setalon.length() > 0);
		System.out.println();
		if (lensmax > lensmin) {
			System.out.print("Самая длинная строка (последняя для одинаково длинных): ");
			System.out.println(smax);
			System.out.println("Длина строки : " + lensmax + " симв.");
			System.out.println();
			System.out.print("Самая короткая строка (последняя для одинаково коротких): ");
			System.out.println(smin);
			System.out.println("Длина строки : " + lensmin + " симв.");
		} else if (lensmax != 0) {
			System.out.println("По длине строки одинаковы : по " + lensmax + " симв.");
		} else {
			System.out.println("Недостаточно строк для сравнения.");
		}

	}

}
