package by.academy.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		int cardforPlayer = 5;
		int players = 0;
		String[] mast = { "Пика", "Буба", "Крести", "Чирва" };
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Tуз" };
		int x = mast.length * cards.length;

		Scanner s = new Scanner(System.in);
		System.out.println("Введите число игроков");

		if (s.hasNextInt()) {
			players = s.nextInt();
			if (players * cardforPlayer <= x) {
				if (0 >= players) {
					System.out.println("Мало игроков");
					return;
				}
			} else {
				System.out.println("Игроков слишком много");
				return;
			}
		} else {
			System.out.println("Вы ввели не число или оно очень большое");
			return;
		}
		String[] koloda = new String[x];
		int z = 0;
		for (String masti : mast) {
			for (String card : cards) {
				koloda[z] = new String(card + " " + masti);
				z++;
			}
		}
		for (int i = 0; i < x; i++) {
			int r = i + (int) (Math.random() * (x - i));
			String t = koloda[r];
			koloda[r] = koloda[i];
			koloda[i] = t;

		}
		for (int i = 0; i < players * cardforPlayer; i++) {
			System.out.printf("%-3s ", koloda[i]);

			if (i % cardforPlayer == cardforPlayer - 1) {
				System.out.println();
				System.out.println();
			}
		}
		s.close();
	}

}
