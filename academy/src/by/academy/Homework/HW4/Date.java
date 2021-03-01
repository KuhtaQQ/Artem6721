package by.academy.Homework.HW4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
	private Year year;
	private Month month;
	private Day day;
	private final Validator data = new Validator();
	public String date;

	public Date(String date) {
		super();
		validate(date);
	}
	public void setDate(String date) {
		validate(date);

	}

	public Date() {
		super();
	}

	private void validate(String date) {
		if (data.validate(date)) {
			this.year = new Year(Integer.parseInt(date.substring(6, 10)));
			this.month = new Month(Integer.parseInt(date.substring(3, 5)));
			this.day = new Day(Integer.parseInt(date.substring(0, 2)));
		} else {
			System.out.println("Неверная дата или неверный формат");
		}
	}

	public boolean visYear() {
		if (getYear() % 4 == 0) {
			System.out.println("Високосный");
			return getYear() % 400 == 0 || getYear() % 100 != 0;
		}
		System.out.println("Не високосный");
		return false;
	}

	public DayOfWeek dayOfWeek() {
		LocalDate localdate = LocalDate.of(getYear(), getMonth(), getDay());
		return DayOfWeek.fromValue(localdate.getDayOfWeek().getValue());
	}

	public long numberOfdays(Date date) {

		LocalDate firstDay = LocalDate.of(getYear(), getMonth(), getDay());
		LocalDate secondDay = LocalDate.of(date.getYear(), date.getMonth(), date.getDay());
		System.out.println(Math.abs(ChronoUnit.DAYS.between(firstDay, secondDay)));

		return Math.abs(ChronoUnit.DAYS.between(firstDay, secondDay));

	}
	

	public int getYear() {
		return year.getYear();
	}

	public int getMonth() {
		return month.getMounth();
	}

	public int getDay() {
		return day.getDay();
	}

	public String getDate() {
		return date;
	}

	public class Year {
		private int year;

		Year(int year) {
			this.year = year;
		}

		public int getYear() {
			return year;
		}
	}

	public class Month {
		private int month;

		Month(int month) {
			this.month = month;
		}

		public int getMounth() {
			return month;
		}

	}

	public class Day {
		private int day;

		Day(int day) {
			this.day = day;
		}

		public int getDay() {
			return day;
		}

	}

}
