package LabWeek6.HashMaps.Dictionary;

import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader,Dictionary dictionary) {
        this.reader=reader;
        this.dictionary=dictionary;
    }
    public void start(){
        while (true) {
            System.out.println("Statement:");
            System.out.println("quit - quit the text interface");
            System.out.println("add,translate");
            String input=reader.nextLine();

            if(input.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {

                System.out.println("Enter word: ");
                String word=reader.nextLine();
                System.out.println("Enter translation:");
                String transl= reader.nextLine();
                dictionary.add(word,transl);

            } else if (input.equals("translate")) {

                System.out.println("Enter a word to translate:");
                String transWord=reader.nextLine();
                if(dictionary.translate(transWord)!=null){
                    System.out.println(dictionary.translate(transWord));
                }else System.out.println("Not in dictionary");

            }
            else System.out.println("Unknown command!!!");


        }

    }
}
