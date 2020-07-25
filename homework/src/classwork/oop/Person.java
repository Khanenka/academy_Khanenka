package classwork.oop;

import by.academy.classwork.professions.Driver;

public class Person {

	public String fullName;
	public int age;

	public Person() {
		super();
	}

	public Person(String fullName, int age) {

		this.fullName = fullName;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullname(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void move() {
		System.out.println("такой-то " + fullName + " говорит");
	}

	public void move(String Person) {
		System.out.println("такой-то " + fullName + " говорит");
	}

	public void talk() {
		System.out.println("такой-то " + fullName + " говорит");
	}

	public void talk(String Person) {
		System.out.println("такой-то " + fullName + " говорит");
	}

}
