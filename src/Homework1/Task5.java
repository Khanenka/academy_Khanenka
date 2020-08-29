package Homework1;

public class Task5 {
	public static void main(String[] args) {
		int s = 2887890;
		int sec;
		int m;
		int min, h;
		int d;
		int day;
		int w;
		int week;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		day = h % 24;
		d = (h - day) / 24;
		week = h % 7;
		w = (d - week) / 7;

		System.out.println(w + " ������ " + d + " ���� " + h + " ����� " + min + " ����� " + sec + " ������");
	}
}
