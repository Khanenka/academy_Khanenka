package Homework2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import Homework3.Deal;

public class Main {

	public static void main(String[] args) throws ParseException {

		DealStatus dealStatus = DealStatus.IN_PROGRESS;
		User uservasya = new User("Вася", "Покупатель");
		/*
		 * uservasya.setDateOfBirth(); uservasya.setPhone(); uservasya.setMale();
		 */
		User usergrisha = new User("Гриша", "Продавец");
		uservasya.getInfo();
		usergrisha.getInfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите имя продукта: ");
		String namep = sc.next();

		System.out.println("Введите цену продукта: ");
		int prPr = sc.nextInt();

		System.out.println("Введите количество продукта: ");
		int quPr = sc.nextInt();

		Product prod = new Product(namep, prPr, quPr);

		System.out.println("Введите имя чая: ");
		String nameT = sc.next();

		System.out.println("Введите цену чая: ");
		int prTe = sc.nextInt();

		System.out.println("Введите количество чая: ");
		int quTe = sc.nextInt();

		Tea tea = new Tea(nameT, prTe, quTe);

		System.out.println("Введите имя шоколада: ");
		String nameCh = sc.next();

		System.out.println("Введите цену шоколада: ");
		int prCh = sc.nextInt();

		System.out.println("Введите количество шоколада: ");
		int quCh = sc.nextInt();

		Chocolate choco = new Chocolate(nameCh, prCh, quCh);

		ArrayList<Product> products = new ArrayList<Product>();
		Deal deal = new Deal(uservasya, usergrisha, products);
		products.add(tea);
		products.add(choco);

		System.out.println("До добавления:");

		System.out.println("После добавления ещё одного продукта");
		products.add(prod);
		deal.deal();
		deal.getSum();

		deal.getMyTime();

		System.out.println("Сумма со скидкой на продукт:" + prod.getSum());
		System.out.println("Сумма со скидкой на чай:" + tea.getSum());
		System.out.println("Сумма со скидкой на шоколад:" + choco.getSum());

	}
}
