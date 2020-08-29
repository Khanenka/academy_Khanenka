package Homework5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Task2_Hwrk5 {
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(
					new FileInputStream(new File("..\\..\\eclipse-workspace\\Test\\origin.txt"))));
			bw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(new File("..\\..\\eclipse-workspace\\Test\\result.txt"))));
			String str;
			int i;
			do {
				i = br.read();
				if (null != (str = br.readLine())) {
					bw.write(str.replaceAll("\\s+", ""));
				}
			} while (i != -1);

		} catch (IOException e) {
			System.err.println("error during copying: " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				System.err.println("error during closing: " + e.getMessage());
			}
		}
	}

}
