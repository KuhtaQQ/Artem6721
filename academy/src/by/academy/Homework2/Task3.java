package by.academy.Homework2;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первую строку");
		String s1 = sc.nextLine();
		System.out.println("Введите вторую строку");
		String s2 = sc.nextLine();
		System.out.println("Полученное сово: "
				+ joinStrings(s1, s2));
		sc.close();
	}

	private static String joinStrings(String s1, String s2) {
		if (s1.length() % 2 == 1 || s2.length() % 2 == 1) {
			return "Нечетное кличество букв";
		}
		return s1.substring(0, s1.length() / 2).concat(s2.substring(s2.length() / 2));

	}

}
