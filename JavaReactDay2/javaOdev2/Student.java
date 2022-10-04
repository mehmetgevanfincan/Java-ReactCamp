public class Student {
	
	public Student(int id, String firstName, String lastName, String email,String nickname) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nickname = nickname;
	}
	int id;
	String firstName;
	String lastName;
	String email;
	String nickname;
	Course[] enrolledCourses;
	
}
