package task4.Abstract;

import task4.Entities.Game;

public interface CampaingService {
	void add();

	void update();

	void delete();

	void useCode(Game game, String code);

}
