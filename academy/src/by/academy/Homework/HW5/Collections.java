package by.academy.Homework.HW5;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {

	ArrayList<Object> list = new ArrayList<Object>();
	
    list.add("ABC");
    list.add("ABC");
    list.add("ABCD");
    list.add("ABCD");
    list.add("ABCE");

    System.out.println("С дубликатами "+list);

    Object[] st = list.toArray();
      for (Object s : st) {
        if (list.indexOf(s) != list.lastIndexOf(s)) {
            list.remove(list.lastIndexOf(s));
         }
      }

    System.out.println("Без дубликатов "+list);
	}
	

}
