package Homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
	private static final Task1 RandomDemo = null;

	/*
	 * Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных Long
	 * чисел в диапазоне от 0 до 100. Каждое число умножить на PI и отнять 20.
	 * Отфильтровать, оставив числа меньшие 100. Отсортировать по возрастанию.
	 * Пропустив первые 3 числа произвести следующие операции: Преобразовать лист
	 * чисел в Map (операция collect), где ключем является само число а значением
	 * строка: ("Number: " + value).
	 */
	public static void main(String[] args) {
		int bound = 100;
		int size = 100;
		List<Long> stream = new ArrayList<Long>();
		stream = Stream.generate(() -> new Random().nextInt(bound)).filter(s -> s < 100).filter(s -> s > 0).limit(100)
				.map(e -> (long) ((long) e * Math.PI - 20)).collect(Collectors.toList());
		System.out.println(stream);

		Map<Long, Object> map = stream.stream().skip(3).distinct()
				.collect(Collectors.toMap(Long::longValue, x -> " number: " + String.valueOf(x)));
		System.out.println(map);

	}
}