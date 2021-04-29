package task3;

public class InstructorManager {
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " "+ instructor.getLastName()+ " yeni bir kurs ekledi");
	}
	
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " "+ instructor.getLastName()+ " yeni bir ödev ekledi");
	}

}
