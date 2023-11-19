package LabWeek7.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, true));
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 1960, true));
        bookList.add(new Book("1984", "George Orwell", 1949, false));
        bookList.add(new Book("Pride and Prejudice", "Jane Austen", 1813, true));


        LibraryCatalog libraryCatalog = new LibraryCatalog(bookList);

        System.out.println(libraryCatalog.checkAvailability("The Great Gatsby"));
        System.out.println(libraryCatalog.getFirstAvailableBookByAuthor("Harper Lee"));
        boolean updated = libraryCatalog.updateAvailability("1984", true);
        System.out.println("Updated availability of '1984': " + updated);



    }
}
