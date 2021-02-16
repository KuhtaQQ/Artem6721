package by.academy.Deal;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.time.LocalDate;
import by.academy.Deal.Vinishko;
import by.academy.Deal.Cheese;

public class Deal implements Interface {

	public final static int MIN_PRODUCT = 2;

	Scanner sc = new Scanner(System.in);
	Person seller;
	Person buyer;
	Product[] products;
	String dealDate;
	int productCounter;
	public Double deal;
	private static final LocalDate date = LocalDate.now();
	private static final LocalDate deadLine = LocalDate.now().plusDays(10);

	public static final String MENU_DEAL = """
			Меню сделки:
			Введите:
			1.Добавить продукт
			2.Удалить продукт
			3.Вывести информацию
			4.Провести сделку
			0.Выход""";
	public static final String MENU_PRODUCT = """
			Меню продуктов:
			Введите:
			1.Добавить винишко
			2.Добавить сыр
			3.Добавить кефир
			0.Выход""";

	public Deal() {
		super();
	}

	public Deal(Person seller, Person buyer, String dealDate) {
		super();
		this.buyer = buyer;
		this.seller = seller;
		this.dealDate = dealDate;
	}

	private void expandProductArray() {
		Product[] tempArray = new Product[products.length * 2 + 1];
		System.arraycopy(products, 0, tempArray, 0, products.length);
		products = tempArray;
	}

	public void addProduct(Product product) {
		if (products == null) {
			products = new Product[MIN_PRODUCT];
		} else {
			if ((productCounter + 1) > products.length) {
				expandProductArray();

			}
		}
		products[productCounter++] = product;
	}

	public void deleteProduct(String productName) {
		int x = -1;
		for (int i = 0; i < products.length; i++) {
			if (products[i] != null) {
				if (products[i].getName().equals(productName)) {
					x = i;
					break;
				}
			}
		}
		if (x == -1) {
			System.out.println("Продукт отсутствует");
		} else {
			System.arraycopy(products, x + 1, products, x, productCounter - x - 1);
			products[--productCounter] = null;
			System.out.println("Продукт удален");
		}
	}

	public Double deal() {
		Double Sum = 0.0;

		for (Product product : products) {
			if (product != null) {
				double x = product.getPrice() * product.getQuantity() * product.discount();

				if (product instanceof Vinishko) {
					System.out.print("Vinishko: ");
				} else if (product instanceof Cheese) {
					System.out.print("Cheese: ");
				} else if (product instanceof Kefir) {
					System.out.print("Kefir: ");
				}
				System.out.println(
						product.getPrice() + " * " + product.getQuantity() + " * " + product.discount() + " = " + x);
				Sum += x;
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("Цена с учетом скидки " + Sum);

		return Sum;
	}

	public void menuDeal(Scanner sc) {
		System.out.println(MENU_DEAL);
		String value = sc.nextLine();
		while (!value.equals("0")) {
			switch (value) {
			case "1": {
				menuProducts();
				System.out.println("----------------------------");
				System.out.println(MENU_DEAL);
				break;
			}
			case "2": {
				if (products != null && products[0] != null) {
					System.out.println("Что хотите удалить?");
					String productName = sc.nextLine();
					deleteProduct(productName);
				} else {
					System.out.println("Товары отсутствуют");
				}
				System.out.println("----------------------------");
				System.out.println(MENU_DEAL);
				break;
			}
			case "3": {
				deal();
				System.out.println("----------------------------");
				System.out.println(MENU_DEAL);
				break;
			}
			case "4": {
				if (products == null) {
					System.out.println("Товары отсутствуют");
					System.out.println("----------------------------");
					System.out.println(MENU_DEAL);
				} else {
					if (buyer.getMoney() >= deal()) {
						return;
					} else {
						System.out.println("Недостаточно средств");
						System.out.println("----------------------------");
						System.out.println(MENU_DEAL);
					}
				}
				break;
			}
			default: {
				System.out.println("Значение некорректно");
			}
			}
			value = sc.nextLine();
		}
	}

	private void menuProducts() {
		System.out.println(MENU_PRODUCT);
		String value = sc.nextLine();
		while (!value.equals("0")) {
			switch (value) {
			case "1": {
				System.out.println("Введите критерии продукта:");
				Vinishko vinishko = new Vinishko();
				readProduct(vinishko);
				System.out.println("Введите сорт");
				vinishko.setSort(sc.nextLine());
				System.out.println("Введите объем");
				vinishko.setVolume(sc.nextDouble());
				System.out.println("Введите цвет");
				vinishko.setColor(sc.nextLine());
				sc.nextLine();
				addProduct(vinishko);
				System.out.println("----------------------------");
				System.out.println(MENU_PRODUCT);
				break;
			}
			case "2": {
				System.out.println("Введите критерии продукта: ");
				Cheese cheese = new Cheese(); 
				readProduct(cheese);
				System.out.println("Введите массу");
				cheese.setMassa(sc.nextInt());
				System.out.println("Введите марку:");
				cheese.setMade(sc.nextLine());
				sc.nextLine();
				addProduct(cheese);
				System.out.println("----------------------------");
				System.out.println(MENU_PRODUCT);
				break;
			}
			case "3": {
				System.out.println("Введите критерии продукта:");
				Kefir kefir = new Kefir();
				readProduct(kefir);
				System.out.println("Введите жирность ");
				kefir.setFatContent(sc.nextDouble());
				System.out.println("Введите объем");
				kefir.setVolume(sc.nextDouble());
				sc.nextLine();
				addProduct(kefir);
				System.out.println("----------------------------");
				System.out.println(MENU_PRODUCT);
				break;
			}
			default: {
				System.out.println("Значиение некорректно ");
				System.out.println("----------------------------");
				System.out.println(MENU_PRODUCT);
			}
			}
			value = sc.nextLine();
		}
	}

	private void readProduct(Product product) {
		System.out.println("Введите наименование продукта");
		product.setName(sc.nextLine());

		System.out.println("Введите цену");
		product.setPrice(sc.nextDouble());

		sc.nextLine();
		System.out.println("Введите страну производства");
		product.setManufacture(sc.nextLine());

		System.out.println("Введите количество");
		product.setQuantity(sc.nextInt());
	}

	public Person getSeller() {
		return seller;
	}

	public void setSeller(Person seller) {
		this.seller = seller;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProduct(Product[] products) {
		this.products = products;
	}

	public String getDealDate() {
		return dealDate;
	}

	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

	public LocalDate getDeadlineDate() {
		return deadLine;
	}

	public double getDeal() {
		return deal;
	}

	public void setPriceBill(Double deal) {
		this.deal = deal;
	}

	public String toString() {
		final StringBuilder sb = new StringBuilder("Сделка{");
		sb.append("продавец - ").append(seller);
		sb.append(", покупатель - ").append(buyer);
		sb.append(", продукты - ").append(Arrays.toString(products));
		sb.append(", сумма сделки - ").append(deal);
		sb.append(", дата сделки - ").append(dealDate);
		sb.append(", дедлайн сделки - ").append(deadLine);
		sb.append('}');
		return sb.toString();
	}
}
