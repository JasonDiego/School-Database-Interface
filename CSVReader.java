package schooldatabase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {

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
		
		// read through data file
		while (sc.hasNext()) {
			String[] entry = sc.next().split(",");
			if (entry.length != 4) {
				System.out.println("Abnormal number of parameters!"
						+ "\nSkipping invalid entry...");
				continue;
			}
			
			// categorize information from current entry to create Account
			Account curr;
			String s1 = entry[0], s2 = entry[1];
			int v1 = Integer.parseInt(entry[2]);
			double v2 = Double.parseDouble(entry[3]);
			
			if (entry[0].equals("Student")) {
				curr = new Student(s1, s2, v1, v2);
				acctList.add(curr);
			}
			else if (entry[0].equals("Instructor")) {
				curr = new Instructor(s1, s2, v1, v2);
				acctList.add(curr);
			}
			else {
				System.out.println("Invalid entry name!"
						+ "\nSkippin invalid entry...");
			}
		}
		
		sc.close();
		return acctList;
		
	}
	
	public void fileType() {
		
		System.out.println("Checking for data file type...");
		
	}
	
}
