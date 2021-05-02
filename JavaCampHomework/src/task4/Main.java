package task4;

import task4.Concreate.CampaingManager;
import task4.Concreate.GameManager;
import task4.Concreate.GamerManager;
import task4.Entities.Campaing;
import task4.Entities.Game;
import task4.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		
		Game game = new Game(1, "GTA V", 180);
		GameManager gameManager = new GameManager();
		
		
		
		
		
		Gamer gamer = new Gamer(1, "Turgay", "Dede", "12345678901","1996");
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer);		
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		System.out.println("------------------------------------------------");
		
		
		gameManager.buy(game, gamer);
		System.out.println("------------------------------------------------");
		
		Campaing campaing = new Campaing(1, "G1", 15);
		Campaing campaing2 = new Campaing(2, "A1", 20);
		Campaing campaing3 = new Campaing(3, "B1", 10);
		Campaing[] campaings= new Campaing[] {campaing,campaing2,campaing3};
		CampaingManager campaingManager = new CampaingManager(campaings);
		campaingManager.add();
		campaingManager.update();
		campaingManager.delete();
		campaingManager.useCode(game, "B1");
	}

}
