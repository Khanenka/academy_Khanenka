package homework4_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class RatingMain {
	public static void main(String[] args) {
		Integer[] integers = new Integer[10];
		Random r = new Random();
		for (int i = 0; i < integers.length; i++) {
			integers[i] = r.nextInt(10) + 1;
			System.out.println(integers[i]);
		}
		ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(integers));
		System.out.println(integerArrayList);
		/*
		 * Rating iterator = new Rating(integers); while (iterator.hasNext()) {
		 * 
		 * System.out.print("Наибольшая оценка:"+iterator.next()+" ");
		 */

		Iterator<Integer> iterator = integerArrayList.iterator();
		int pos = 0;
		int count;
		while (iterator.hasNext()) {
			count = iterator.next();
			if (pos < count) {

				pos = count;

			}

		}
		System.out.print(pos);
	}
}
