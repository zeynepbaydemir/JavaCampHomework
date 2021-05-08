import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.GamerManager;
import concrete.SaleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {

		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Zeynep");
		gamer1.setLastName("Baydemir");
		gamer1.setNationalityId("6868684566");
		gamer1.setYearOfBirth(1856);
		gamer1.setNickName("HeyBenZey");

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);
		gamerManager.update(gamer1);

		System.out.println("--------------------------------------------------");

		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("Grand Theft Auto: San Andreas");
		game1.setPrice(500);

		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Grand Theft Auto: Vice City");
		game2.setPrice(600);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.update(game2);

		System.out.println("-------------------------------------------------");

		Campaign campaign1 = new Campaign(1,game1.getPrice(),"Summer Campaign",50 );
		
		

		Campaign campaign2 = new Campaign(2,game2.getPrice(),"Winter Campaign",30);
		
		

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.update(campaign2);

		System.out.println("---------------------------------------");
		System.out.println();

		SaleManager saleManager = new SaleManager();
		System.out.println("*********Campaign***********");
		System.out.println();
		saleManager.campaignSale(campaign2, game2, gamer1);
		saleManager.campaignSale(campaign1, game1, gamer1);
		System.out.println();
		System.out.println("*********Without Campaign************");
		System.out.println();
		saleManager.sale(gamer1, game2);

	}

}
