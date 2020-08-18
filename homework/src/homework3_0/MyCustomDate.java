package homework3_0;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyCustomDate {
	/*
	 * Создать объект класса Date, используя вложенные классы Год, Месяц, День.
	 * Методы: задать дату, вывести на консоль день недели по заданной дате. День
	 * недели представить в виде перечисления. Рассчитать количество дней, в
	 * заданном временном промежутке. Один из конструкторов - строка в формате
	 * dd-mm-yyyy, добавить валидацию для этой строки. После валидации в
	 * конструкторе создаем объекты класса Year, Month, Day. Добавить метод, который
	 * проверяет высокосный ли год или нет.
	 */
	static String date;
	Month month;
	Year year;
	Day day;

	Integer y;
	Integer m;
	Integer d;

	public MyCustomDate(String date) {
		this.date = date;
	}

	public MyCustomDate(int d, int month, int year) {
		StringBuilder sb = new StringBuilder();
		sb.append(d).append("-").append(month).append("-").append(year);
		this.date = sb.toString();
		/*
		 * this.d = d; if (d < 1 && d > 7) { System.out.println("Неверный день"); }
		 * this.m = month; if (d < 1 && d > 12) { System.out.println("Неверный месяц");
		 * } this.y = year;
		 * 
		 * }
		 */
	}

	public void getDate() {
		System.out.println(d + "-" + m + "-" + y);
		;
	}

	public String getDate1() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	class Year {
		private String year;

		public Year(String year) {
			this.year = year;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public void bissextile() {

			Scanner input = new Scanner(System.in);
			System.out.println("Input  year:");
			int year = input.nextInt();
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("bissextile");
			} else {
				System.out.println("not bissextile");

			}

		}

	}

	class Day {
		String day;

		public Day(String day) {
			this.day = day;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}
	}

	public class Month {
		String month;

		public Month(String month) {
			this.month = month;

		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}

		public void getMonthNumber() {
			System.out.println("Input name of month:");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();

			switch (number) {
			case 1:
				System.out.println("Январь");
				break;
			case 2:
				System.out.println("Февраль");
				break;
			case 3:
				System.out.println("Март");
				break;
			case 4:
				System.out.println("Апрель");
				break;
			case 5:
				System.out.println("Май");
				break;
			case 6:
				System.out.println("Июнь");
				break;
			case 7:
				System.out.println("Июль");
				break;
			case 8:
				System.out.println("Август");
				break;
			case 9:
				System.out.println("Сентябрь");
				break;
			case 10:
				System.out.println("Октябрь");
				break;
			case 11:
				System.out.println("Ноябрь");
				break;
			case 12:
				System.out.println("Декабрь");
				break;
			default:
				System.out.println("Нет такого месяца");
			}
		}

	}
}
