package datastructures;

import java.util.HashSet;

public class AccountMain {

	public static void main(String[] args) {
		
		HashSet<Account> account = new HashSet<>();
		
		account.add(new Account("Pano", 0176233233));
		account.add(new Account("Dr.Essel", 299594));
		account.add(new Account("Diggy", 17833347));
		account.add(new Account("Bobo", 12347));
		account.add(new Account("Kim", 954732));
		account.add(new Account("Gani", 887623));
		account.add(new Account("Gigi", 233233));
		account.add(new Account("Sarah", 963214));
		account.add(new Account("Bob", 1));
		account.add(new Account("Bob", 1));
	
		
		for (Account user : account ) {
			System.out.println("User : " + user.getUserId() + " : " + user.getCell());
		}
		
		
	}
}
