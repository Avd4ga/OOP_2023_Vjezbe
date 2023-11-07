package LabWeek6.BirdWatchers;

public class Bird {

    private final String name;
    private final String latinName;
    private int observation;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void observation(){
        observation++;
    }

    public int getObservation() {
        return observation;
    }
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): "
                + this.observation + " observations";
    }



}
