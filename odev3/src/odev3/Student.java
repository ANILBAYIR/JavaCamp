package odev3;

public class Student extends User{
	
	private String takenCourses;
	private double courseHomeworks;
	private double completedHomeworks;
	private double completingCourse;
	
	public Student() {
		
	}
	
	public Student(int userId, String firstName, String lastName, String password, String email, String profilePicture,
			String takenCourses, double courseHomeworks, double completedHomeworks, double completingCourse) {
		super(userId, firstName, lastName, password, email, profilePicture);
		this.takenCourses = takenCourses;
		this.courseHomeworks = courseHomeworks;
		this.completedHomeworks = completedHomeworks;
		this.completingCourse = completingCourse;
	}

	public String getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}

	public double getCourseHomeworks() {
		return courseHomeworks;
	}

	public void setCourseHomeworks(double courseHomeworks) {
		this.courseHomeworks = courseHomeworks;
	}

	public double getCompletedHomeworks() {
		return completedHomeworks;
	}

	public void setCompletedHomeworks(double completedHomeworks) {
		this.completedHomeworks = completedHomeworks;
	}

	public double getCompletingCourse() {
		return  completedHomeworks * 100/courseHomeworks;
	}
}
