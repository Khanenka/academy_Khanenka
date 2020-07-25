package lesson5;

public class Task6 {
	// Ввести n слов с консоли. Найти слово, символы в котором идут в строгом
	// порядке

	// возрастания их кодов. Если таких слов несколько, найти первое из них.
	public static void main(String[] args) {
		String[] str = { "aba", "fdf", "abcf" };
		int count = 0;
		for (String i : str) {
			for (int j = 0; j < i.length() - 1; j++) {
				if (i.charAt(j) < i.charAt(j + 1)) {
					count++;
				}

				if (i.charAt(j) > i.charAt(j + 1)) {
					break;
				}
				System.out.println(i);
			}
			
		}
	}
}