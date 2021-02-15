package by.academy.Deal;

import java.text.ParseException;
import java.util.Scanner;

import by.academy.Deal.User;

public class Application {

		public static void main(String[] args) throws ParseException{
	        Application application = new Application();
	        application.runDeal();
	    }		
			private void runDeal() throws ParseException {
			Scanner sc = new Scanner(System.in);
			Deal deal = new Deal();
			System.out.println("Заполните данные о продавце");
			Person person1 = new Person();
			person1.readNewPerson();
			System.out.println("Заполните данные о покупателе");
			Person person2 = new Person();
			person2.readNewPerson();
			deal.setSeller(person1);
			deal.setBuyer(person2);
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
