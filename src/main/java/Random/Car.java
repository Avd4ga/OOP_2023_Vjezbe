package Random;

public class Car {

    private String car;

    private int year;

    private Brand brand;

    public Car(String car,int year,Brand brand){
        this.car=car;
        this.year=year;
        this.brand=brand;
    }

    public String GetCar(){
        return this.car;
    }

    public void setCar(String c){
        this.car=c;
    }


}
