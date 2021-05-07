package task5.eTradeRegisterAndLogin.UI;


import task5.eTradeRegisterAndLogin.business.abstracts.AuthService;
import task5.eTradeRegisterAndLogin.business.abstracts.MailService;
import task5.eTradeRegisterAndLogin.business.abstracts.UserService;
import task5.eTradeRegisterAndLogin.business.abstracts.UserValidationService;
import task5.eTradeRegisterAndLogin.business.concreates.AuthManager;
import task5.eTradeRegisterAndLogin.business.concreates.MailManager;
import task5.eTradeRegisterAndLogin.business.concreates.UserManager;
import task5.eTradeRegisterAndLogin.business.concreates.UserValidationManager;
import task5.eTradeRegisterAndLogin.dataAccess.concreates.InMemoryUserDao;
import task5.eTradeRegisterAndLogin.entities.concreates.User;


public class Main {

	public static void main(String[] args) {
		
		
		UserValidationService userValidationService = new  UserValidationManager();
		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		MailService mailService = new MailManager();
		
		//User user1 = new User(6, "Engin", "Demirog", "engin@hotmail.com", "",false);
				
		UserService userService = new UserManager(inMemoryUserDao,userValidationService);
		
		AuthService authService = new AuthManager(userValidationService,userService,mailService);
		//authService.register(user1);
		authService.login("turgay@hotmail.com","12345t");
		

	}
}
