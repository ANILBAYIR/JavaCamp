package ETicaret.dataAccess.abstracts;

import ETicaret.entities.concretes.Customer;

public interface CustomerDao {
	
	void signUp(Customer customer);
	boolean emailCheck(Customer customer);
	boolean loginByCheck(String email, String password);
}
