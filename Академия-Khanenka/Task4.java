package by.academy;

public class Task4 {
	public static void main(String[] args) {
		int x = 2;
		int y = 1;
		while (Math.pow(x, y) < 1_000_000) {
			System.out.println("2 ^ " + y + "=" + Math.pow(x, y));
			y++;
		}

	}

}
