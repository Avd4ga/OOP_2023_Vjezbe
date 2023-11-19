package Random.OptionalWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibraryCatalog {

    List<Book> books;

    public LibraryCatalog(List<Book> books){
        this.books=books;
    }

    public Optional<Book> getAvailability(String title){
        for(Book b:books){

            if(b.title().equals(title) && b.available()){
                return Optional.of(b);
            }

        }

        return Optional.empty();
    }

    public Optional<Book> firstAvailableByAuthor(String author){
        for(Book b:books){
            if(b.author().equals(author) && b.available()){
                return Optional.of(b);
            }
        }
        return Optional.empty();

    }

    public void updateAvailable(String title, boolean available) {

        books.stream()
                .filter(book -> book.title().equals(title))
                .findFirst()
                .ifPresent(book -> book = new Book(
                        book.title(), book.author(), book.year(), available
                ));
    }

}
