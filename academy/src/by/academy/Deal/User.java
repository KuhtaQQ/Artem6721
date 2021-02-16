package by.academy.Deal;

import by.academy.Homework.HW3.BelarusPhoneValidator;
import by.academy.Homework.HW3.DateValidator;
import by.academy.Homework.HW3.EmailViladate;

import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;

public class User extends Person {
	private Date dateOfBirth;
	private String phoneNumber;
	private String email;
	private final static Pattern pattern = Pattern.compile("-");
	private final static DateValidator valDate = new DateValidator();
	private final static BelarusPhoneValidator valPhone = new BelarusPhoneValidator();
	private final static EmailViladate valEmail = new EmailViladate();
	private final static Scanner sc = new Scanner(System.in);

	public User() {
		super();
	}

	public User(String name, Double money, Date dateOfBirth, String phone, String email) {
		super(name, money);
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phone;
		this.email = email;
	}

	public void readNewPerson() throws ParseException {
		System.out.println("Введите ФИО");
		setName(sc.nextLine());

		System.out.println("Введите кроичество денег");
		setMoney(sc.nextDouble());

		sc.nextLine();
		System.out.println("Введите дату рождения в формате dd/MM/yyyy или dd-MM-yyyy");
		String dateOfBirth = sc.nextLine();
		while (!valDate.validate(dateOfBirth)) {
			System.out.println("Некорректное значеие");
			dateOfBirth = sc.nextLine();
		}
		setDateOfBirth(dateOfBirth);

		System.out.println("Введите ваш номер телефона");
		phoneNumber = sc.nextLine();
		while (!valPhone.validate(phoneNumber)) {
			System.out.println("Введите номер телефона корректно");
			phoneNumber = sc.nextLine();
		}

		System.out.println("Введите электронную почту");
		email = sc.nextLine();
		while (!valEmail.validate(email)) {
			System.out.println("Некорректное значение");
			email = sc.nextLine();
		}
	}

	public void setDateOfBirth(String strDate) throws ParseException {
		Matcher matcher = pattern.matcher(strDate.trim());
		if (matcher.find()) {
			dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").parse(strDate);
		} else {
			dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(strDate);
		}
	}

	public String getDateOfBirth() {
		return "день: " + dateOfBirth.getDate() + ", месяц: " + (dateOfBirth.getMonth() + 1) + ", год: "
				+ (dateOfBirth.getYear() + 1900);
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Пользователь{");
		sb.append("Имя - ").append(getName());
		sb.append(", деньги  - ").append(getMoney());
		sb.append(", дата рождения - ").append(getDateOfBirth());
		sb.append(", номер телефона - ").append(phoneNumber);
		sb.append(", электронная почта - ").append(email);
		sb.append('}');
		return sb.toString();
	}

}
