package task5.eTradeRegisterAndLogin.core.utils;

import task5.eTradeRegisterAndLogin.entities.concreates.User;
import task5.eTradeRegisterAndLogin.google.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService {

	@Override
	public void register(User user) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register(user);
	}

	@Override
	public void login(String email, String password) {

		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login(email, password);
	}

}
