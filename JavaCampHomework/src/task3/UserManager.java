package task3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme eklendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " sistemden silindi");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " bilgileri guncellendi");
	}
	public void login(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " giris yapti");
	}
	public void logout(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " cikis yapti");
	}
}
