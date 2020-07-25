package lesson3;

import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
		int[] array = new int[15];

		Random rnd = new Random();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(10);

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if (i % 2 == 0) {
				count++;
				System.out.println(count);
				

			}

		}
	}
}