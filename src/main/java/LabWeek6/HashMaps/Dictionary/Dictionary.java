package LabWeek6.HashMaps.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private int count=0;
    private HashMap<String,String> trans=new HashMap<>();



    public String translate(String word){
        if(trans.containsKey(word)) {
            return trans.get(word);
        }
        else return null;
    }

    public void add(String word,String transl){
        trans.put(word,transl);
        count++;
    }

   public int amountOfWords(){
        return count;

   }

   public ArrayList<String> translationList(){
        ArrayList<String> list1=new ArrayList<>();

        for(String name:trans.keySet()){
            list1.add(name+"="+trans.get(name));
        }

        return list1;
   }

}
