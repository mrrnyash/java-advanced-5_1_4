package ru.mrrnyash.micro.demo.clientservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mrrnyash.micro.demo.clientservice.model.Book;
import ru.mrrnyash.micro.demo.clientservice.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/api/client")
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return clientService.getAllBooks();
    }

    @GetMapping("/test")
    public String test() {
        return "Hello from Client 1";
    }
}
