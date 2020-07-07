package by.academy;

import java.io.IOException;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) throws IOException {
		System.out.println("Vvedite tip dannix:");
		Scanner sc = new Scanner(System.in);
		String type = sc.nextLine();
		System.out.println("Vvedite peremennuyu:");
		Scanner sc1 = new Scanner(System.in);

		switch (type) {
		case "int":
			int variableint = sc.nextInt();
			System.out.println(variableint % 2);
			break;
		case "double":
			double variabledouble = sc.nextDouble();
			System.out.println(variabledouble * 0.7);
			break;
		case "float":
			float variablefloat = sc.nextFloat();
			System.out.println(variablefloat * variablefloat);
			break;
		case "char":
			int x = System.in.read();
			char c = (char) x;
			System.out.println("Код символа: " + c + " = " + x);
			break;
		case "String":
			String variablestring = sc.nextLine();
			System.out.println("Hello " + variablestring);
			break;

		default:
			System.out.println("Unsupported type");
			sc.close();
			sc1.close();
		}
	}
}