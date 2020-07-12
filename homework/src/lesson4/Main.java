package lesson4;

public class Main {

	public static void main(String[] args) {
		MyTime mt = new MyTime();
		mt.getMyTime();
		User uservasya = new User("Вася", "Покупатель");
		User usergrisha = new User("Гриша", "Продавец");
		uservasya.getInfo();
		usergrisha.getInfo();

		Chocolate choco = new Chocolate("МИЛК", 3);
		Tea tea = new Tea("Золотая чаша", 3);

		choco.getInfo();
		tea.getInfo();
		choco.getSum();
		tea.getSum();
		

		MyTime mt1 = new MyTime();
		mt1.getMyTime();
	}
}
