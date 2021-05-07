package task5.eTradeRegisterAndLogin.google;


import task5.eTradeRegisterAndLogin.entities.concreates.User;

public class GoogleAuthManager {
	public void register(User user) {
		System.out.println("Google ile kayit olundu");
		
	}

	
	public void login(String email, String password) {		
		System.out.println("Google ile giris yapildi");
	}

}
