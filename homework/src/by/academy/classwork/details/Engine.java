package by.academy.classwork.details;

public class Engine {
	public int power;
	public int manufacturer;

	public Engine() {
		super();
	}

	public Engine(int Power, int manufacturer) {

		this.manufacturer = manufacturer;
		this.power = power;
	}

	public int getManufacturer() {
		return manufacturer;
	}

	public int getPower() {
		return power;
	}

	public void setManufacturer(int manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setInfoEngine() {
		System.out.println(power + " " + " " + manufacturer);
	}

}
