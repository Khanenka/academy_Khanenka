
package homework2;

import java.util.Scanner;

public class Chocolate extends Product {
	private double price;
	private String name;
	private int quantity;
	private double discount;

	public Chocolate() {
		super();
	}

	public Chocolate(String name, double price, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;

	}

	public double getDiscount() {
		if (quantity > 3) {

			discount = 0.05;

		} else if (quantity > 5) {

			discount = 0.2;

		}

		return discount;
	}

	public double getSum() {

		return this.price * this.quantity * getDiscount();
	}

	@Override
	public void getInfo() {
		System.out.println("name choco: " + name + " " + "price choco: " + price);
	}

}