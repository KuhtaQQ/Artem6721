package by.academy.Homework.HW5;

public class Task6 {

	public static void main(String[] args) {

		int[] arr = new int[8];
		int i = 0;
		while (true) {
			try {
				arr[i] = i;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array is to small, expand the array");
				break;
			}
			System.out.println(i);
			i++;
		}
	}

}
