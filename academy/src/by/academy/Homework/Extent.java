package by.academy.Homework;

public class Extent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int max = 1_000_000;
		int result = 0;
		for (int i = 1; result <= max; i++) {
			result = (int) Math.pow(x, i);

			if (result <= max) {
				System.out.println(result);
			}

		}

	}

}
