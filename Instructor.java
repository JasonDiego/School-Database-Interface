package schooldatabase;

public class Instructor implements Account {

	private String name;
	private String subject;
	private int id;
	private double passingPercentage;
	
	public String getName() { return name; }
	public String getSubject() { return subject; } 
	public int getID() { return id; }
	public double getPassingPercentage() { return passingPercentage; }
	
	public Instructor(String name, String subject, int id, double passingPercentage) {
		this.name = name;
		this.subject = subject;
		this.id = id;
		this.passingPercentage = passingPercentage;
	}
	
}
