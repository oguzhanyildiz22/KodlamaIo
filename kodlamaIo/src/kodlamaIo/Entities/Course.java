package kodlamaIo.Entities;

public class Course {

	private int id;
	private String courseName;
	private double price;

	public Course() {
		super();
	}

	public Course(int id, String courseName, double price) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
