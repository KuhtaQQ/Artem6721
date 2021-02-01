package Homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Введте первую строку");
		String s1 = sc.nextLine();
		System.out.println("Введите вторую строку");
		String s2 = sc.nextLine();
		sc.close();
		int[] letters = new int[256];
		char[] array = s1.toCharArray();
		for (char let : array) {
			letters[let]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			int let = (int) s2.charAt(i);
			if (--letters[let] < 0) {
				System.out.println("Строки не совпадают");
				return;

			}
		}
		System.out.println("Строки совпадают");
		
	}

}
