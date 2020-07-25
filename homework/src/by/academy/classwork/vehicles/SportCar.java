package by.academy.classwork.vehicles;

import by.academy.classwork.details.Engine;
import by.academy.classwork.professions.Driver;

public class SportCar extends Car {
	int maxSpeed;

	public SportCar(String brand, String classAuto, int weight, Driver driver, int maxSpeed) {

		super(brand, classAuto, weight, driver);
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String getBrand() {

		return super.getBrand();
	}

	@Override
	public String getClassAuto() {

		return super.getClassAuto();
	}

	@Override
	public int getWeight() {

		return super.getWeight();
	}

	@Override
	public void setBrand(String brand) {

		super.setBrand(brand);
	}

	@Override
	public void setClassAuto(String classAuto) {

		super.setClassAuto(classAuto);
	}

	@Override
	public void setWeight(int weight) {

		super.setWeight(weight);
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

	public void printInfo() {

		System.out.println(
				"Бренд- " + brand + ", класса: " + classAuto + ", вес: " + weight + ", макс.скорость " + maxSpeed);
	}

}
