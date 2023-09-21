package ru.mrrnyash.micro.demo.bookservice.service;

import org.springframework.stereotype.Service;
import ru.mrrnyash.micro.demo.bookservice.model.Book;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAllBooks();

}
