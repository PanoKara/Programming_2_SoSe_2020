package datastructures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class ContactMain {

	public static void main(String[] args) {
		LinkedList<Contact> contacts = new LinkedList <>();
		
		contacts.add(new Contact(123354, "Alex"));
		contacts.add(new Contact(597639, "Kiwan"));
		contacts.add(new Contact(5987345, "Daniel"));
		contacts.add(new Contact(9733542, "Kirsten"));
		contacts.add(new Contact(933581, "Verena"));
		contacts.add(new Contact(1, "Chuck Norris"));
		contacts.add(new Contact(658719, "Uwe Boll"));
		contacts.add(new Contact(642877, "Bob Ross"));
		contacts.add(new Contact(123456, "Bruce Lee"));
		
	
		Collections.sort(contacts);
//		for (Contact contact : contacts) {
//			System.out.println(contact.getName() + " : " + contact.getNumber());
//		}
		
		
		
//		FileIO Aufgaben Variante - 2.1
//		Abfrage : Datei wird angelegt, falls nicht existent.		
		File file = new File ("Vorlesung_05\\datastructures\\contact.txt");
		if(file.exists()) {
			System.out.println("die Datei existiert");
		} else {
			System.out.println("Die Datei wird angelegt");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		// ContactObjekt wird via ObjekctOutputStream weggeschrieben
		try {
			FileOutputStream fos =new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new Contact(254789, "Tim Taylor"));
			oos.flush();
			oos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		// Ausgabe
		try {
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
			Contact con = (Contact) ois.readObject();
			System.out.println(con);
			ois.close();
			
			// Typprüfung
			if (con instanceof Contact) {
				Contact msg = (Contact) con;
				System.out.println(msg.toString());
			}
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	
		
//		FileIO Aufgaben Variante - 2.2
		File file2 = new File ("Vorlesung_05\\datastructures\\Bla.txt");
		if(file.exists()) {
			System.out.println("die Datei existiert");
		} else {
			System.out.println("Die Datei wird angelegt");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fileWriter = new FileWriter(file2);
			PrintWriter writer = new PrintWriter(fileWriter);
				writer.write("We  don't make mistaakes, these are happy little accidents - Rob Ross");
				writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader fread = new FileReader(file2);
			Scanner scan = new Scanner (fread);
			
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
			scan.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
