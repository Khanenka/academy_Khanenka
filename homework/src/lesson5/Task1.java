package lesson5;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		System.out.println("Ввести n строк");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		String str[] = new String[z];
		String veryShortString = null;
		String veryLongString = null;

		for (int i = 0; i <= z - 1; i++) {
			System.out.println("Ввести строку" + (i + 1));
			String y = sc.next();

			if ((veryShortString == null || y.length() > veryShortString.length())
					&& (veryShortString == null || y.length() > veryLongString.length())) {
				veryShortString = y;
				veryLongString = y;
			}
			System.out.println("Самая короткая строка = " + veryShortString + "Dlinna9" + veryLongString);
			System.out.println("Ее длина равна " + y.length());

		}
	}
}

/*
 * int lensmax = Integer.MIN_VALUE; int lensmin = Integer.MAX_VALUE; String smin
 * = new String(); String smax = new String(); String setalon = new String();
 * Scanner sin = new Scanner(System.in); System.out.
 * println("Введите n строк, окончание ввода строк, завершите пустой строкой.");
 * do { System.out.print("Введите строку символов: "); setalon = sin.nextLine();
 * if (setalon.length() >= lensmax) { smax = setalon; lensmax =
 * setalon.length(); } if (setalon.length() <= lensmin && setalon.length() > 0)
 * { smin = setalon; lensmin = setalon.length(); } } while (setalon.length() >
 * 0); System.out.println(); if (lensmax > lensmin) {
 * System.out.print("Самая длинная строка (последняя для одинаково длинных): ");
 * System.out.println(smax); System.out.println("Длина строки : " + lensmax +
 * " симв."); System.out.println();
 * System.out.print("Самая короткая строка (последняя для одинаково коротких): "
 * ); System.out.println(smin); System.out.println("Длина строки : " + lensmin +
 * " симв."); } else if (lensmax != 0) {
 * System.out.println("По длине строки одинаковы : по " + lensmax + " симв."); }
 * else { System.out.println("Недостаточно строк для сравнения."); }
 * 
 * 
 * }
 */
