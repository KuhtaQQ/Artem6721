package by.academy.Homework.HW5;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
	public static final int ELEMENTS = 1_000_000;
	public static final int RANDOM_ELEMENTS = 100_000;

	public static List<Integer> arrlist = new ArrayList<>();
	public static List<Integer> lList = new LinkedList<>();

	public static void main(String[] args) {
		System.out.println("Добавление элементов в arrayList");
		Instant start = Instant.now();
		addElements(arrlist);
		Instant end = Instant.now();
		getTime(start, end);
		System.out.println("--------------------------------------");

		System.out.println("Добавление элементов в linkedList");
		start = Instant.now();
		addElements(lList);
		end = Instant.now();
		getTime(start, end);
		System.out.println("--------------------------------------");

		System.out.println("Случайные элементы в arrayList");
		start = Instant.now();
		randomElements(arrlist);
		end = Instant.now();
		getTime(start, end);
		System.out.println("--------------------------------------");

		System.out.println("Случайные элементы в linkedList");
		start = Instant.now();
		randomElements(lList);
		end = Instant.now();
		getTime(start, end);
		System.out.println("---------------------------------------");
	}

	private static void getTime(Instant start, Instant end) {
			Duration duration = Duration.between(start, end);
			System.out.println("Потрачено милисекунд "+duration.toMillis());	
	}
    public static void randomElements(List<Integer> list) {
	for(int x = 0;x<RANDOM_ELEMENTS;x++){
		int size = list.size();
		int item = new Random().nextInt(size);
		list.get(item);
	}
    }
	public static void addElements(List<Integer> list) {
		for (int i = 0; i < ELEMENTS; i++) {
			list.add(i);
		}
	}
}
