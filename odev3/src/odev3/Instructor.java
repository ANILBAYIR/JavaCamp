package odev3;

public class Instructor extends User{
	
	private String givenCourses;
	private String resume;
	
	public Instructor() {
		
	}
	public Instructor(int userId, String firstName, String lastName, String password, String email,
			String profilePicture, String givenCourses, String resume) {
		super(userId, firstName, lastName, password, email, profilePicture);
		this.givenCourses = givenCourses;
		this.resume = resume;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}
	
	
	
}
