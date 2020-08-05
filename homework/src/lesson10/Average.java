package lesson10;

/*Написать обобщенный класс MinMax, который содержит методы для 

нахождения минимального и максимального элемента массива. 

Массив является переменной класса. Массив должен передаваться в класс через конструктор.
*/
public class Average<T extends Number> {

	private T[] array;

	public Average(T[] array) {
		this.array = array;
	}

	public double getMin()
	{
		double min = array[0].doubleValue();
		for (T value : array) {
			if (min  > value.doubleValue()) {
				min = value.doubleValue();
			}
		}
		return min;
	}
	public T getMax()
	{
		T max=array[0];
		for (T value : array) {
			if (max.doubleValue() < value.doubleValue()) {
				max = value;
			}
			
	}
		return  max;
	}

}
