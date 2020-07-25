package by.academy.classwork.animals;

public class Horse extends Animal {
	protected String name;

	public Horse(String name) {
		super();
		this.name = name;
	}

	@Override
	public void eat() {
		System.out.println(name + " ест");

	}

	@Override
	public void makeNoise() {
		System.out.println(name + "говорит бррр");

	}

	@Override
	public void sleep() {
		System.out.println(name + "спит");

	}

}
