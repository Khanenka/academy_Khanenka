package lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
	/*
	 * 2) Задача: Можно писать все в main. Не нужно создавать новых классов.
	 * Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
	 * Напишите еще один метод, который выбирает из заполненного списка элемент
	 * наугад 100000 раз. Замерьте время, которое потрачено на это. Сравните
	 * результаты и предположите, почему они именно такие.
	 */
	public static void main(String[] args) {
		/*
		 * List<Integer> arrayList = new ArrayList<>(); LinkedList<Integer> list = new
		 * LinkedList<>(); Date date = new Date(); long time = date.getTime(); for (int
		 * i = 0; i < 100_000; i++) {
		 * 
		 * arrayList.add(i);
		 * 
		 * } Date date1 = new Date(); long time1 = date1.getTime();
		 * System.out.println(time1- time); for (int i = 0; i < 100_000; i++) {
		 * 
		 * arrayList.get((int) Math.random());
		 */

		Integer[] integers = new Integer[1_000_000];
		Random r = new Random();
		for (int i = 0; i < integers.length; i++) {
			integers[i] = r.nextInt();
		}
		long stop;
		long start = System.nanoTime();
		LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.asList(integers));
		stop = System.nanoTime();
		System.out.println((stop - start) / 1000000);

		start = System.nanoTime();
		ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(integers));
		stop = System.nanoTime();
		System.out.println("Разница времени ");
		System.out.println(stop - start);

	}

}