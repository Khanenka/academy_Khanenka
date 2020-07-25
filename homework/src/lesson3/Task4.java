package lesson3;

import java.util.Random;

public class Task4 {
	public static void main(String[] args) {
		int[] array = new int[10];
		Random rnd = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(9);
			if (array[i] % 2 == 1) {
				array[i] = 0;
				System.out.println(array[i]);

			}

		}

	}
}