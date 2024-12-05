package ucu.edu.task2;

public class ReportBuilder {

    private DataBase dataBase;

    public ReportBuilder(DataBase db) {
        this.dataBase = db;
    }

    public void buildReport() {
        String userData = dataBase.getUserData();

        System.out.println("Building report for user: " + userData);
    }
}
