package task4.Concreate;

import task4.ValidationGamer;
import task4.Abstract.GamerService;
import task4.Entities.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		
		if (ValidationGamer.Validate(gamer)) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adli oyuncu eklendi");
		} else {
			System.out.println("Bilgilerinizi kontrol ediniz.");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adli oyuncu silindi");

	}

	@Override
	public void update(Gamer gamer) {
		if (gamer.getFirstName().length() > 3 && gamer.getLastName().length() > 2
				&& gamer.getNationaltyId().length() == 11 && gamer.getBirthYear() != null) {
			System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " adli oyuncu guncellendi");
		} else {
			System.out.println("Bilgilerinizi kontrol ediniz.");
		}

	}

}
