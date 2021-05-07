package task5.eTradeRegisterAndLogin.business.concreates;

import java.util.regex.Pattern;

import task5.eTradeRegisterAndLogin.business.abstracts.UserValidationService;
import task5.eTradeRegisterAndLogin.core.utils.ValidationRules;
import task5.eTradeRegisterAndLogin.entities.concreates.User;

public class UserValidationManager implements UserValidationService {
	
	@Override
	public boolean validate(User user) {
		boolean result = ValidationRules.run(
				isMailFormatValid(user.getEmail()),
				isPasswordLengthValid(user.getPassword()),
				isFirstNameLengthValid(user.getFirstName()),
				isLastNameLengthValid(user.getLastName()),
				isAllFieldsFilled(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword())
				);
		return result;
	}
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	private boolean isFirstNameLengthValid(String firstName) {
		return firstName.length() >= 2;
	}

	private boolean isLastNameLengthValid(String firstName) {
		return firstName.length() >= 2;
	}

	private boolean isMailFormatValid(String mail) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(mail).find();
	}

	private boolean isPasswordLengthValid(String password) {
		return password.length() >= 6;
	}

	private boolean isAllFieldsFilled(String firstName, String lastName, String mail, String password) {
		if (firstName.length() <= 0 || lastName.length() <= 0 || mail.length() <= 0 || password.length() <= 0) {
			return false;
		}
		return true;
	}
	

}
