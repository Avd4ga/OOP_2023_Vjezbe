package LabWeek6.Zad7;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books =new ArrayList<>();

    public Library() {
    }

    public void addBook(Book newBook){

        books.add(newBook);

    }

    public void printBooks(){

        for (Book s:books) {
            System.out.println(s);
        }

    }

    public ArrayList<Book> searchByTitle(String Searchtitle){
        ArrayList<Book> found=new ArrayList<>();

        for (Book s:books) {
            if(StringUtils.included(s.title(),Searchtitle)){
                found.add(s);
            }


        }
        return found;

    }
    public ArrayList<Book> searchByPublisher(String Searchpublisher){

        ArrayList<Book> found=new ArrayList<>();

        for (Book s:books) {
            if(StringUtils.included(s.publisher(),Searchpublisher)){
                found.add(s);
            }


        }
        return found;

    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found=new ArrayList<>();

        for (Book s:books) {
            if(s.year()==year){
                found.add(s);
            }


        }
        return found;


    }
}
