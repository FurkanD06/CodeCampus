package codeCampus.entities;

public class Course {

	private int id;
	private int progressStatus;
	private int instructorId;
	private String courseName;
	private double unitPrice;

	

	public Course(int id, int progressStatus, int instructorId, double unitPrice,String courseName) {
		this.id = id;
		this.progressStatus = progressStatus;
		this.instructorId = instructorId;
		this.unitPrice = unitPrice;
		this.courseName = courseName;
	}

	public Course() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProgressStatus() {
		return progressStatus;
	}

	public void setProgressStatus(int progressStatus) {
		this.progressStatus = progressStatus;
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public double setUnitPrice(double unitPrice) {
		return this.unitPrice = unitPrice;
	}

}
