package task5.eTradeRegisterAndLogin.core.utils;

import task5.eTradeRegisterAndLogin.entities.concreates.User;

public interface GoogleAuthService {
	void register(User user);
	void login(String email, String password);

}
