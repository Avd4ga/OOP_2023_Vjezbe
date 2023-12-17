package main.LabWeek9;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class EmptyStudentListException extends RuntimeException {
    public EmptyStudentListException(String message) {
        super(message);
    }
}

class Student {
    private int id;
    private String name;
    private String university;
    private String department;
    private double gpa;

    public Student(int id, String name, String university, String department, double gpa) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.department = department;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getDepartment() {
        return department;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student Name: " + name;
    }
}

class StudentSystem {
    private List<Student> students;

    public StudentSystem(String filename) {
        this.students = readStudents(filename);
    }

    private List<Student> readStudents(String filename) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            List<String> lines = bufferedReader.lines().collect(Collectors.toList());

            for (String line : lines) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                String university = parts[2];
                String department = parts[3];
                double gpa = Double.parseDouble(parts[4]);

                Student student = new Student(id, name, university, department, gpa);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle or log the exception as needed
        }

        return students;
    }

    public Optional<Student> getStudentById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst();
    }

    public Student getHighestGPAStudent() {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }

        return students.stream()
                .max(Comparator.comparingDouble(Student::getGpa))
                .orElseThrow(); // No need for a custom exception, as NoSuchElementException is thrown by default
    }

    public Student getLongestNameStudent() {
        if (students.isEmpty()) {
            throw new EmptyStudentListException("List of students is empty.");
        }

        return students.stream()
                .max(Comparator.comparingInt(student -> student.getName().length()))
                .orElseThrow(); // No need for a custom exception, as NoSuchElementException is thrown by default
    }

    public List<Student> getStudents() {
        return students;
    }
}

