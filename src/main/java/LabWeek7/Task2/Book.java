package LabWeek7.Task2;

public record Book(String title,String author,int pubYear,boolean available) {
    public Book withAvailable(boolean available) {
        return new Book(title, author, pubYear, available);
    }
}
