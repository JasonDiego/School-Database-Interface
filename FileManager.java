package schooldatabase;

import java.util.ArrayList;

public interface FileManager {
	public ArrayList<Account> read(String dataFileLocation);
	public void fileType();
}
