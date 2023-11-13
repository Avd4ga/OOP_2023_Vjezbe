package LabWeek5.Task3.boxes;


import java.util.ArrayList;

public class MaxWeightBox extends Box {
    private double maxWeight;
    private double currentWeight = 0;
    private ArrayList<Thing> things;

    public MaxWeightBox(double maxWeight) {

        this.maxWeight = maxWeight;
        things= new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        if (thing.getWeight() + currentWeight <= maxWeight) {
            things.add(thing);
            currentWeight += thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing t:things) {
            if(t.getName().equals(thing.getName())){
                return true;
            }

        }
        return false;
    }
}

