package ucu.edu.task2;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Auth auth = new Auth();
        if (auth.auth(db)){
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
