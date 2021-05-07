package ETicaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ETicaret.dataAccess.abstracts.CustomerDao;
import ETicaret.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {

	List<Customer> customers = new ArrayList<>();
	@Override
	public void signUp(Customer customer) {
		
		customers.add(customer);
		System.out.println("Sisteme yeni üye eklendi: " + customer.getFirstName() + " "+ customer.getLastName().toUpperCase());
		
	}

	@Override
	public boolean emailCheck(Customer customer) {
		for (Customer c : customers) {
			if (c.getEmail() == customer.getEmail()) {
				return false;
			} 
		}
		return true;
	}

	@Override
	public boolean loginByCheck(String email, String password) {
		for (Customer customer : customers) {
			if (customer.getEmail() == email && customer.getPassword() == password) {
				return true;
			}			
		}return false;
	}

	

}
