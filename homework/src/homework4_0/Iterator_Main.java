package homework4_0;

public class Iterator_Main {

	public static void main(String[] args) {
		Integer[][] array = new Integer[][] { { 13, 78, 3 }, { 4, 56 } };

		IteratorDemo<Integer> itr = new IteratorDemo<Integer>(array);

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
