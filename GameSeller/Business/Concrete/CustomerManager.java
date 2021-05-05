package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;

public class CustomerManager implements CustomerService {

	private CustomerCheckService customerCheckService;
	public CustomerManager(CustomerCheckService customerCheckService){
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void Add(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " sisteme eklendi");
		}
		else {
			System.out.println("Girilen müþteri bilgileri hatalý. ");
		}
		
	}	

	@Override
	public void Delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " sistemden silindi");
		
	}

	@Override
	public void Update(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
	

}
