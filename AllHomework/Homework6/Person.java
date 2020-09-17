package Homework6;

import java.util.Date;

public class Person {
	public String firstName;
	private String lastName;
	protected int age;
	private Date dateOfBirth;

	public Person() {
		super();
		String firstName;
		String lastName;
		int age;
		Date dateOfBirth;

	}

	public Person(String firstName, String lastName, int age, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void printUserInfo() {
		System.out.println(
				"User info:" + lastName + "LastName" + "firstName=" + "+firstName+date=" + dateOfBirth + "age" + age);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
}
