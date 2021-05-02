package task4.Concreate;

import task4.Abstract.CampaingService;
import task4.Abstract.GameService;
import task4.Entities.Game;
import task4.Entities.Gamer;


public class GameManager implements GameService {
	
	CampaingService campaingService;
	
	
	public GameManager(CampaingService campaingService) {
		this.campaingService = campaingService;
	}

	@Override
	public void buy(Game game, Gamer gamer, String code) {
		this.campaingService.useCode(game, code);
		System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adli oyuncu "+game.getGameName() +" oyununu satin aldi");
		
	}
	@Override
	public void buy(Game game, Gamer gamer) {		
		System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adli oyuncu "+game.getGameName() +" oyununu "+game.getPrice() +" tl'ye satin aldi");
		
	}
	
}
