package LabWeek7.Task1;

public record RecordLogger(String name) implements Logger {

    @Override
    public void logMessage(String message) {
        System.out.println(message+" "+name);
    }
}
