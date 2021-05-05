package Concrete;

import Abstract.CampaignService;

public class CampaignManager implements CampaignService {

	@Override
	public void Add(Game game) {
		System.out.println("Yeni Kampanya: " + game.getGameName() + " %"+ game.getAmountOfDiscount() + " indirimde");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println("Kampanya bitti");
		
	}

	@Override
	public void Update(Game game) {
		System.out.println("Kampanya yenilendi.");
		
	}
	
	


}
