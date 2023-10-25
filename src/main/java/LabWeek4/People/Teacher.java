package LabWeek4.People;

public class Teacher extends Person{

    private int salary;

    public Teacher(String name,String street,int salary){

        super(name,street);
        this.salary=salary;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){

        return ("Name: "+ getName() +" Street: "+ getStreet() +" Salary: "+salary);

    }



}
