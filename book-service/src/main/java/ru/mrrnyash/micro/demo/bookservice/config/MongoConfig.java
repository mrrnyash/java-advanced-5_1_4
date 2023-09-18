package ru.mrrnyash.micro.demo.bookservice.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import ru.mrrnyash.micro.demo.bookservice.model.Book;
import ru.mrrnyash.micro.demo.bookservice.repository.BookRepository;


@EnableMongoRepositories(basePackageClasses = BookRepository.class)
@Configuration
public class MongoConfig {
    @Bean
    CommandLineRunner commandLineRunner(BookRepository bookRepository) {
        return strings -> {
            bookRepository.save(new Book("123", "Book 1", "Description 2", "Link 1"));
            bookRepository.save(new Book("456", "Book 2", "Description 2", "Link 2"));
        };
    }
}