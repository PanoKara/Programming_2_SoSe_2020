package datastructures;

import java.util.HashMap;
import java.util.Set;

public class ShoppingList {
	
	public static void main(String[] args) {
		
		// key - item ; value - amount
		
		HashMap<String, String> card = new HashMap<>();
		card.put("Egg", "6");
		card.put("Avocado", "2");
		card.put("Flour", "1");
		card.put("Chocolate", "1");
		card.put("Oliveoil", "2");
		
		Set <String> check = card.keySet();
		for (String name : check) {
			System.out.println(String.format(name, card.get(name)));
		}
		
	}
}
