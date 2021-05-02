package task4.Concreate;

import task4.Abstract.CampaingService;
import task4.Entities.Campaing;
import task4.Entities.Game;

public class CampaingManager implements CampaingService {
	
	Campaing[] campaings;	
	
	public CampaingManager(Campaing[] campaings) {
		this.campaings = campaings;
	}
	
	public void add() {
		System.out.println("Yeni kampanya eklendi");
	}
	
	public void delete() {
		System.out.println("Kampanya kaldirildi");
	}
	
	public void update() {
		System.out.println("Kampanya guncellendi");
	}	
	
	public void useCode(Game game,String code) {
		for (Campaing campaing : campaings) {
			if (campaing.getCampaignCode() == code) {
				System.out.println(game.getGameName() +" oyununa " + code +" kodu uygulandi. "
						+ "Eski fiyat: "+ game.getPrice() +" tl. Indirimli fiyat: " + game.getCampaignPrice(campaing)+" tl'dir."  );
			}
		}
	}

}
