package Homework5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random;

public class Task4_Hmwrk5 {
	public static void main(String[] args) throws IOException {
		// создание директории
		String dir = "C:\\Users\\wimbi\\eclipse-workspace\\Homework-academy\\src\\Homework5\\Files\\random\\";
		String line = "C:\\Users\\wimbi\\eclipse-workspace\\Homework-academy\\src\\Homework5\\Files\\origin.txt";
		String resultPath = "C:\\Users\\wimbi\\eclipse-workspace\\Homework-academy\\src\\Homework5\\Files\\result.txt";

		File f = new File(resultPath);
		if (f.isFile()) {
			f.delete();
		}

		// считаем символы
		String str = "";
		try (BufferedReader bf = new BufferedReader(new FileReader(line))) {
			str = bf.readLine();
		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}

		// создание файлов

		int[] arr = new int[100];
		int j = 1;
		for (int i = 0; i < 100; i++) {
			String filePath = dir + j++ + ".txt";
			int size = (int) (0 + Math.random() * 574);
			String writeToFile = str.substring(0, size);
			arr[i] = writeToFile.length();
			try (BufferedWriter br = new BufferedWriter(new FileWriter(filePath))) {
				br.write(writeToFile);
			} catch (IOException ex) {
				System.err.println(ex.getMessage());
			}
		}
		// запись
		j = 1;
		for (int i = 0; i < 100; i++) {
			String filePath = dir + j++ + ".txt";
			File file = new File(filePath);
			String result;
			try (BufferedWriter br = new BufferedWriter(new FileWriter(resultPath, true))) {
				result = filePath + " | text length: " + arr[i] + " | file size " + file.length() + "\n";
				br.write(result);
			} catch (IOException ex) {
				System.err.println(ex.getMessage());
			}
		}

	}
}
