package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
	
	public static void main (String []args) {
Scanner scan = new Scanner (System.in);
		ArrayList <Double> avge = new ArrayList<>();
		
		double sum = 0;
		while(true) {
			System.out.println("Bitte geben Sie eine Zahl ein : ");
			String answer = scan.nextLine();
			if (answer.equals("quit")) {
				break;
			} else {
			avge.add(Double.parseDouble(answer));
			System.out.println(avge);
			}
			
		}
		for (int i = 0; i < avge.size(); i++) {
			sum += avge.get(i);
		}
		System.out.println("Average: " + sum / avge.size());
	}
}
