package lesson3;

import java.util.Scanner;

public class Circle3 {
	public static void main(String[] args) {
		int mul = 1;
		int i = 1;
		System.out.println("Vvedite znachenie n :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (i < n) {
			mul *= i;
			i++;

		}
		System.out.println("Mul:" + mul);

	}

}
