package ETicaret.core.concretes;

import ETicaret.core.abstracts.LoggerService;
import ETicaret.entities.concretes.Customer;
import JGoogleUserValid.JGoogleUserValidManager;

public class JGoogleUserValidManagerAdapter implements LoggerService {

	JGoogleUserValidManager manager = new JGoogleUserValidManager();
	@Override
	public boolean logToSystem(Customer customer) {
		boolean result = false;
		
		result = manager.register(customer.getId(), customer.getFirstName(), customer.getLastName(),
				customer.getEmail(), customer.getPassword());
		
		if (!result) {
			return false;
		}else {
			System.out.println("Google ile kayýt olundu.");
			return true;
		}
		
	}

	
}
