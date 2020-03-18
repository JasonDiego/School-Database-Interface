package schooldatabase;

public class Student implements Account {
	
	private String name;
	private String major;
	private int id;
	private double gpa;
	
	public String getName() { return name; }
	public String getMajor() { return major; } 
	public int getID() { return id; }
	public double getGPA() { return gpa; }
	
	public Student(String name, String major, int id, double gpa) {
		this.name = name;
		this.major = major;
		this.id = id;
		this.gpa = gpa;
	}
	
}
