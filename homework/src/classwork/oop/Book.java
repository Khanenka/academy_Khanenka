package classwork.oop;

public class Book {
	String nameBook;
	String name;
	int quantity;
	String nameAutor;

	public Book() {
		super();
	}

	public Book(String name, int quantity, String nameAutor,String nameBook) {
		super();
		this.name = name;
		this.nameAutor = nameAutor;
		this.quantity = quantity;
this.nameBook=nameBook;
	}
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}
	public String getNameBook() {
		return nameBook;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantuty) {
		this.quantity = quantity;
	}

	public String getNameAutor() {
		return nameAutor;
	}

	public void setNameAutor(String nameAutor) {
		this.nameAutor = nameAutor;
	}

	public void takeBook() {
		System.out.println(name + " взял " + quantity + " книги " + nameAutor+" "+nameBook);
	}

	public void returnBook() {
		System.out.println(name + " вернул " + quantity + " книги " + nameAutor+" "+nameBook);
	}

}
