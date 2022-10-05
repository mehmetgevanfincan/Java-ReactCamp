public class Instructor extends User{
    public Instructor(){

    }

    public Instructor(String profession){
        this.profession = profession;
    }

    private String profession;

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
