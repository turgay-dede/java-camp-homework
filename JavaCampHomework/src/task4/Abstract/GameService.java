package task4.Abstract;

import task4.Entities.Game;
import task4.Entities.Gamer;

public interface GameService {
	
	void buy(Game game,Gamer gamer,String code);	
	public void buy(Game game, Gamer gamer);

}
