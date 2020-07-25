package lesson3;

import java.util.Random;

public class Arr0 {
	public static void main(String[] args) {
		int[] array = new int[10];
		Random rnd = new Random();
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(10);
			sum += array[i];
		}
		sum /= array.length;
		for (int i = 0; i < array.length; i++) {
			if (i < sum) {
				System.out.println(i);
			}else {
				System.out.println("i>sum:"+i);
			}

		}
	}

}
