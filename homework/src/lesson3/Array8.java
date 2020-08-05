package lesson3;

public class Array8 {
	/*
	 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
	 * 
	 * Определите какой элемент является в этом массиве максимальным и сообщите
	 * индекс его последнего вхождения в массив.
	 */
	public static void main(String[] args) {
		
		int[] mas = new int[12];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * (15 + 15 + 1) - 15);
			System.out.println(mas[i]);
		}
		int max = mas[0], maxIndex = 0;
			for (int i=0;i<12;i++){
	            if(mas[i]>=max){
	                max=mas[i];
	                maxIndex=i;
	            }
	        }
	 
	        System.out.println("Самое большое число "+max+" и индекс его последнего вхождения "+maxIndex);
	 
	    }
	        }



