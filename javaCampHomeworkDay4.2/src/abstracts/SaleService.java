package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface SaleService {

	void sale(Gamer gamer, Game game);
	void campaignSale(Campaign campaign, Game game, Gamer gamer);
}
