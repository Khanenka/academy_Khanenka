package by.academy.classwork.vehicles;

import by.academy.classwork.details.Engine;
import by.academy.classwork.professions.Driver;

public class Lorry extends Car {

	int bodyLoad;

	public Lorry(String brand, String classAuto, int weight, Driver driver, int bodyLoad) {

		super(brand, classAuto, weight, driver);
		this.bodyLoad = bodyLoad;
	}

	public void start() {
		super.start();
	}

	public void stop() {
		super.stop();

	}

	public void turnRight() {
		super.turnRight();

	}

	public void turnLeft() {
		super.turnLeft();
	}

	public void printInfo(int bodyLoad) {

		super.printInfo();

	}

	@Override
	public String toString() {
		return brand;

	}

	public void printInfo() {
		System.out.println("Бренд- " + brand + ", класса: " + classAuto + ", вес: " + weight + ", макс.грузподъемность "
				+ bodyLoad);

	}
}
