package ETicaret.core.abstracts;

import ETicaret.entities.concretes.Customer;

public interface LoggerService {
	boolean logToSystem(Customer customer);
}
