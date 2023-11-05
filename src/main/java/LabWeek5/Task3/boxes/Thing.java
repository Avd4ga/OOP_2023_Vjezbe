package LabWeek5.Task3.boxes;

import java.util.Objects;

public class Thing {

    private String name;
    private double weight;

    public Thing(String name, double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative.");
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {

        this.name = name;
        this.weight=0;

    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name, thing.name);


    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
