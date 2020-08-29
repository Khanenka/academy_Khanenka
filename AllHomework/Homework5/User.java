package Homework5;
import java.io.Serializable;

public class User implements Serializable {
	String firstName;
	String lastName;
	int age;

	public User() {
		super();
	}

	User(String firstName, String lastName, int age) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;

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

}
