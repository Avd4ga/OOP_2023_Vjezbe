package LabWeek4.People;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private int credits=0;

    private int student_id;

    private List<Integer> grades=new ArrayList<>();

    public Student(String name,String street){
        super( name, street);

    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void addGrade(int grade){

        if(grade>=0 && grade<=100){
            grades.add(grade);
        }
        else{
            System.out.println("Error");
        }

    }

    public void showGrades(){

        for (Integer s:grades) {

            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();

    }

    public int credits(){
        return credits;
    }

    public void study(){
        credits++;
    }

}
