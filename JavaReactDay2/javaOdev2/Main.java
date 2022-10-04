public class Main {

	public static void main(String[] args) {		

		Course course1 = new Course(1,"2022 Java Camp","Engin Demiroğ","Yazılım Geliştirici Yetiştirme Kampı",
				"9 Ocak 2021");
				
		Course course2 = new Course(2, "C# + Angular", "Engin Demiroğ", "Yazılım Geliştirici Yetiştirme Kampı",
				"9 Ocak 2021");
		
		Student student1 = new Student(1,"Yagmur","Fincan","yagmur.fincan@kodlama.io","Code-W");
				
		Student student2 = new Student(2,"Mehmet Gevan", "Fincan", "gevan.fincan@kodlama.io","Code-Man");
		
		Course[] courses = {course1,course2};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
				
		CourseManager courseManager = new CourseManager();
	 	courseManager.addCourse(course1);
	 	courseManager.removeCourse(course2);
	
	 	StudentManager studentManager = new StudentManager();
	 	studentManager.registerToCourse(student1, course2);
	 	studentManager.registerToCourse(student2, course1);
	 	studentManager.showEnrolledCourses(student2);

	}
	
	 	

}

//aaa
