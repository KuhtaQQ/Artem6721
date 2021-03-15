package by.academy.Homework.HW6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task3Main {
	
	

	public static void main(String[] args) {
		ArrayList<Task3User> arr = new ArrayList<>();
		arr.add(new Task3User("Игорь", "Игорев", 24));
		arr.add(new Task3User("Виктор", "Игорев", 25));
		arr.add(new Task3User("Хабиб", "Нурмагомедов", 26));
		arr.add(new Task3User("Дастин", "Порье", 24));
		arr.add(new Task3User("Конор", "МакГрегор", 28));
		arr.add(new Task3User("Стипи", "Миочич", 24));
		arr.add(new Task3User("Нэйт", "Диаз", 27));
		arr.add(new Task3User("Пётр", "Ян", 24));
		arr.add(new Task3User("Жозе", "Альдо", 30));
		arr.add(new Task3User("Джей", "Диллашоу", 29));

		File dir = new File("users");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		for (Task3User user : arr) {
			File file = new File(dir, user.getName() + " " + user.getSurname() + ".txt");
			try (FileOutputStream output = new FileOutputStream(file);
					ObjectOutputStream object = new ObjectOutputStream(output)) {
				object.writeObject(user);
				output.close();
				object.close();
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}

	}

}
