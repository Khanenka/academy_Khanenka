package Homework2;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		/*
		 * . Ввести n слов с консоли. Найти слово, в котором число различных символов
		 * минимально.
		 * 
		 * Если таких слов несколько, найти первое из них.
		 */
		String[] arr = { "aabbcc", "aaa", "a" };
		int indexMinUnique = 0;
		int minUniqueChars = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int currentUniqueCounter = 0;
			char[] carr = new char[65538];
			for (char c : arr[i].toCharArray()) {
				carr[c]++;
			}
			for (char c : carr) {
				if (c != 1) {
					currentUniqueCounter++;
				}
			}
			if (currentUniqueCounter < minUniqueChars) {
				minUniqueChars = currentUniqueCounter;
				indexMinUnique = i;
			}
		}
		System.out.println(arr[indexMinUnique]);
	}
}
