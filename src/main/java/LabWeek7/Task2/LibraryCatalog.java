package LabWeek7.Task2;

import java.util.ArrayList;
import java.util.Optional;

public class LibraryCatalog {
    private ArrayList<Book> books;

    public LibraryCatalog(ArrayList<Book> books) {
        this.books = books;
    }

    // Check the availability of a book by title
    public Optional<Boolean> checkAvailability(String title) {
        return books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst()
                .map(Book::available);
    }

    // Retrieve the details of the first available book by a specific author
    public Optional<Book> getFirstAvailableBookByAuthor(String author) {
        return books.stream()
                .filter(book -> book.author().equalsIgnoreCase(author) && book.available())
                .findFirst();
    }

    // Update the availability status of a book
    public boolean updateAvailability(String title, boolean newAvailability) {
        Optional<Book> bookToUpdate = books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst();

        if (bookToUpdate.isPresent()) {
            Book updatedBook = bookToUpdate.get().withAvailable(newAvailability);
            books.set(books.indexOf(bookToUpdate.get()), updatedBook);
            return true;
        } else {
            return false;
        }
    }
}
