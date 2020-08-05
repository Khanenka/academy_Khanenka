package lesson3;

public class Array6 {
	public static void main(String[] args) {
		/*
		 * Создайте массив из 4 случайных целых чисел из отрезка [10;99],
		 * 
		 * выведите его на экран в строку. Определить и вывести на экран сообщение о
		 * том, является ли массив строго возрастающей последовательностью.
		 */

		int array[] = new int[4];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
			System.out.println(array[i]);

		}
		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				if (array[i - 1] < array[i]) {
					System.out.println("Прогрессия не возрастающая");
					break;
				}
			}
			if (i == array.length - 1)
				System.out.println("Последовательность строго возрастающая");

		}
	}
}
