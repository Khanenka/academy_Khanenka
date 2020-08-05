package lesson3;

public class Array4 {
	/*
	 * Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив
	 * на экран в строку.
	 * 
	 * Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
	 * экран на отдельной строке.
	 */
	public static void main(String[] args) {
		int count = 0;
		int[] array = new int[8];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (1 + Math.random() * 10);
			System.out.println(" " + array[i]);
			if (array[i] % 2 != 0)
				System.out.println("          " + (array[i] = 0));

		}

	}
}
