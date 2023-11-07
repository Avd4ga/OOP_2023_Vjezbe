package LabWeek6.HashMaps.Dictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDict {
    public static void main(String[] args) {

        Dictionary dictionary=new Dictionary();

        dictionary.add("Desk","Sto");
        dictionary.add("Clock","Sat");

        System.out.println(dictionary);

        System.out.println(dictionary.translate("Desk"));
        System.out.println(dictionary.amountOfWords());

        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");


        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
        System.out.println("----------------------------------------------------");
        TextUserInterface ui = new TextUserInterface(new Scanner(System.in), dictionary);
        ui.start();

    }
}
