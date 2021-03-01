package by.academy.Homework.HW4;

public class ArraysMain {

	public static void main(String[] args) {
		Arrays<Integer> array = new Arrays<>(2);
		array.add(1);
		array.add(9);
		array.add(3);
		array.add(7);
		array.add(1);
		array.add(6);
		array.add(14);
		System.out.println(array.get(0));
		System.out.println(array.getLast());
		System.out.println(array.getFirst());
		System.out.println(array.length());
		System.out.println(array.getIndexLastElement());
		System.out.println(array.remove(Integer.valueOf(7)));
		System.out.println(array.remove(1));
		System.out.println(array.length());
	}

}
