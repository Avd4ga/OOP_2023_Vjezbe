package LabWeek4;

import static java.lang.String.valueOf;

public class Shape {

    private String color;

    private Filltype filltype;

    public Shape(String color, Filltype filltype) {
        this.color = color;
        this.filltype = filltype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Filltype getFilltype() {
        return filltype;
    }

    public void setFilltype(Filltype filltype) {
        this.filltype = filltype;
    }

    public void displayInfo(){

        System.out.println("Color: "+color+" Fill: "+filltype);

    }

    public double getArea(){
     return 0;
    }

}
