package ru.mrrnyash.micro.demo.clientservice.connector;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.mrrnyash.micro.demo.clientservice.model.Book;

import java.util.List;

@FeignClient(name = "BOOK-SERVICE")
public interface BookServiceConnector {

    @GetMapping("/api/books")
    List<Book> getAllBooks();

}

