package LabWeek6.Zad7;

public class Book {
    private String publisher;
    private String title;
    private int year;

    public Book(String title, String publisher, int year) {
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }
    public String title(){

        return this.title;

    }
    public String publisher(){
        return this.publisher;
    }
    public int year(){
        return this.year;

    }

    @Override
    public String toString(){

        return this.title+", "+this.publisher+", "+this.year;

    }

}
