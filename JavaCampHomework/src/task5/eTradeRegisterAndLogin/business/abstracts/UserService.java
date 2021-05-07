package task5.eTradeRegisterAndLogin.business.abstracts;

import java.util.List;

import task5.eTradeRegisterAndLogin.entities.concreates.User;

public interface UserService {	

	void add(User user);
	void update(User user);
	void delete(User user);
	User getById(int userId);
	User getByEmail(String email);
	User getByEmailAndPassword(String email, String password);
	List<User> getAll();
	
	
}
