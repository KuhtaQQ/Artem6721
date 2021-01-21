package by.academy.Homework;

import java.util.Scanner;

public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc0 = new Scanner(System.in);
		System.out.println("Введите сумму покупки");
		double sum = sc0.nextDouble();
		System.out.println("Введите возраст");
		int age = sc0.nextInt();

		if (0 < sum && sum < 100) {
			double summ = sum - sum * 0.05;
			System.out.println("Итого с вас " + summ + " рублей");
		} else if (100 <= sum && sum < 200) {
			double summ = sum - sum * 0.07;
			System.out.println("Итого с вас " + summ + " рублей");
		} else if (200 <= sum && sum < 300) {
			double summ = sum - sum * 0.12;
			if (age >= 18) {
				summ = sum - sum * 0.16;
			} else {
				summ = sum - sum * 0.09;
			}
			System.out.println("Итого с вас " + summ + " рублей");
		} else if (300 <= sum && sum < 400) {
			double summ = sum - sum * 0.15;
			System.out.println("Итого с вас " + summ + " рублей");
		} else if (400 <= sum) {
			double summ = sum - sum * 0.2;
			System.out.println("Итого с вас " + summ + " рублей");

		} else {
			System.out.println("Неверная сумма");
		}
	}
}