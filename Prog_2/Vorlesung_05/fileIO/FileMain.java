package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain {
	public static void main(String[] args) {
		
		File file = new File ("Vorlesung_05\\fileIO\\name.txt");
		if(file.exists()) {
			System.out.println("die Datei existiert");
		} else {
			System.out.println("Die Datei wird angelegt");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}		
			System.out.println("Das Programm lebt noch");
		}
		
		try (FileWriter fileWriter = new FileWriter(file, true);BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
			
			bufferedWriter.write("Corona desinfiziert sich nach Kontakt mit Chuck Norris die Hände\r\n - BufferedWriter");
			bufferedWriter.newLine();
			bufferedWriter.flush();
					
					
//			fileWriter.write("Corona desinfiziert sich nach Kontakt mit Chuck Norris die Hände\r\n");
//			fileWriter.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String text = bufferedReader.readLine();
			System.out.println(text);
			bufferedReader.close();
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		
	}
}