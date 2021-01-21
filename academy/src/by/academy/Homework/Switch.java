package by.academy.Homework;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите тип переменной");
		String tipe = sc.nextLine();
		System.out.println("Введите переменную");
		switch (tipe) {
		case "int":
			System.out.println(sc.nextInt() % 2);
			break;
		case "double":
			System.out.println(sc.nextDouble() * 0.7);
			break;
		case "float":
			System.out.println(Math.pow(sc.nextFloat(), 2));
			break;
		case "char":
			String x = sc.nextLine();
			System.out.println((int) x.charAt(0));
			break;
		case "String":
			System.out.println("Hello " + sc.nextLine());
			break;
		default:
			System.out.println("Unsupported type");
		}
	}

}
