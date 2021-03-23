package by.academy.Homework.HW7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Не использовать циклы (for/while/do-while). Сгенерировать 100 рандомных Long чисел в диапазоне от 0 до 100.
//Каждое число умножить на PI и отнять 20. Отфильтровать, оставив числа меньшие 100. Отсортировать по возрастанию. 
//Пропустив первые 3 числа произвести следующие операции:
//Преобразовать лист чисел в Map (операция collect), где ключем является само число а значением строка: ("Number: " + value).

public class Task1 {

	public static void main(String[] args) {
		List<Long> list = generator(100, 100);
		System.out.println(list.stream().map(m -> m * Math.PI - 20).filter(m -> m < 100).sorted().skip(3).distinct()
				.collect(Collectors.toMap(m -> m, m -> ("Numbers :" + m))));

	}

	private static List<Long> generator(int start, int end) {
		return Stream.generate(() -> (long) new Random().nextInt(start + 1)).limit(end).collect(Collectors.toList());

	}

}
