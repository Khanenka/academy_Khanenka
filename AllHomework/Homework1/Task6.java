package Homework1;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		System.out.println("�������  ����� �: ");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		System.out.println("�������  ����� b: ");
		int b = sc1.nextInt();
		int c;
		if (a > b) {
			System.out.println("����� a>b  ������� �������������� " + (a + b) / 2);

		} else if (a < b) {
			System.out.println("����� a<b  ������� �������������� " + (a + b) / 2);
		} else {
			System.out.println("����� a=b  ������� �������������� " + (a + b) / 2);
		}

	}

}
