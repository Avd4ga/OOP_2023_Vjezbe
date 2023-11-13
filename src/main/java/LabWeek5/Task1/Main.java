package LabWeek5.Task1;

public class Main {
    public static void main(String[] args) {
        CivilService civ=new CivilService();
        System.out.println(civ.getDaysLeft());
        civ.work();
        System.out.println(civ.getDaysLeft());

        MilitaryService mil=new MilitaryService(140);
        System.out.println(mil.getDaysLeft());
        mil.work();
        System.out.println(mil.getDaysLeft());



    }
}
