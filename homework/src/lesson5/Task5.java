package lesson5;


public class Task5 {
	/*
	 * Ввести n слов с консоли. Найти количество слов, содержащих только символы
	 * латинского
	 * 
	 * алфавита, а среди них – количество слов с равным числом гласных и согласных
	 * букв.
	 */
	public static void main(String[] args) {
		String [] arr= { " фыфы"," wwq ", " фыфыf "," addf "," aadd "," dada "," фыфы " };
		for(int i=0;i<arr.length;i++) {
			char[]c=new char[65536];
			for(char ch:arr[i].toCharArray()) {
				
			}
			System.out.println(arr[i].toCharArray());
		}
		
		
	}
}	