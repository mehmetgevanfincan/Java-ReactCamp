package InheritanceDemo;

public class Main {
    public static void main(String[] args){
        CreditUI creditUI =new CreditUI();
        creditUI.CalculateOfCredit(new TeacherCreditManager());
    }
}
