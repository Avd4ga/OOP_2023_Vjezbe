package LabWeek4;

public class Main {
    public static void main(String[] args) {

        Shape s1= new Shape("Green",Filltype.FILLED);
        s1.displayInfo();

        Circle c1=new Circle("Blue",Filltype.NOT_FILLED,5);
        c1.displayInfo();

        Rectangle r1=new Rectangle("Red",Filltype.FILLED,4,7);
        r1.displayInfo();

    }




}
