package Abstract;

import Concrete.Customer;
import Concrete.Game;

public interface SalesService {
	void addToCart(Game game);
	void sellGame(Customer customer, Game game);
	void gamePrice(Game game);
	
}
