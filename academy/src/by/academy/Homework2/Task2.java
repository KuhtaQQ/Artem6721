package by.academy.Homework2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество слов");
		int n = sc.nextInt();
		if (n < 1) {
			System.out.println("Слишком маленькое количество слов");
			return;
		}

		String[] arr = new String[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}

		String s = arr[0];
		int x = arr[0].length();
		for (int i = 0; i < n; i++) {
			StringBuilder t = new StringBuilder();
			for (int j = 0; j < arr[i].length(); j++) {
				if (t.toString().indexOf(arr[i].charAt(j)) == -1) {
					t.append(arr[i].charAt(j));
				}
			}
			if (t.length() < x) {
				x = t.length();
				s = arr[i];
			}
		}
		System.out.println("Минимально различных символов в: " + s);
		sc.close();

	}

}
