public class LogManager {
    public void log(int logType) {
        if(logType ==1) {
            System.out.println("Log of the Database");
        }else if (logType ==2){
            System.out.println("Log of the File");
        }else {
            System.out.println("Log of the Email");
        }
    }
}

//1- Database
//2- File
//3- Email