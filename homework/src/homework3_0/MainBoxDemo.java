package homework3_0;

import java.util.Arrays;

public class MainBoxDemo {

	public static void main(String[] args) {

		BoxDemo<Integer> integer1 = new BoxDemo<>(10);

		System.out.println(integer1.getItem(5));

		integer1.add(666);

		System.out.println(integer1.getItem(0));

		integer1.addToEnd(90);

		integer1.addToIndex(33, 5);

		integer1.addToEnd(90);
		integer1.removeIndex(9);

		System.out.println(integer1.getLast());
		System.out.println(integer1.getfirst());
		System.out.println(integer1.getSize());

		// System.out.println(integer1.printLastFullIndex());

		System.out.println(Arrays.toString(integer1.getArray()));

	}

}