package lesson9;
/*
 * Написать класс, который умеет хранить в себе массив любых типов данных (int,
 * long etc.).
 * 
 * Реализовать метод:
 * 
 * а) который возвращает элемент по индексу (проверка границ массива)
 * 
 * б) который добавляет элемент в конец массива (проверка границ массива)
 * 
 * в) который добавление элемента в массив по индексу(проверка границ, сдвиг
 * массива)
 * 
 * нужно учесть, что если массив заполнен, увеличиваем массив в 2 раза
 */

import homework2.Product;

public class Home<T> {



	private T[] items;



	private int counter = 0;



	public Home() {

		super();

	}



	public Home(T[] items) {

		super();

		this.items = items;

		counter = items.length - 1;

	}



	public T[] getItems() {

		return items;

	}



	public void setItems(T[] items) {

		this.items = items;

	}



	@SuppressWarnings("unchecked")

	public void addItem(Product product) {

		if (items == null) {

			items = (T[]) new Object[10];

		}



		items[counter++] = (T) product;

	}



	

	public T getItem(int index) {

		if (items == null) {

			items = (T[]) new Object[index];

		}



		return items[index];

	}



}