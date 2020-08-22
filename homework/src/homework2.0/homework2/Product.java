package homework2;

import java.util.Scanner;

@ProducerInfo(company = "AlpenGold,Nuri", name = "choco", number = 0, productTypes = { "chocolate", "tea" })
public
class Product {
	private double price;
	private String name;
	private int quantity;
	private double discount;

	public Product() {
		super();
	}

	public Product(String name, double price, int quantity) {
		super();

		this.name = name;

		this.quantity = quantity;

		this.price = price;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getQuantity() {

		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void getInfo() {
		System.out.println("name product: " + name + " " + "price product: " + price);
	}

	public double getDiscount() {
		if (price > 30) {

			discount = 0.05;

		} else if (quantity > 70) {

			discount = 0.15;

		} else {
			discount = 1;
		}

		return discount;
	}

	public double getSum() {

		return price * quantity * getDiscount();
	}

}
