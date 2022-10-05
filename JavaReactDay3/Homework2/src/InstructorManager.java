public class InstructorManager extends UserManager {

    public void login(User user) {
        System.out.println("(Instructor) Logged İn: " + user.getFirstName() + " " + user.getLastName());
    }

    public void addCourse() {
        System.out.println("Course Added Succesfully");
    }

    public void deleteCourse() {
        System.out.println("Course Deleted Succesfully");
    }

}
