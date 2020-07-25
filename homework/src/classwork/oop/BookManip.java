package classwork.oop;

public class BookManip {
	private String name;
	private int quantity;
private Book [] books;
public BookManip() {
	super();
}
public BookManip(Reader name,Reader quantity,Book [] books) {
	super();
	this.name=name;
	this.quantity=quantity;
	this.books=books;
	
}
public Reader getName() {
	return name;
}
public void setName(Reader name) {
	this.name=name;
}
public Reader getQuantity() {
	return quantity;
	
}
public void setQuantuty(Reader quantity) {
	this.quantity=quantity;
}
public Book[] getBooks() {
	return books;
}
public void setBooks(Book [] books) {
	this.books=books;
}
public void settakeBook(String name, int quantity) {
	this.name=name;
	this.quantity=quantity;
	System.out.println(name+"взял"+quantity+"книги");
}


}
