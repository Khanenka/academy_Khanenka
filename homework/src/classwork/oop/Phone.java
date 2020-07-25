package classwork.oop;

public class Phone {
	int number;
	String model;
	int weight;

	public Phone(int number, String model, int weight) {
		this.number = number;
		this.model = model;
		this.weight = weight;

	}

	public Phone(int number, String model) {
		this.number = number;
		this.model = model;
	}

	public Phone(int number, int weight, String model) {
		this(number, model);
		this.weight = weight;

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int Number) {
		this.number = number;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String Model) {
		this.model = model;
	}

	public int getweight(int Weight) {
		return weight;
	}

	public void setWeight(int Weight) {
		this.weight = weight;

	}

	public void printInfo() {
		System.out.println("номер " + number + " модель " + model + " Вес " + weight);
	}

	public String receiveCall(String name) {

		String receiveCall = "Звонит " + name + " " + number;
		System.out.println(receiveCall);
		return receiveCall;
	}

	public void sendMessage(int... number) {

		for (int i = 0; i < number.length; i++) {

			System.out.println(" сообщение на номер " + ": " + number[i]);

		}


	}

	

	
}
