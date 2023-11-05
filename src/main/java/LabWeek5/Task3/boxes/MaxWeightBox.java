package LabWeek5.Task3.boxes;


public class MaxWeightBox extends Box {
    private double maxWeight;
    private double currentWeight = 0;
    private Thing things;

    public MaxWeightBox(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        if (this.things == null && thing.getWeight() + currentWeight <= maxWeight) {
            this.things = thing;
            currentWeight += thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things != null && this.things.equals(thing);
    }
}

