package by.academy.Homework;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число ");
		int scc = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			if (0<scc&&scc <= 10) {
				System.out.println(scc + " * " + i + " = " + (scc * i));
			}

		}
	}
}
