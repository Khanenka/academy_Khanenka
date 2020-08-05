package lesson10;

public class Main {
	public static void main(String[] args) {
		Double[] arr = new Double[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (Math.random() * 10);

		}
		Average<Double> min = new Average<Double>(arr);
		System.out.print(min.getMax());

	}
}
