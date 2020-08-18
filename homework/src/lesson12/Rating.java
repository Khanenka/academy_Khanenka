package lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class Rating implements Iterator {
	private int pos;
	private Integer[] array;

	public Rating(Integer[] array) {
		super();
		this.pos = pos;
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return array.length>pos;

	}

	@Override
	public Integer next() {
		

		for (int i = 1; i < array.length; i++) {
			if (array[i] > pos) {

				pos = array[i];

			}

		}

		return pos;

	}
}
