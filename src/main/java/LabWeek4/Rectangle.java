package LabWeek4;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String color,Filltype filltype,double width, double height) {
        super(color,filltype);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea(){
        return width*height;
    }

    @Override
    public void displayInfo(){

        System.out.println("Color: "+getColor()+" Fill: "+getFilltype()+" Width: "+width+" Height: "+height+" Area: "+getArea());

    }

}
