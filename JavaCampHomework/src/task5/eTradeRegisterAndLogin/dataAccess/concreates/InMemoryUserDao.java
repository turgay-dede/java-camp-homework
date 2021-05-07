package task5.eTradeRegisterAndLogin.dataAccess.concreates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import task5.eTradeRegisterAndLogin.dataAccess.abstracts.UserDao;
import task5.eTradeRegisterAndLogin.entities.concreates.User;

public class InMemoryUserDao implements UserDao {

	User user1 = new User(1, "Turgay", "Dede", "turgay@hotmail.com", "12345t",false);
	User user2 = new User(2, "Tulay", "Dede", "tulay@hotmail.com", "12345tl",true);
	User user3 = new User(3, "Kutay", "Dede", "kutay@hotmail.com", "12345k",true);
	User user4 = new User(4, "Avni Berk", "Dede", "avni@hotmail.com", "12345a",true);
	User user5 = new User(5, "Belinay", "Dede", "belinay@hotmail.com", "12345b",true);

	ArrayList<User> users = new ArrayList<>(Arrays.asList(user1, user2, user3, user4, user5));	

	@Override
	public void add(User user) {
		users.add(user);
		
		
	}

	@Override
	public void delete(User user) {		
		users.removeIf(u->u.getId() == user.getId());
		
	}

	@Override
	public void update(User user) {
		User userToUpdate = get(user.getId());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		
	}

	@Override
	public User get(int id) {
		for(User user : users) {
			if(user.getId() == id)
				return user;
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if (user.getEmail()== email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for (User user : users) {
			if (user.getEmail()==email && user.getPassword()==password) {
				return user;
			}
		}
		return null;
	}

}
