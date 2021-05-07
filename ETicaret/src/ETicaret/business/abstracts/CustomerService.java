package ETicaret.business.abstracts;

import ETicaret.entities.concretes.Customer;

public interface CustomerService {
	boolean password(Customer customer);
	boolean firstName(Customer customer);
	boolean lastName(Customer customer);
	boolean email(Customer customer);
	void signUp(Customer customer);
	void logIn(String email, String Password);
}
