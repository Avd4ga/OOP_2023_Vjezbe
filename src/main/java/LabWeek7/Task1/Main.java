package LabWeek7.Task1;



public class Main {
    public static void main(String[] args) {

        Logger recordLogger = (String message) -> new RecordLogger("RecordLogger").logMessage(message);

        // Instantiate ClassLogger with a lambda function
        Logger classLogger = (String message) -> new ClassLogger("ClassLogger").logMessage(message);

        // Log messages using lambda functions
        recordLogger.logMessage("This is a record-based log message.");
        classLogger.logMessage("This is a class-based log message.");


    }
}
