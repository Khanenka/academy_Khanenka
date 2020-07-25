package lesson9;

import classwork.oop.Book;

public class Main {
	public static void main(String[] args) {
		Box<Book> book=new Box<Book>();
		book.setItem(new Book("Name", 3, "Bukouski","lost"));
		book.getItem().returnBook();
	}

}
