package Random.Quiz4;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterations {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Avdo");
        names.add("Amke");
        names.add("Hakala");
        names.add("Muha");

        Iterator<String> it= names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(names);
    }
}
