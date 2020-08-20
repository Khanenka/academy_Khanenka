package lesson13;
/*Переписать класс FileCopy: 
	a) Добавить блок try-with-resources. 
	б) Добавить catch блок для обработки IOException. (Задание с урока)*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task1 {
	public static void main(String[] args) throws IOException {

		try (FileInputStream fileIn = new FileInputStream("./src/lesson13/file.txt");
				FileOutputStream fileOut = new FileOutputStream("./src/lesson13/copied_file.txt")) {
			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}System.out.println("dodk");
	}
}
