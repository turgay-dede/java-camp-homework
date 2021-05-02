package task4;

import task4.Entities.Gamer;

public class ValidationGamer {

	public static boolean Validate(Gamer gamer) {
		if (gamer.getFirstName().length() > 3 && gamer.getLastName().length() > 2
				&& gamer.getNationaltyId().length() == 11 && !gamer.getNationaltyId().startsWith("0")
				&& gamer.getBirthYear() != null) {
			return true;
		} else {
			return false;
		}
	}

}
