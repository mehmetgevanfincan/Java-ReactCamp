public class StudentManager {
	
	public void showEnrolledCourses(Student student) {
		System.out.println(student.firstName +" isimli ogrencinin kayitli dersleri gosterildi.");
	}
	
	public void registerToCourse(Student student, Course course) {
		System.out.println("Tebrikler " + student.firstName + " "+ course.name + " kursuna kaydiniz basariyla alinmistir.");
	}

}
