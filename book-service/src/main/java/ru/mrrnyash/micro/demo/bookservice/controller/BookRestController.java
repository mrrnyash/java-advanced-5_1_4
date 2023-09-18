package ru.mrrnyash.micro.demo.bookservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.mrrnyash.micro.demo.bookservice.model.Book;
import ru.mrrnyash.micro.demo.bookservice.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BookRestController {

    private final BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public void saveBook(@RequestBody Book book) {
        bookService.saveBook(book);
    }
}
