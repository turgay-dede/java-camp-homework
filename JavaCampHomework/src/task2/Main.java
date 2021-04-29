package task2;

public class Main {

	public static void main(String[] args) {		
		
		Course course1 = new Course(1,"img-csharp-angular.png","Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)","Engin Demirog", 82);
		Course course2 = new Course(2,"img-java-react.png","Yazilim Gelistirici Yetistirme Kampi (Java + REACT)","Engin Demirog", 36);
		Student student1 = new Student(1, "Turgay Dede", "turgay@turgay.com", "12345t");
		Student student2 = new Student(2, "Kutay Dede", "kutay@kutay.com", "12345k");
		
		Course[] courses= {course1,course2};
		Student[] students= {student1,student2};
		System.out.println("Ögrenci Listesi");
		for (Student student : students) {
			System.out.println(student.id);
			System.out.println(student.FullName);
			System.out.println(student.mail);
			System.out.println(student.password);
			System.out.println("---------------------");
		}
		
		System.out.println("Kurs Listesi");
		for (Course course : courses) {
			System.out.println(course.id);
			System.out.println(course.imagePath);
			System.out.println(course.courseName);
			System.out.println(course.teacher);
			System.out.println(course.courseCompleted + "% TAMAMLANDI");
			System.out.println("---------------------");
		}				
		
		CourseManager courseManager = new CourseManager();
		System.out.println("Kurs Kayit islemi");
		courseManager.Add(student1, course1);
		System.out.println("Kurs silme islemi");
		courseManager.Remove(student1, course1);
		System.out.println("---------------------");
		
		StudentManager studentManager = new StudentManager();
		System.out.println("Ögrenci Kayıt islemi");
		studentManager.Add(student2);
		System.out.println("Ögrenci silme islemi");
		studentManager.Remove(student2);
	}

}
