package LabWeek6.Zad7;

import java.util.ArrayList;

public class LibraryMain {
    public static void main(String[] args) {

        Library Library=new Library();

        Book ches=new Book("Republika","Platon",2021);
        Library.addBook(ches);

        Book anotherBook = new Book("Never let me go", "Kazuo Ishiguro", 2020);
        Library.addBook(anotherBook);

        Library.printBooks();

        System.out.println("-------------------------------------");


        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        for (Book book: Library.searchByTitle("never")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }




    }


}
