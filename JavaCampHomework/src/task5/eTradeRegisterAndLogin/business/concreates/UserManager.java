package task5.eTradeRegisterAndLogin.business.concreates;

import java.util.List;

import task5.eTradeRegisterAndLogin.business.abstracts.UserService;
import task5.eTradeRegisterAndLogin.business.abstracts.UserValidationService;
import task5.eTradeRegisterAndLogin.dataAccess.abstracts.UserDao;
import task5.eTradeRegisterAndLogin.entities.concreates.User;

public class UserManager implements UserService {


	UserDao userDao;
	UserValidationService userValidationService;

	public UserManager(UserDao userDao, UserValidationService userValidationService) {
		this.userDao = userDao;
		this.userValidationService = userValidationService;
	}
		

	@Override
	public void add(User user) {
		if (this.userValidationService.validate(user)) {
			userDao.add(user);
			System.out.println(user.getFirstName() + " kullanicisi eklendi");

		} else {
			System.out.println("Doðrulama hatasi");

		}

	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public User getById(int userId) {
		return userDao.get(userId);
	}

	@Override
	public User getByEmail(String email) {
		return userDao.getByEmail(email);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}


	@Override
	public User getByEmailAndPassword(String email, String password) {
		return userDao.getByEmailAndPassword(email, password);
		
	}	

}
