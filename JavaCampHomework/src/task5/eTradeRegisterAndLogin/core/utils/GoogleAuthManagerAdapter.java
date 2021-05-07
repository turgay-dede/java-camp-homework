package task5.eTradeRegisterAndLogin.core.utils;


import task5.eTradeRegisterAndLogin.entities.concreates.User;
import task5.eTradeRegisterAndLogin.google.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements GoogleAuthService {
	
	GoogleAuthManager googleAuthManager;
	
	public GoogleAuthManagerAdapter() {
		this.googleAuthManager = new GoogleAuthManager();
	}
	
	@Override
	public void register(User user) {		
		googleAuthManager.register(user);
	}

	@Override
	public void login(String email, String password) {		
		googleAuthManager.login(email, password);
	}

}
