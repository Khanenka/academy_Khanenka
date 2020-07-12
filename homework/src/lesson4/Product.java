package lesson4;

abstract class Product {

	private double price;
	private String name;

	public Product() {
		super();
	}

	public Product(String name) {
		this.name = name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void getInfo() {
		System.out.println(name + " " + price);
	}

}
