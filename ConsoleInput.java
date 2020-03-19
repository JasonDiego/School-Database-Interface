package schooldatabase;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInput implements FileManager {
	
	public ArrayList<Account> read(String dataFileLocation) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> acctList = new ArrayList<>();
		
		/*
		 * Take input from user to create an Account
		 * */
		
		return acctList;
		
	}
	
	public void fileType() {
		
		System.out.println("Taking input from user via console.");
		
	}
	
}
