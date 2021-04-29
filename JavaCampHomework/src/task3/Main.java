package task3;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Turgay","Dede","turgay@turgay.com","12345t");
		Student student = new Student(1, "Kutay", "Dede", "kutay@kutay.com", "12345k","955");
		Instructor instructor = new Instructor(1, "Engin", "Demirog", "engin@engin.com", "12345e");
		Course course1 = new Course(1, "Yazilim Gelistirici Yetistirme Kampi(C#+Angular)", "Engin Demirog");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.delete(user);
		userManager.update(user);
		userManager.login(user);
		userManager.logout(user);
		System.out.println("*********************************");
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student,course1);
		studentManager.attendanceControl(student);
		studentManager.comment(student);
		System.out.println("*********************************");

		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.addHomework(instructor);	

	}

}
