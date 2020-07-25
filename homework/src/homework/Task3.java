package homework;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		System.out.println("������� ������������� ��� ������������ �����");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("number ������");
		} else {
			System.out.println("number ��������");
		}

	}

}
