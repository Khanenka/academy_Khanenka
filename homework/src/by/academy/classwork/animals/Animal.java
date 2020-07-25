package by.academy.classwork.animals;

public abstract class Animal {

	protected String food;
	protected String location;

	public Animal() {
		super();
	}

	public Animal(String food, String location) {
		super();
	}

	public String getFood() {
		return food;
	}

	public String getLocation() {
		return location;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public abstract void eat();

	public abstract void makeNoise();

	public abstract void sleep();

}
