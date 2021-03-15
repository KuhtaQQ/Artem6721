package by.academy.Homework.HW6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {
	private static final String DIR = "src\\by\\academy\\Homework\\HW6\\Task4";
	private static final String task2 = "src\\by\\academy\\Homework\\HW6\\Task2.txt";
	private static final Random random = new Random();

	public static void main(String[] args) {
		File dir = new File(DIR);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		StringBuilder sb = new StringBuilder();
		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(task2));
				BufferedWriter result = new BufferedWriter(new FileWriter("result.txt"))) {
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

			for (int i = 0; i <= 100; i++) {
				File file = new File(dir, i + ".txt");
				if (!file.exists()) {
					file.createNewFile();
				}
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
					bw.write(sb.substring(0, random.nextInt(sb.length() + 1)));

				} catch (IOException e) {
					System.err.println(e.getMessage());
				}

				if (result != null) {
					result.write(file.getName() + " " + file.length());
					result.newLine();
					result.flush();
				}

			}

		} catch (IOException ex) {
			System.err.println(ex.getMessage());
		}

	}

}
