package datastructures;

import java.util.HashMap;
import java.util.Set;

public class MyMap {
	
	public static void main (String[] args) {
		HashMap<String, Integer> books = new HashMap<>();
		
		books.put("was man von hier aus sehen kann", 2);
		books.put("Blood Sweat and Pixel", 10);
		books.put("The Witcher", 1);
		books.put("Harry Potter", 100);
		books.put("Necronomicon", 21);
		books.put("Tokyo Ghoul", 42);
		books.put("Java ist eine Insel", 101);
		books.put("Java ist eine Insel", 102);
		
		Set <String> bookname = books.keySet();
		for (String name : bookname) {
			System.out.println(name + " : " + books.get(name));
		}
	}
}
