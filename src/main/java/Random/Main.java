package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

record Wolf(String name,int age){}

public class Main {
    public static Optional<Wolf> getWolfByNameOptional(String name){
        return Optional.ofNullable(null);

    }
    public static void main(String[] args) {

        Wolf w=new Wolf("Strasni",3);



        Car c1=new Car("Golf 3",2003,Brand.AUDI);


        Optional<Wolf> wolfOptional = getWolfByNameOptional("Strasni");
        if(wolfOptional.isPresent()){
            System.out.println(wolfOptional.get().name());
        } else {

            System.out.println("No such wolf");

        }

        List<String> cars=new ArrayList <>();

    }






}

