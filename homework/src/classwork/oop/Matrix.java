package classwork.oop;

import java.util.Scanner;

public class Matrix {
	int col;
	int row;
	int[][] matr = new int[col][row];
	int[][] matr1 = new int[col][row];
	int[][] matrtotal = new int[col][row];

	public Matrix() {
		super();
	}

	public Matrix(int col, int row) {
			super();
			this.col = col;
			this. = row;
		}

	public void matrixPrint1() {
		System.out.println("Введите кол-во столбцов второй матрицы: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Введите кол-во строк второй матрицы: ");
		int y = sc.nextInt();
		int[][] matr = new int[x][y];
		for (int i = 0; i < x; i++) {
			System.out.println(" ");
			for (int j = 0; j < y; j++) {
				System.out.print(" ");
				matr[i][j] = (int) (Math.random() * 20 + 1);
				System.out.print(matr[i][j]);
			}
			System.out.println(" ");
		}
	}

	public void matrixPrint2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите кол-во столбцов второй матрицы: ");
		int x1 = sc.nextInt();
		System.out.println("Введите кол-во строк второй матрицы: ");
		int y1 = sc.nextInt();
		int[][] matr1 = new int[x1][y1];
		for (int i = 0; i < x1; i++) {
			System.out.println(" ");

			for (int j = 0; j < y1; j++) {
				System.out.print(" ");
				matr1[i][j] = (int) (Math.random() * 20 + 1);
				System.out.print(matr1[i][j]);
			}
			System.out.println(" ");
		}
	}

	public void sumMatrix() {

	}
}