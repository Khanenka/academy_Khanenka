package homework3_0;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import homework2.ValidateDate;
import homework3_0.MyCustomDate.Year;

public class MainDate {

	public static void main(String[] args) throws ParseException {
		Object date;
		SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");
		Scanner sc = new Scanner(System.in);
		String dConstr = null;
		String dConstr1 = null;
		Date dayWeek = null;
		Date dateOne = null;
		Date dateTwo = null;

		MyCustomDate date1 = new MyCustomDate(dConstr);
		MyCustomDate.Year year = date1.new Year("2020");
		MyCustomDate.Month month = date1.new Month("2");
		MyCustomDate.Day day = date1.new Day("28");

		while (true) {

			System.out.println("Введите дату  (валидный формат \"dd/MM/yyyy\" or \"dd-MM-yyyy\"): ");

			dConstr = sc.nextLine();

			if (ValidateDate.validate2(dConstr)) {
				date = format2.parse(dConstr);

				System.out.println(dConstr);
				break;
			} else

				System.out.println("Вы ввели не валидную дату");

		}
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

		try {
			dayWeek = format.parse((String) dConstr);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Вывод дня недели даты на экран
		System.out.println("День недели:" + new SimpleDateFormat("EEEE").format(dayWeek));

		MyCustomDate date2 = new MyCustomDate(dConstr1);
		while (true) {

			System.out.println("Введите дату  (валидный формат \"dd/MM/yyyy\" or \"dd-MM-yyyy\"): ");

			dConstr1 = sc.nextLine();

			if (ValidateDate.validate2(dConstr)) {
				date = format2.parse(dConstr1);

				System.out.println(dConstr1);
				break;
			} else

				System.out.println("Вы ввели не валидную дату");

		}

		try {
			dateOne = format.parse(dConstr);
			dateTwo = format.parse(dConstr1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Количество дней между датами в миллисекундах
		long difference = dateOne.getTime() - dateTwo.getTime();
		// Перевод количества дней между датами из миллисекунд в дни
		int days = (int) (difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
		// Вывод разницы между датами в днях на экран
		System.out.println(days + " дн.");

		System.out.println("Введите день");
		int d = sc.nextInt();
		System.out.println("Введите месяц");
		int m = sc.nextInt();
		System.out.println("Введите год");
		int y = sc.nextInt();
		MyCustomDate date3 = new MyCustomDate(d, m, y);
		date3.getDate();
		date1.new Year("2020").bissextile();
		date1.new Month("2").getMonthNumber();

		// Переводим строку в дату

	}
}