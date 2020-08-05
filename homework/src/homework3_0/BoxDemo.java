package homework3_0;

public class BoxDemo<T> {

	private T[] array;

	private int counter = 0;

	@SuppressWarnings("unchecked")

	public BoxDemo() {

		super();

		array = (T[]) new Object[16];

	}

	public BoxDemo(int size) {

		super();

		array = (T[]) new Object[size];

	}

	public T[] getArray() {

		return array;

	}

	public void setArray(T[] array) {

		this.array = array;

	}

	public T getItem(int index) {

		if (index < array.length && index >= 0) {

			return array[index];

		} else {

			System.out.println("ERROR!");

			return null;

		}

	}

	public T getLast() {
		if (array == null) {
			System.out.println("null");
		}
		return array[array.length - 1];
	}

	public T getfirst() {
		if (array.length > 0 && array != null) {

		}
		return array[0];
	}

	public void add(T item) {

		if (array == null) {

			return;

		}

		if (array.length == counter) {

			T[] temp = (T[]) new Object[array.length * 2 + 1];

			System.arraycopy(array, 0, temp, 0, array.length);

			array = temp;

		}

		array[counter++] = item;

	}

	public void addToEnd(T item) {

		if (array == null) {

			return;

		}

		array[array.length - 1] = item;

		counter = array.length;

	}

	public void addToIndex(T item, int index) {

		if (index < 0) {

			return;

		}

		if (index > array.length - 1) {

			T[] temp = (T[]) new Object[index + 1];

			System.arraycopy(array, 0, temp, 0, array.length);

			array = temp;

		}

		array[index] = item;

		counter = index + 1;

	}

	/*
	 * вывод индекса последнего заполненого элемента (не путать с размерностью) 7)
	 * удаление элемента по индексу (remove(int i) 8) удаление элемента по значению
	 * (remove(T obj))
	 */
	public int getSize() {
		if (array.length > 0) {

		}
		return array.length - 1;

	}

	public int printLastFullIndex() {
		int index = 0;
		if (array.length >= 0 && array[0] != null) {
			return counter++;
		}
		return index;

	}

	public void removeIndex(int index) {
		if (array.length > 0 && index > 0 && index < array.length - 1) {
			array[index] = null;
			T[] temp = (T[]) new Object[index];

			System.arraycopy(array, 0, temp, 0, array.length - index);

			temp = null;
		}

		array[index] = null;

	}

	/*
	 * public void removeItem(T item) {
	 * 
	 * for (T it : array) { if (it != null && it == item) { array = null; T[] temp =
	 * (T[]) new Object[(int) it];
	 * 
	 * System.arraycopy(array, 0, temp, 0, array.length);
	 * 
	 * array = temp; }
	 * 
	 * } } не сделано
	 */
}