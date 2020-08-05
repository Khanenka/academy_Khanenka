package lesson9;

import classwork.oop.Book;
import homework2.Product;

public class Main {
	public static void main(String[] args) {
		Box<Book> book = new Box<Book>();
		book.setItem(new Book("Name", 3, "Bukouski", "lost"));
		book.getItem().returnBook();
		Box<Product> pr = new Box<Product>();
		pr.setItem(new Product("dds", 12, 13));
		pr.getItem().getInfo();
		pr.getArrIndex(1);
	}

}
