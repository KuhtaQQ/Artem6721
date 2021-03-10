package by.academy.Homework.HW5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

	public static void main(String[] args) {
		Map<Character,Integer> map = new HashMap<>();
		String input = "werwewetere";
		for (char ch : input .toCharArray()) {
		   map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);
		return;
		
	}
	

}
