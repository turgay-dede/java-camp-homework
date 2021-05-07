package task5.eTradeRegisterAndLogin.business.concreates;

import task5.eTradeRegisterAndLogin.business.abstracts.AuthService;
import task5.eTradeRegisterAndLogin.business.abstracts.MailService;
import task5.eTradeRegisterAndLogin.business.abstracts.UserService;
import task5.eTradeRegisterAndLogin.business.abstracts.UserValidationService;
import task5.eTradeRegisterAndLogin.core.utils.ValidationRules;
import task5.eTradeRegisterAndLogin.entities.concreates.User;

public class AuthManager implements AuthService {
	
	UserValidationService userValidationService;
	UserService userService;
	MailService mailService;
	
	public AuthManager(UserValidationService userValidationService,UserService userService,MailService mailService) {
		
		this.userValidationService = userValidationService;
		this.userService=userService;
		this.mailService=mailService;
		
	}

	

	@Override
	public void register(User user) {
		if (userValidationService.validate(user) && ValidationRules.run(isEmailExists(user.getEmail())) ) {
			System.out.println("Kayit islemi gerceklestirildi.");
			mailService.send("Kayit islemi basarili hesabinizi dogrulayiniz.", user.getEmail());
		}
		else {
			System.out.println("Bilgilerinizi kontrol ediniz");
		}
		
	}

	@Override
	public void login(String email, String password) {
		
		if(!checkIfAllFieldsFilled(email, password)) {
			System.out.println("Giriþ baþarýsýz. Bilgilerinizi kontrol ediniz");
			return;
		}
		
		User user = userService.getByEmailAndPassword(email, password);
		
		if (user == null) {
			System.out.println("Email veya þifrenizi kontrol ediniz");
		}
		
		if(!checkIfUserVerified(user)) {
			System.out.println("Lütfen hesabinizi doðrulayiniz");
			return;
		}
		System.out.println("Giriþ baþarýlý. Hoþgeldiniz : " + user.getFirstName() + " " + user.getLastName());
		
		
	}
	
	
	private boolean isEmailExists(String email) {
		return userService.getByEmail(email)==null;
	}
	private boolean checkIfUserVerified(User user) {
		return user.isVerify();
	}
	
	private boolean checkIfAllFieldsFilled(String email,String password) {
		if(email.length()<=0 || password.length() <=0) {
			return false;
		}
		return true;
	}
	
	

}
