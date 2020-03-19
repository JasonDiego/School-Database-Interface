package schooldatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFileReader implements FileManager {
	
	public ArrayList<Account> read(String dataFileLocation) {
		
		Scanner sc;
		File src = new File(dataFileLocation);
		ArrayList<Account> acctList = new ArrayList<>();
		
		try {
			sc = new Scanner(src, "URF-8");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			return acctList;
		}
		
		/*
		 * Take input from textfile to create Account(s)
		 * */
		
		return null;
		
	}
	
	public void fileType() {
		
		System.out.println("Checking for data file type...");
		
	}
	
}
