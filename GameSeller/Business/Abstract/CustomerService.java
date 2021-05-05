package Abstract;

import Concrete.Customer;

public interface CustomerService {
	
	void Add(Customer customer);
	void Delete(Customer customer);
	void Update(Customer customer);

}
