package task5.eTradeRegisterAndLogin.dataAccess.abstracts;

import java.util.List;

import task5.eTradeRegisterAndLogin.entities.concreates.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(int id);
	User getByEmail(String email);
	User getByEmailAndPassword(String email, String password);
	List<User> getAll();
	
	}
	
