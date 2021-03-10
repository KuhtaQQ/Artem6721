package by.academy.Homework.HW5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task4 {
	private static final int CHILDREN = 20;
	private static final Random random = new Random();

	public static void main(String[] args) {
		Iterator<Integer> iterator = Number().iterator();
		int max = Integer.MIN_VALUE;
		int i;
		while (iterator.hasNext()) {
			i = iterator.next();
			if (i > max) {
				max = i;
			}
		}
		System.out.println("Лучшая оценка класса " + max);

	}

	public static List<Integer> Number() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < CHILDREN; i++) {
			list.add(1 + random.nextInt(10));
		}
		System.out.println("Все оценки " + list);
		return list;

	}

}
