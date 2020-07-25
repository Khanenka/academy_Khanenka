
package homework2;

import java.util.Scanner;

public class Tea extends Product {
	private double price;
	private String name;
	private int quantity;

	public Tea() {
		super();
	}

	public Tea(String name, double price, int quantity) {
		super();
		this.name = name;

		this.quantity = quantity;

		this.price = price;

	}

	@Override
	public void getInfo() {
		System.out.println("name tea: " + name + "," + "price tea: " + price);
	}

	public double getSum() {

		return price * quantity;
	}

}
