package by.academy.Homework.HW4;

import java.util.Scanner;

public class DateMain {

	public static void main(String[] args) {
		Date date1 = new Date();
		Date date2 = new Date();
		System.out.println("Введите первую дату (дд-ММ-гггг)");
		Scanner scanner = new Scanner(System.in);
		date1.setDate(scanner.nextLine());
		System.out.println(date1.dayOfWeek());
		date1.visYear();
		System.out.println("Введите вторую дату (дд-ММ-гггг)");
		
		date2.setDate(scanner.nextLine());
		date1.numberOfdays(date2);
        scanner.close();
	}

}
