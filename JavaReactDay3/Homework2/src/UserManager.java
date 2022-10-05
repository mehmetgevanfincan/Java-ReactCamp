public class UserManager {

    public void login(User user) {
        System.out.println("(User) Logged in: " + user.getFirstName() + " " + user.getLastName());
    }

    public void register(User user) {
        System.out.println("Recorded: " + user.getFirstName() + " " + user.getLastName());
    }

    public void viewProfile(User user) {
        String accountInfo = "Name: " + user.getFirstName() + "\nSurname: " + user.getLastName() + "\nEmail" + user.geteMail();
        System.out.println("Profile: " + accountInfo);
    }
}