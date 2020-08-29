package Homework4;

public class Task_4 {

	public static void main(String[] args) throws CustomException {
		int[] array = new int[8];

		System.out.println("Filling our array");
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		try {
			System.out.println("Element number 9: " + array[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("We have an exception here: " + e);
			throw new CustomException();
		}
	}
}
/*
 * try { int[] array = new int[8]; for(int i=0;i<array.length;i++) { array[i]=i;
 * }
 * 
 * } catch (ArrayIndexOutOfBoundsException e) {
 * System.err.println("Array is to small, expand the array"); throw new
 * CustomException(); }
 */

/*
 * Создать свое исключение CustomException. Попробовать добавить в массив int на
 * 8 элементов 10 чисел. Обернуть в try/catch, словить
 * ArrayIndexOutOfBoundsException и вывести на экран сообщение:
 * "Array is to small, expand the array". После чего выкинуть свое исключение
 * CustomException.
 */
