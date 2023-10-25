package LabWeek4;

public class Circle extends Shape{

    private double radius;

    public Circle(String color,Filltype filltype,double radius){
        super(color, filltype);
        this.radius=radius;

    }

    @Override
    public void displayInfo(){

        System.out.println("Color: "+getColor()+" Fill: "+getFilltype()+" Radius: "+radius+" Area: "+getArea());

    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getCircumference(double r,double pi){

        return 2*pi*r;

    }

    public double getCircumference(double r){

        return  2*Math.PI*r;

    }



}
