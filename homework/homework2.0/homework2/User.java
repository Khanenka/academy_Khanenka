package homework2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
	private Scanner sc = new Scanner(System.in);
	public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");
	private String name;
	private String status;
	private Date dateOfBirth;
	private String phone;
	private String mail;

	public User(String name, String status) {
		this.name = name;
		this.status = status;

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone() {
		String ph;
		BelarusPhoneValidator belvalidator = new BelarusPhoneValidator();

		do {
			System.out.println("Введите phone (валидный формат телефона \"+375296666666 ");
			ph = sc.nextLine();
			if (belvalidator.validate(ph)) {
				this.phone = phone;
			} else {
				System.out.println(("Вы ввели неверный телефон"));
			}

		} while (!belvalidator.validate(ph));
	}

		
	

	public String getMale() {
		return mail;
	}

	public void setMale() {
		String email;
		EmailValidator validator = new EmailValidator();

		do {
			System.out.println("Введите mail (валидный формат \"www.tut.by   www.test.by: ");
			email = sc.nextLine();
			if (validator.validate(email)) {
				this.mail = email;
			} else {
				System.out.println(("Вы ввели неверное мыло"));
			}

		} while (!validator.validate(email));
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setStatus(String status) {
		this.status = status;

	}

	public String getStatus() {
		return status;
	}

	public void getInfo() {
		System.out.println(name + " " + status);

	}

	public Date getDateOfBirth() {

		return dateOfBirth;
	}

	public void setDateOfBirth() throws ParseException {

		String dOb;

		while (true) {

			System.out.println("Введите дату рождения (валидный формат \"dd/MM/yyyy\" or \"dd-MM-yyyy\"): ");

			dOb = sc.nextLine();

			if (ValidateDate.validate1(dOb)) {

				this.dateOfBirth = format1.parse(dOb);

				return;

			} else if (ValidateDate.validate2(dOb)) {

				this.dateOfBirth = format2.parse(dOb);

				return;

			}

			System.out.println("Вы ввели не валидную дату");

		}

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}

}
