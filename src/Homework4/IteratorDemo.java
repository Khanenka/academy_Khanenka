package Homework4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorDemo<T> implements Iterator<T> {
	private int size;
	private int position = 0;
	private int row = 0;
	private int col = 0;
	private T[][] matrix;

	public IteratorDemo(T[][] matrix) {
		this.matrix = matrix;
		this.size = countElements(matrix);
	}

	private int countElements(T[][] matrix) { // считаем количество элементов в матрице
		int count = 0;
		for (T[] row : matrix) {
			count += row.length;
		}
		return count;
	}

	@Override
	public boolean hasNext() {
		return position < size;
	}

	@Override
	public T next() {
		if (position >= size) {
			throw new NoSuchElementException();
		}
		T element = matrix[row][col];

		position++;
		col++;
		while (row < matrix.length && col >= matrix[row].length) {
			col = 0;
			row++;
		}
		return element;
	}

}
