package lesson10;

import java.util.Arrays;

public class MainBoxDemo {
	public static void main(String[] args) {
		BoxDemo<Integer> boxi = new BoxDemo<>(10);
		System.out.println(boxi.getItem(5));
		boxi.add(666);
		System.out.println(boxi.getItem(0));
		boxi.addToIndex(33, 35);
		System.out.println(Arrays.toString(boxi.getArray()));
	}

}
