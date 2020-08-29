package Homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import Homework2.ProducerInfo;
import Homework2.Product;
import Homework2.User;

@ProducerInfo(company = "22", name = "22", number = 0, productTypes = { "22", "22" })
public class Deal extends Product {
	private User buyer;
	private User seller;
//	private Product[] products;
	private double price;
	private ArrayList<Product> products;

	public Deal() {
		super();
	}

	public Deal(User buyer, User seller, ArrayList<Product> products) {
		super();
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;

	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void deal() {

		double summ = 0;

		for (Product p : products) {

			System.out.println(summ += p.getSum());

		}

		this.price = summ;
	}

	public void getMyTime() {
		GregorianCalendar calendar = new GregorianCalendar();

		calendar.add(Calendar.DAY_OF_YEAR, +10);
		System.out.println(calendar.getTime());

	}
}