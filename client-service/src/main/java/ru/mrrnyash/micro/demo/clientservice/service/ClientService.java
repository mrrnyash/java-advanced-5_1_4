package ru.mrrnyash.micro.demo.clientservice.service;

import org.springframework.stereotype.Service;
import ru.mrrnyash.micro.demo.clientservice.model.Book;

import java.util.List;

@Service
public interface ClientService {

    public List<Book> getAllBooks();
}
