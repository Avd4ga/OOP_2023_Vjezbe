package LabWeek9;

import java.util.NoSuchElementException;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}