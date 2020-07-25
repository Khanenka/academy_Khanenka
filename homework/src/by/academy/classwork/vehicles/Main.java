package by.academy.classwork.vehicles;

import by.academy.classwork.professions.Driver;
import classwork.oop.Person;

public class Main {
	public static void main(String[] args) {
		Person person = new Person("dk", 33);
		Driver driver = new Driver("Двигатель V8", 1300, person, 33);
		Car car = new Car("BMW", "Представельский", 2500, driver);
		Car sportcar = new SportCar("Audi", "premium", 33, driver, 12);
		Car lorry = new Lorry("Vaz", "Larry", 333, driver, 1000);

		car.printInfo();
		lorry.printInfo();
		driver.getDriver(person);
	}
}
