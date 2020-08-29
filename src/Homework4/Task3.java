package Homework4;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
	/*
	 * Можно писать все в main. Не нужно создавать новых классов. Имеется текст.
	 * Следует составить для него частотный словарь: Создать Map<Character, Integer>
	 * для символов, в который мы заносим символ и его количество.
	 */
	/*
	 * Map<String, Integer> petiasApple = new HashMap<>();
	 * 
	 * petiasApple.put("krasnie", 10); petiasApple.put("zelenie", 15);
	 * 
	 * petiasApple.put("krasnie", petiasApple.get("krasnie") - 2);
	 * petiasApple.remove("zelenie"); for (String key : petiasApple.keySet()) {
	 * petiasApple.compute(key, (k, v) -> v + 1);
	 * 
	 * Integer appleNum = petiasApple.get(key); System.out.println("Y peti " + key +
	 * " " + "iablok:" + appleNum); } }
	 */
	public static void main(String... args) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String text = "Имеется текстnnn";

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			Integer val = map.get(c);
			if (val != null) {
				map.put(c, new Integer(val + 1));
			} else {
				map.put(c, 1);
			}

		}
		System.out.println(map);
	}
}
