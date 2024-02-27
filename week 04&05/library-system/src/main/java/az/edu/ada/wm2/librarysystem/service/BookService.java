package az.edu.ada.wm2.librarysystem.service;

import az.edu.ada.wm2.librarysystem.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks() {
        return books;
    }

    public Optional<Book> getBookById(Long id) {
        return Optional.ofNullable(books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElse(null));
    }

//    public Book saveBook(Book book) {
//        if (book.getId() == null) {
//            book.setId((long) (books.size() + 1));
//            books.add(book);
//        } else {
//            books.set(findIndexById(book.getId()), book);
//        }
//        return book;
//    }

    public void saveBook(Book book) {
        if (book.getId() == null) {
            book.setId((long) (books.size() + 1));
            books.add(book);
        } else {
            books.set(findIndexById(book.getId()), book);
        }
    }
    public void createAndSaveBook(Book book) {
        saveBook(book);
    }

    public void deleteBook(Long id) {
        books.removeIf(book -> book.getId().equals(id));
    }

    private int findIndexById(Long id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
