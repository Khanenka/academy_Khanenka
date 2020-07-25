package classwork.oop;

public class PhoneMain {
	public static void main(String[] args) {
		Phone ph = new Phone(6448470, "apple", 344);
		Phone ph1 = new Phone(3441211, "xuawei");
		Phone ph2 = new Phone(3671312, 33, "golden vertu");
		ph.printInfo();
		ph.receiveCall("Валя");
		ph1.printInfo();
		ph1.receiveCall("Саша");
		ph2.printInfo();
		ph2.receiveCall("Антон");
		ph.sendMessage(232323);
		ph1.sendMessage(415666);

	}

}
