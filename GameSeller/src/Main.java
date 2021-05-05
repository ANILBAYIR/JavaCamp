import java.util.GregorianCalendar;
import Concrete.CreditCardCheckManager;
import Concrete.Customer;
import Concrete.CustomerManager;
import Concrete.Game;
import Concrete.SalesManager;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.setFirstName("Anýl");
		customer1.setLastName("Bayýr");
		customer1.setId(1);
		customer1.setBirthDate(new GregorianCalendar(1994,6,28).getTime());
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Call Of Duty");
		game1.setUnitPrice(700);
		game1.setAmountOfDiscount(10);
		
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());		
		customerManager.Add(customer1);
				
		
		SalesManager salesManager = new SalesManager(new CreditCardCheckManager());
		salesManager.sellGame(customer1, game1);
		salesManager.gamePrice(game1);

	}

}
