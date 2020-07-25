package homework2;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

@ProducerInfo(company = "22", name = "22", number = 0, productTypes = { "22", "22" })
public class Deal extends Product {
	private User buyer;
	private User seller;
	private Product[] products;
	private double price;

	public Deal() {
		super();
	}

	public Deal(User buyer, User seller, Product[] products) {
		super();
		this.buyer = buyer;
		this.seller = seller;
		this.products = products;

	}

	public Deal(int a) {

		super();

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

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
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

		price = summ;
	}

	public void getMyTime() {
		GregorianCalendar calendar = new GregorianCalendar();

		calendar.add(Calendar.DAY_OF_YEAR, +10);
		System.out.println(calendar.getTime());

	}
}