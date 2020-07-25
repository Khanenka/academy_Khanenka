package lesson3;

import java.util.Scanner;

public class Circle2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		System.out.println("Vvedite znachenie n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (i < n) {
			sum += i;
			i++;

		}
		System.out.println("Sum:" + sum);

	}
}