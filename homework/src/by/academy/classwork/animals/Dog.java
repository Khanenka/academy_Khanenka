package by.academy.classwork.animals;

public class Dog extends Animal {
	String name;

public Dog() {
	super();
}
public Dog(String name) {
	this.name=name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	public void eat() {
System.out.println("eat");

	}

	@Override
	public void makeNoise() {

	}

	@Override
	public void sleep() {

	}

}
