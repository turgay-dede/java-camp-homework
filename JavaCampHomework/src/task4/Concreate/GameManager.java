package task4.Concreate;

import task4.Abstract.GameService;
import task4.Entities.Game;
import task4.Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() +" " + gamer.getLastName() + " adli oyuncu "+game.getGameName() +" oyununu satin aldi");
		
	}
	
}
