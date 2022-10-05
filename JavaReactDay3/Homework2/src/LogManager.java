public class LogManager extends Main {


    public void logStudent(String firstName, String lastName, String eMail, String password, int age, String education, String courses, String completedCourses) {

        Student student1 = new Student();
        student1.setFirstName(firstName);
        student1.setLastName(lastName);
        student1.seteMail(eMail);
        student1.setPassword(password);
        student1.setAge(age);
        student1.setCourses(courses);

        System.out.println("Student Logged Succesfully!: " + firstName + " ID: " + student1.getId());

        StudentProcess(student1);
    }

    public void logInstructor(String firstName, String lastName, String eMail, String password, String profession) {

        Instructor instructor1 = new Instructor();
        instructor1.setFirstName(firstName);
        instructor1.setLastName(lastName);
        instructor1.seteMail(eMail);
        instructor1.setPassword(password);
        instructor1.setProfession(profession);


        System.out.println("Instructor Logged Succesfully!: " + firstName + " ID: " + instructor1.getId());
        InstructorProcess(instructor1);
    }


}