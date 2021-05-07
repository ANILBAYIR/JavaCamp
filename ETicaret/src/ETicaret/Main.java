package ETicaret;


import ETicaret.business.abstracts.CustomerService;
import ETicaret.business.concretes.CustomerManager;
import ETicaret.business.concretes.EmailCodeManager;
import ETicaret.core.concretes.EmailValidatorManager;
import ETicaret.core.concretes.JGoogleUserValidManagerAdapter;
import ETicaret.dataAccess.concretes.HibernateCustomerDao;
import ETicaret.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao(), new EmailValidatorManager(), new JGoogleUserValidManagerAdapter(), new EmailCodeManager());
		Customer customer = new Customer();
		customer.setEmail("abc@gmail.com");
		customer.setFirstName("Anýl");
		customer.setLastName("Bayýr");
		customer.setPassword("123456789");
		
		Customer customer1 = new Customer();
		customer1.setEmail("abcd@hotmail.com");
		customer1.setFirstName("Ahmet");
		customer1.setLastName("Öztürk");
		customer1.setPassword("123456");
		
		customerService.signUp(customer);
		
		
	}

}
