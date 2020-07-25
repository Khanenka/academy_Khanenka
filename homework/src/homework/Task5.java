package homework;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		System.out.println("�������  ����� �: ");
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		System.out.println("�������  ����� b: ");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c;
		if (a > b) {
			System.out.println("����� a>b  ������� �������������� " + (a + b) / 2);

		}else 
		if (a < b) {
			System.out.println("����� a<b  ������� �������������� " + (a + b) / 2);
		} else {
			System.out.println("����� a=b  ������� �������������� " + (a + b) / 2);
		}

	}

}
