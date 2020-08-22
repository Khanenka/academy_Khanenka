package homework5_0;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1 {
	/*
	 * Задание 1. Прочесть информацию введеную из клавиатури и записать в созданный
	 * вами txt файл, если введена "stop" строка тогда закончить запись в файл.
	 */
	public static void main(String[] args) {
		char[] array = new char[50];
		int size = 0;
		File file = new File("fileWrite.txt");
		try (FileWriter fw = new FileWriter(file); FileReader fr = new FileReader(file)) {

			fw.write("Learn\nJava!\n");
			fw.flush();

			size = fr.read(array);
			System.out.println("Количество прочитанных символов: " + size + " ");
			for (int i = 0; i < size; i++) {
				System.out.print(array[i]);
			}
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}