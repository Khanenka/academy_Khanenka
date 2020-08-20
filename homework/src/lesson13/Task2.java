package lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*Переписать класс FileInputOutputStreamDemo: 
	a) Добавить блок try-with-resources. 
	б) Замените for (int i = 0; i < c.length; i++) на блок for-each.  
	в) Пусть file.txt записывается в каталог src/io. (Задание с урока)*/

public class Task2 {
	public static void main(String[] args) {
		try(OutputStream output = new FileOutputStream("a.txt");
				InputStream input = new FileInputStream("a.txt");) {
			char[] symbols = { 'a', 'b', 'c' };
			
			for (int i = 0; i < symbols.length; i++) {
				// Запись каждого символа в текстовый файл
				output.write(symbols[i]);
			}
			output.close();

			
			int size = input.available();

			for (int i = 0; i < size; i++) {
				// Чтение текстового файла посимвольно
				System.out.print((char) input.read() + " ");
			}
			input.close();
		} catch (IOException e) {
			System.out.print("Exception");
		}
		
	}

}
