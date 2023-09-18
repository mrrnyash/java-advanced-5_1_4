package ru.mrrnyash.micro.demo.bookservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.mrrnyash.micro.demo.bookservice.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}

