package lesson9;

import by.academy.classwork.animals.Dog;
import homework2.Chocolate;
import homework2.Product;
import homework2.User;
import homework3_0.Deal;

public class MainHome {
	public static void main(String[] args) {
		
		Home<Product[]>products=new Home<Product[]>();
		

		products.addItem(new Product("Колбаса", 1000, 10));
		
		System.out.println(products.getItem(1));

		Box<Dog> dogs = new Box<Dog>();

		dogs.setItem(new Dog("бобик"));
		System.out.println(dogs.getItem().getName());
		
	}

}
