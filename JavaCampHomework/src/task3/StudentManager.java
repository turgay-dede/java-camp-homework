package task3;

public class StudentManager {
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
