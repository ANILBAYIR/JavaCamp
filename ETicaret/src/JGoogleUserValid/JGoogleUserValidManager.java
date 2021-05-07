package JGoogleUserValid;

public class JGoogleUserValidManager {
	public boolean register(int id,String firstName,String lastName,String email,String password){
		
		
		
		if (firstName.length()>2 && lastName.length()>2&&email.contains("gmail.com")&&password.length()>5) {
			
			
			return true;			
		}else {
			return false;
		}
			
	}
	
	
	
	
}
	
