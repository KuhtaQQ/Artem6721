package by.academy.Homework.HW6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void main(String[] args) throws IOException {
		File file = new File("Test.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter("Test.txt"))) {

			String data;
			while (!(data = reader.readLine()).equals("Stop")) {
				bw.write(data + "\n");
				bw.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

	}
}
