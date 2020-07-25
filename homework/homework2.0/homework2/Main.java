package homework2;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {

		DealStatus dealStatus = DealStatus.IN_PROGRESS;

		User uservasya = new User("Вася", "Покупатель");
		uservasya.setDateOfBirth();
		uservasya.setPhone();
		uservasya.setMale();
		User usergrisha = new User("Гриша", "Продавец");
		uservasya.getInfo();
		usergrisha.getInfo();
		Product prod = new Product("Помидоры", 25, 2);
		Tea tea = new Tea("Золотая чаша", 1, 2);
		Chocolate choco = new Chocolate("Milk", 5, 5);
		Product[] products = { prod, tea, choco };

		Deal deal = new Deal(uservasya, usergrisha, products);
		deal.getMyTime();
		prod.getInfo();
		tea.getInfo();
		choco.getInfo();
		System.out.println("Сумма со скидкой на продукт:" + prod.getSum());
		System.out.println("Сумма со скидкой на чай:" + tea.getSum());
		System.out.println("Сумма со скидкой на шоколад:" + choco.getSum());

	}
}
