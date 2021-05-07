package task5.eTradeRegisterAndLogin.business.abstracts;

import task5.eTradeRegisterAndLogin.entities.concreates.User;

public interface AuthService {
	void register(User user);
	void login(String mail, String password);

}
