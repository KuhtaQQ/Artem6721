package by.academy.Deal;

import java.text.ParseException;
import java.util.Scanner;

import by.academy.Deal.User;

public class Application {

	public static void main(String[] args) throws ParseException {
		Application application = new Application();
		application.runDeal();
	}

	private void runDeal() throws ParseException {
		Scanner sc = new Scanner(System.in);
		Deal deal = new Deal();
		System.out.println("Заполните данные продавца");
		User user1 = new User();
		user1.readNewPerson();
		System.out.println("Заполните данные покупателя");
		User user2 = new User();
		user2.readNewPerson();
		deal.setSeller(user1);
		deal.setBuyer(user2);
		deal.menuDeal(sc);
		if (deal.getProducts() != null && deal.getProducts()[0] != null) {
			System.out.println("Сделка прошла успешно");
			System.out.println();
		} else {
			System.out.println("Сделка не состоялась");
		}
		sc.close();
	}
}
