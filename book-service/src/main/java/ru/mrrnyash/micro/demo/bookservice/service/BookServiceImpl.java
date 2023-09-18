package ru.mrrnyash.micro.demo.bookservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mrrnyash.micro.demo.bookservice.model.Book;
import ru.mrrnyash.micro.demo.bookservice.repository.BookRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }


}
