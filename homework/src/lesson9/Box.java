package lesson9;

import classwork.oop.Book;

public class Box<T> {
	private T item;
	private T [] arr;

	public Box() {
		super();
	}
public Box(T item) {
	super();
	this.item=item;
}
public T getItem() {
	return item;
}
public void setItem(T item) {
	this.item = item;
}




public T getArrIndex(int i){
if(i<arr
	return  arr[i] ;

}
public void setArr( T [] arr){

	this.arr =  arr;

}
public int getLength(){

	return  arr.length ;

}
	
}




