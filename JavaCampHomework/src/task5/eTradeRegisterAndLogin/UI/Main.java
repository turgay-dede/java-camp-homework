package task5.eTradeRegisterAndLogin.UI;


import task5.eTradeRegisterAndLogin.business.concreates.AuthManager;
import task5.eTradeRegisterAndLogin.business.concreates.MailManager;
import task5.eTradeRegisterAndLogin.business.concreates.UserManager;
import task5.eTradeRegisterAndLogin.business.concreates.UserValidationManager;
import task5.eTradeRegisterAndLogin.dataAccess.concreates.InMemoryUserDao;
import task5.eTradeRegisterAndLogin.entities.concreates.User;


public class Main {

	public static void main(String[] args) {
		
		
		UserValidationManager userValidationManager = new  UserValidationManager();
		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		MailManager mailManager = new MailManager();
		
		User user1 = new User(6, "Engin", "Demirog", "engin@hotmail.com", "",false);
				
		UserManager userManager = new UserManager(inMemoryUserDao,userValidationManager);
		
		AuthManager authManager = new AuthManager(userValidationManager,userManager,mailManager);
		//authManager.register(user1);
		authManager.login("turgay@hotmail.com","12345t");
		

	}
}
