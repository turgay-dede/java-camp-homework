package task2;

public class CourseManager {
	
	public void Add(Student student, Course course) {
		System.out.println(student.FullName + ' '+ course.courseName +"' na katildi");
		
	}
	public void Remove(Student student, Course course) {
		System.out.println(student.FullName + ' '+ course.courseName +"' dan ayrildi");
		
	}

}
