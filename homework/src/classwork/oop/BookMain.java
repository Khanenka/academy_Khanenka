package classwork.oop;

import homework2.Deal;

public class BookMain {
	public static void main(String[] args) {

		Book b = new Book("Ваcя", 3, "Kалыгов В.В.", "в мире животных");
		Reader r = new Reader(b, 3, "fm", "2223414", 22);
		r.readerInfo();
		b.takeBook();
		b.returnBook();

	}

}
