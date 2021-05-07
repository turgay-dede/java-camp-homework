package task5.eTradeRegisterAndLogin.business.abstracts;

import task5.eTradeRegisterAndLogin.entities.concreates.User;

public interface UserValidationService {
	public boolean validate(User user);
	

}
