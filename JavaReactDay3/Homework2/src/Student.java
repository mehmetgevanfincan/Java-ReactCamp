public class Student extends User {
    public Student() {

    }

    public Student(int age,String university,String courses) {
        this.age = age;
        this.university = university;
        this.courses = courses;
    }

    private int age;
    private String university;
    private String courses;

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }
}
