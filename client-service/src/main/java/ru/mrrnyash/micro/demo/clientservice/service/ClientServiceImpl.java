package ru.mrrnyash.micro.demo.clientservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mrrnyash.micro.demo.clientservice.connector.BookServiceConnector;
import ru.mrrnyash.micro.demo.clientservice.model.Book;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final BookServiceConnector bookServiceConnector;

    @Override
    public List<Book> getAllBooks() {
        return bookServiceConnector.getAllBooks();
    }
}