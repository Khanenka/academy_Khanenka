package by.academy.classwork.vehicles;

import by.academy.classwork.details.Engine;
import by.academy.classwork.professions.Driver;

public class Car {
	protected String brand;
	protected String classAuto;
	protected int weight;
	private Driver driver;

	public Car() {
		super();
	}

	public Car(String brand, String classAuto, int weight, Driver driver) {
		super();
		this.driver = driver;
		this.brand = brand;
		this.classAuto = classAuto;
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getClassAuto() {
		return classAuto;
	}

	public int getWeight() {
		return weight;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setClassAuto(String classAuto) {
		this.classAuto = classAuto;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void start() {
		System.out.println("Поехали");

	}

	public void stop() {
		System.out.println("Останавливаемся");

	}

	public void turnRight() {
		System.out.println("Поворот направо");

	}

	public void turnLeft() {
		System.out.println("Поворот налево");

	}

	public void printInfo() {

		System.out.println(brand + classAuto + weight);
	}

	public void getInfoEngine(String fullName, int driverExperience) {
		System.out.println("Имя: " + fullName + " Опыт вождения " + driverExperience);
	}

}
