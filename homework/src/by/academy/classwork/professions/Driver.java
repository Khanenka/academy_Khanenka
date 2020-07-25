package by.academy.classwork.professions;

import by.academy.classwork.vehicles.Car;
import classwork.oop.Person;

public class Driver extends Person {

	public int driverExperience;
	public Person person;

	public Driver(String fullName, int age, Person person, int DriverExperience) {
		super(fullName, age);
		this.driverExperience = driverExperience;

	}

	@Override
	public int getAge() {

		return super.getAge();
	}

	@Override
	public String getFullName() {

		return super.getFullName();
	}

	@Override
	public void setAge(int age) {

		super.setAge(age);
	}

	@Override
	public void setFullname(String fullName) {

		super.setFullname(fullName);
	}

	public int getDriverExperience() {
		return driverExperience;
	}

	public void setDriverExperience(int driverExperience) {
		this.driverExperience = driverExperience;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void getInfoEngine(Person person) {
		System.out.println(person);
	}

	public void getDriver(Person person) {
		System.out.println(getFullName() + getDriverExperience() + person.getAge() + person.fullName);
	}

}
