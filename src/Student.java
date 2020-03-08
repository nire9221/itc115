

public class Student {
	
	private int studentID;
	private String studentName;
	private String studentAddress;
	private double tuition;
	private int classes;
	
	public Student(int studentID, String studentName, String studentAddress, double tuition, int classes) {
	//	super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.tuition = tuition;
		this.classes = classes;
	}

	public void enroll(int classAmount) {
		this.classes += classAmount;
	}

	public void drop(int classAmount) {
		this.classes -= classAmount;
	}
	
	public void pay(int payment) {
		tuition -= payment;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public double getTuition() {
		return tuition;
	}

	public int getClasses() {
		return classes;
	}
	
}
