package LabWeek5.Task3.boxes;

public class OneThingBox extends Box{
    private Thing things;

    public OneThingBox() {
        this.things=null;
    }

    @Override
    public void add(Thing thing) {
        if(this.things==null){
            this.things=thing;
        }

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things != null && this.things.equals(thing);
    }
}
