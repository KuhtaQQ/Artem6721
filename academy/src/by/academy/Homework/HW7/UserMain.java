package by.academy.Homework.HW7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserMain {

	public static void main(String[] args) {
		User user = new User("Kuharev", "Artik", 25, "25.07.1995", "Kuht", "qwerty", "kuh@mail.ru");

		System.out.println(user.printUserInfo());

		Class<User> clz = User.class;

		Class<? super User> superClass = clz.getSuperclass();

		System.out.println("getMethod: ");
		try {
			Method method = clz.getMethod("getLogin");
			System.out.println(method.toString());
		} catch (NoSuchMethodException | SecurityException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("getMethods: ");
		Method[] methods = clz.getMethods();
		for (Method metods : methods) {
			System.out.println(metods.toString());

		}
		System.out.println("getField: ");
		try {
			Field field = clz.getField("password");
			System.out.println(field.toString());

		} catch (NoSuchFieldException ex) {
			System.err.println(ex.getMessage());
		}
		System.out.println("getFields: ");
		Field[] fields = clz.getFields();
		for (Field fieldss : fields) {
			System.out.println(fieldss.toString());
		}
		System.out.println("getDeclaredMethod: ");
		try {
			Method decMethod = clz.getDeclaredMethod("email");
			System.out.println(decMethod.toString());
		} catch (NoSuchMethodException | SecurityException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("getDeclaredMethods: ");
		Method[] decMethods = clz.getDeclaredMethods();
		for (Method decMeth : decMethods) {
			System.out.println(decMeth.toString());
		}

		try {
			Field fieldlogin = clz.getDeclaredField("login");
			fieldlogin.setAccessible(true);
			fieldlogin.set(user, "Kuhta");

			Field fieldpass = clz.getDeclaredField("password");
			fieldpass.setAccessible(true);
			fieldpass.set(user, "qwerty1234");

			Field fieldEmail = clz.getDeclaredField("email");
			fieldEmail.setAccessible(true);
			fieldEmail.set(user, "mail@mail.ru");

			Field fieldsFirstName = superClass.getDeclaredField("firstName");
			fieldsFirstName.setAccessible(true);
			fieldsFirstName.set(user, "Kuh");

			Field fieldsLastName = superClass.getDeclaredField("lastName");
			fieldsLastName.setAccessible(true);
			fieldsLastName.set(user, "Art");
			Field fieldsLastAge = superClass.getDeclaredField("age");
			fieldsLastAge.setAccessible(true);
			fieldsLastAge.set(user, 26);
			Field fieldsLastDateOfBirth = superClass.getDeclaredField("dateOfBirth");
			fieldsLastDateOfBirth.setAccessible(true);
			fieldsLastDateOfBirth.set(user, "25.07.2021");

		} catch (NoSuchFieldException | IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
		try {
			Method printUserInfo = clz.getDeclaredMethod("printUserInfo");
			System.out.println(printUserInfo.invoke(user));
		} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
	}
}
