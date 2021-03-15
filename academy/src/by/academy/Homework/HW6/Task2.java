package by.academy.Homework.HW6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
	private static final String INPUT = "src\\by\\academy\\Homework\\HW6\\Task2.txt";
	private static final String OUTPUT = "src\\by\\academy\\Homework\\HW6\\result.txt";
	private static final String DIR = "src\\by\\academy\\Homework\\HW6\\Task2";

	public static void main(String[] args) {
		File dir = new File(DIR);
		if (!dir.exists()) {
			dir.mkdirs();
		}

		try (FileReader reader = new FileReader(INPUT);
				BufferedReader br = new BufferedReader(reader);
				FileWriter writer = new FileWriter(OUTPUT);
				BufferedWriter bw = new BufferedWriter(writer);) {
			File file = new File(OUTPUT);

			if (!file.exists()) {
				file.createNewFile();
			}
			String s;
			while ((s = br.readLine()) != null) {
				writer.write(s.replace(" ", ""));
				bw.newLine();

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
