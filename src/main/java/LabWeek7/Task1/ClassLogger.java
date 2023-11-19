package LabWeek7.Task1;

public class ClassLogger implements  Logger{
private String name;
    public ClassLogger(String name) {
        this.name=name;
    }

    @Override
    public void logMessage(String message) {
        System.out.println(message+" "+name);;
    }
}
