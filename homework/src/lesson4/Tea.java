package lesson4;

import java.util.Scanner;

public class Tea extends Product {
	final static double PRICE_TEA = 50;
	private String name;
	private final Product[] product;

	public Tea(String Name, double PRICE_TEA) {
		this.product = null;
		this.name = Name;
		PRICE_TEA = PRICE_TEA;

	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return getPRICE_TEA();
	}

	public static double getPRICE_TEA() {
		return PRICE_TEA;
	}

	public void getInfo() {
		System.out.println(name + " " + getPRICE_TEA());
	}

	public void getSum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество товара чай: ");
		int qantity1 = sc.nextInt();

		if (qantity1 < 0) {
			System.out.println("вы ввели некорректное количество");
		}
		if (getPrice() * qantity1 < 100) {
			System.out.println(getName() + " стоит с учетом скидки:" + (getPrice() * qantity1) * 0.95);

			System.out.println(getName() + " стоит стоит с учетом скидки:" + getPrice() * qantity1);

		} else {
			System.out.println(getName() + " стоит с учетом скидки:" + (getPrice() * qantity1) * 0.80);
		}
	}
}