package lesson5;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		/*
		 * Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше
		 * (больше)
		 * 
		 * средней, а также длину.
		 */
		String[] arr = new String[3];
		Scanner in = new Scanner(System.in);
		System.out.println("Введите строку 3 раза");
		for (int i = 0; i < 3; i++) {
			arr[i] = in.nextLine();
		}
		int sum = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			for(int j=0;j<i;j++) {
			sum += arr[j].length()/2;

		}
			
	System.out.println("Общая длина все строк "+arr[i].length()+" Средняя длина:"+arr[i]);

	}
}
}