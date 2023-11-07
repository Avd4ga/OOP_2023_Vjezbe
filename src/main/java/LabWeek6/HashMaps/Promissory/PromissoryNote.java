package LabWeek6.HashMaps.Promissory;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String,Double> note=new HashMap<>();

    public PromissoryNote(){

    }
    public void setLoan(String toWhom,double value){

        note.put(toWhom,value);

    }
    public double howMuchIsTheDebt(String whose){
        if(note.containsKey(whose)) {

            return note.get(whose);
        }
        else return 0;
    }
}
