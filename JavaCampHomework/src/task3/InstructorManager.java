package task3;

public class InstructorManager  extends UserManager  {
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() +" adli egitmen sisteme eklendi");
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adli egitmen sistemden silindi");
	}
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adli egitmen bilgileri güncellendi");
	}
	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() +" adli egitmen giris yapti");
	}
	@Override
	public void logout(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() +" adli egitmen cikis yapti");
	}
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " "+ instructor.getLastName()+ " yeni bir kurs ekledi");
	}
	
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " "+ instructor.getLastName()+ " yeni bir ödev ekledi");
	}

}
