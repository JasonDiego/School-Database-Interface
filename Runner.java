package schooldatabase;

import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	
	public static void main(String args[]) {
		
		ArrayList<Account> studentDatabase = new ArrayList<>();
		System.out.println(
				"\nWelcome!\n\n"
				+ "Create a student database via...\n\n"
				+ "\t[1] ==> CONSOLE\n"
				+ "\t[2] ==> TEXTFILE\n"
				+ "\t[3] ==> CSV FILE\n"
				+ "\t[4] ==> MYSQL SERVER");
		
		int selection = Runner.takeInput();
		
		switch (selection) {
		case 1:
			ConsoleInput ci = new ConsoleInput();
			ci.fileType();
			studentDatabase = ci.read("");
			break;
		case 2:
			TextFileReader tfr = new TextFileReader();
			tfr.fileType();
			studentDatabase = tfr.read("");
			break;
		case 3:
			CSVReader csvr = new CSVReader();
			csvr.fileType();
			studentDatabase = csvr.read("");
			break;
		case 4:
			
			break;
		default:
			System.out.println("Invalid input.");
		}
		
		
	}
	
	private static int takeInput() {
		
		Scanner sc = new Scanner(System.in);
		boolean invalidInput;
		int selection;
		
		do {
			String input = sc.nextLine();
			
			selection = Integer.parseInt(input);
			invalidInput = true;
			if (selection == 1 || selection == 2 || selection == 3) invalidInput = false;
			
			if (input.length() > 1 || invalidInput) {
				System.out.println("Please enter a valid selection.");
			}
			
		} while (invalidInput);
		
		sc.close();
		return selection;
	}
}
