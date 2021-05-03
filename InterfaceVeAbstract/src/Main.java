import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.util.GregorianCalendar;
public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save( new Customer(1, "Anýl", "BAYIR", new GregorianCalendar(1992,6,23).getTime(), "12345678901"));
		
	}

}
