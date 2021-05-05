package Concrete;

import Abstract.CreditCardCheckService;

public class CreditCardCheckManager implements CreditCardCheckService {

	@Override
	public boolean creditCardCheckService(Customer customer) {
		
		return true;
	}

}
