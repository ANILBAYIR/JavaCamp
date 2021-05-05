package Concrete;

import Abstract.CreditCardCheckService;
import Abstract.SalesService;

public class SalesManager implements SalesService {
	
	private CreditCardCheckService creditCardCheckService;
	
	public SalesManager(CreditCardCheckService creditCardCheckService) {
		this.creditCardCheckService = creditCardCheckService;
	}
	
	@Override
	public void addToCart(Game game) {
		
		System.out.println(game.getGameName() + " sepetinize eklendi.");
	}

	@Override
	public void sellGame(Customer customer, Game game) {
		
		 if (creditCardCheckService.creditCardCheckService(customer)) {
			
			 System.out.println(game.getGameName() + " adlý oyun " + customer.getFirstName() 
			 + " " + customer.getLastName() + " adlý kiþiye satýldý. " );
		}
		 else {
			System.out.println("Girilen kart bilgileri hatalý olduðundan satýþ gerçekleþtirilemedi.");
		}
		
	}

	@Override
	public void gamePrice(Game game) {
		
		double gamePrice = game.getAfterDiscountPrice();
		
		if (gamePrice > 0) {
			gamePrice = game.getAfterDiscountPrice();
		}
		else {
			gamePrice = game.getUnitPrice();
		}
		System.out.println("Oyunun fiyatý = " + gamePrice);
		
	}

}
