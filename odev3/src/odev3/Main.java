package odev3;

public class Main {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		student1.setFirstName("An�l");
		student1.setCourseHomeworks(12);
		student1.setCompletedHomeworks(6);
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		
		System.out.println(student1.getFirstName()+ " �devlerin %" + student1.getCompletingCourse() + " tamamlam��t�r.");
		
		UserManager userManager = new UserManager();
		userManager.logIn(instructor1);
		userManager.logIn(student1);
		

	}

}
