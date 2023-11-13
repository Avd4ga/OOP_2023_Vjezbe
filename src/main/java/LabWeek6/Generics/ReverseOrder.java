package LabWeek6.Generics;

import java.util.ArrayList;
import java.util.List;

public class ReverseOrder {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> reverseL=reverseList(integerList);
        System.out.println(reverseL);

        List<Double> doublesList = List.of(2.0, 1.5, 4.5, 7.6, 9.3);
        List<Double> reverseD=reverseList(doublesList);
        System.out.println(reverseD);

    }

    public static <T> List<T> reverseList(List <T> orig){
        List<T> reversed=new ArrayList<>();

        for (int i= orig.size()-1;i>-1;i--) {

            reversed.add(orig.get(i));

        }
        return reversed;


    }


}

