package lesson3;

public class Array5 {
	public static void main(String[] args) {
		/*
		 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
		 * 
		 * выведите массивы на экран в двух отдельных строках. Посчитайте среднее
		 * арифметическое элементов каждого массива и сообщите,
		 * 
		 * для какого из массивов это значение оказалось больше (либо сообщите, что их
		 * средние арифметические равны).
		 */
		int sum = 0;
		int sum1 = 0;
		int array[] = new int[5];
		int array1[] = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 5);
			sum = sum + array[i];

		}
		for (int i = 0; i < array1.length; i++) {
			array[i] = (int) (Math.random() * 5);
			sum1 = sum + array[i];

		}
		System.out.println("array[] " + sum);
		System.out.println("array1[] " + sum1);
		if (sum > sum1) {
			System.out.println("array[] > array1");
		} else if (sum < sum1) {
			System.out.println("array1[] > array");
		} else {
			System.out.println("array1[] = array");
		}

	}
}