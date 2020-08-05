package lesson3;

public class Array7 {
	/*
	 * Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
	 * 
	 * Напоминаем, что первый и второй члены последовательности равны единицам, а
	 * каждый следующий — сумме двух предыдущих.
	 */
	public static void main(String[] args) {
		int array[] = new int[20];
		int sum;
		int n0 = 1;
		int n1 = 1;
		System.out.println(n0 + " " + " " + n1);
		for (int i = 0; i < array.length; ++i) {
			sum = n0 + n1;
			n0 = n1;
			n1 = sum;
			System.out.println(sum);
		}
		
	}

}
