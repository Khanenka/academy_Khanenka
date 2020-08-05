package lesson3;

public class Array3 {
	/*
	 * Создайте массив из 15 случайных целых чисел из отрезка [0;9].
	 * 
	 * Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и
	 * выведете это количество на экран на отдельной строке.
	 */
	public static void main(String[] args) {
		int count = 0;
		int[] array = new int[15];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 9);
			System.out.print(" " + array[i]);

			if (i % 2 == 0)
				count++;
		}
		System.out.println("    четные " + count);

	}
}
