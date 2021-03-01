package by.academy.Homework.HW4;

public class IteratorTest {

	public static void main(String[] args) {
		Integer[][] array = { { 3, 5, 2, 5, 7, 4 }, { 4, 5, 6, 7, 8, 4 } };
		ArrayIterator<Integer> arrIterator = new ArrayIterator<Integer>(array);
	
		while (arrIterator.hasNext()) {
			System.out.print(arrIterator.next() + " ");
		}
	}

}
