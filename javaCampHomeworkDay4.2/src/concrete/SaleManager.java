package concrete;

import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println("Hello " + gamer.getFirstName() + ". " + game.getGameName() + " Purchased. "+ 
				" Payment : $"+ game.getPrice());
		
	}

	@Override
	public void campaignSale(Campaign campaign, Game game, Gamer gamer) {
		System.out.println(campaign.getCampaignName()+" Hello " + gamer.getNickName() + " " + 
				 game.getGameName() + " was purchased with " + "%" + campaign.getDiscountRate() + " discount for $ "
				+ campaign.getUnitPriceAfterDiscount());
		
	}

}
