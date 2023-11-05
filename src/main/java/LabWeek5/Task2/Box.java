package LabWeek5.Task2;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private double weight;
    private List<ToBeStored> items=new ArrayList<>();
    private double currentWeight=0;

    public Box(double weight) {
        this.weight = weight;
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

}
