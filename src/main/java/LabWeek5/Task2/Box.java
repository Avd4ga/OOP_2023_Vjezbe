package LabWeek5.Task2;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private double weight;
    private static ArrayList<ToBeStored> items;
    private double currentWeight=0;

    public Box(double weight) {
        this.weight = weight;
        this.items=new ArrayList<>();
    }


    public void add(ToBeStored item) {

        if (currentWeight + item.weight() <= weight) {
            items.add(item);
            currentWeight += item.weight();
        }
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + currentWeight + " kg";
    }

    public static void print(){
        System.out.println("Items in box: ");

        for(ToBeStored s:items){
            System.out.println(s);
        }

    }

}
