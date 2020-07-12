package lesson4;

import java.util.Scanner;

public class Chocolate extends Product {
	final static double PRICE_CHOCOLATE = 33;
	private String name;

	public Chocolate(String Name, double PRICE_CHOCOLATE) {

		this.name = Name;
		PRICE_CHOCOLATE = PRICE_CHOCOLATE;

	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return getPRICE_CHOCOLATE();
	}

	public static double getPRICE_CHOCOLATE() {
		return PRICE_CHOCOLATE;
	}

	public void getInfo() {
		System.out.println(name + " " + getPRICE_CHOCOLATE());
	}

	public void getSum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество товара шоколад: ");
		int qantity = sc.nextInt();

		if (qantity < 0) {
			System.out.println("вы ввели некорректное количество");
		}
		if (getPrice() * qantity < 100) {
			System.out.println(getName() + " стоит :" + (getPrice() * qantity));

		} else if (getPrice() * qantity > 100 && getPrice() * qantity < 250) {
			System.out.println(getName() + " стоит с учетом скидки:" + (getPrice() * qantity) * 0.95);
		} else {
			System.out.println(getName() + " стоит с учетом скидки:" + (getPrice() * qantity) * 0.80);
		}
	}

}
