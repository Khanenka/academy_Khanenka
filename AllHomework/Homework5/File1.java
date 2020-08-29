package Homework5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class File1 {
	/*
	 * Прочесть информацию введеную из клавиатури и записать в созданный вами txt
	 * файл, если введена "stop" строка тогда закончить запись в файл.
	 */

	public static void main(String args[]) throws IOException {
		InputStreamReader inStRe = null;

		try {
			String stopword = "stop";
			char chStop = stopword.charAt(0);
			OutputStream output = new FileOutputStream("file.txt");
			inStRe = new InputStreamReader(System.in);
			System.out.println("Введите символы, слов  stop для выхода.");
			char a;
			do {
				a = (char) inStRe.read();
				System.out.print(a);
				output.write(a);
			} while (a != chStop);

			System.out.println("\nВы вышли");
		} finally {
			if (inStRe != null) {
				inStRe.close();
			}
		}
	}
}