package task3;

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() +" adli ogrenci sisteme eklendi");
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adli ogrenci sistemden silindi");
	}
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adli ogrenci bilgileri güncellendi");
	}
	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() +" adli ogrenci giris yapti");
	}
	@Override
	public void logout(User user) {
		System.out.println(user.getFirstName() + " "+ user.getLastName() +" adli ogrenci cikis yapti");
	}
	
	
	public void joinCourse(Student student,Course course) {
		System.out.println(student.getFirstName() + " "+ student.getLastName() +" "+ course.getCourseName() + " kursuna katildi");
	}	
	public void attendanceControl(Student student) {
		System.out.println(student.getFirstName() + " "+ student.getLastName() +" yoklamaya katildi");
	}
	public void comment(Student student) {
		System.out.println(student.getFirstName() + " "+ student.getLastName() +" yorum yapti");
	}
	

}
