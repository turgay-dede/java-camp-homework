package task5.eTradeRegisterAndLogin.business.concreates;

import task5.eTradeRegisterAndLogin.business.abstracts.MailService;

public class MailManager implements MailService {

	@Override
	public void send(String message, String to) {
		System.out.println("Do�rulama mesaji: "+message + " " + to+ " kisisine g�nderildi" );
		
	}

}
