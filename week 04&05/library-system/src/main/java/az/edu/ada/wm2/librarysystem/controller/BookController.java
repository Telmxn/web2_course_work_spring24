package az.edu.ada.wm2.librarysystem.controller;

import az.edu.ada.wm2.librarysystem.model.Book;
import az.edu.ada.wm2.librarysystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public String getAllBooks(Model model) {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "book_list";
    }

    @GetMapping("/{id}/edit")
    public String editBookForm(@PathVariable Long id, Model model) {
        Optional<Book> book = bookService.getBookById(id);
        model.addAttribute("book", book.orElse(new Book()));
        return "edit_book";
    }

    @PostMapping("/{id}/edit")
    public String editBook(@ModelAttribute Book book) {
        bookService.saveBook(book);
        return "redirect:/books";
    }

    @GetMapping("/{id}/delete")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }

    @GetMapping("/new")
    public String newBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "new_book";
    }

    @PostMapping("/new")
    public String newBook(@ModelAttribute Book book) {
        book.setId(null);
        System.out.println(book.getId());
        bookService.createAndSaveBook(book);
        return "redirect:/books";
    }
}
