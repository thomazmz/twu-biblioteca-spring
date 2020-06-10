package com.twu.biblioteca.infrastructure.memory;

import com.twu.biblioteca.domain.book.Book;
import com.twu.biblioteca.domain.movie.Movie;
import org.springframework.stereotype.Component;

import java.time.Year;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Component
public class InMemoryBookRepository extends InMemoryBorrowableItemRepository<Book> {

    private static final List<Book> books = new LinkedList<>(Arrays.asList(
        new Book("Refactoring", "Martin Fowller", Year.of(1999)),
        new Book("Effective Java", "Joshua Bloch", Year.of(2001)),
        new Book("Extreme Programming", "Kent Beck", Year.of(1999)),
        new Book("The Pragmatic Programmer", "Andrew Hunt", Year.of(1999)),
        new Book("Practices of an Agile Developer", "Venkat Subramaniam", Year.of(2006)),
        new Book("Clean Code", "Robbert C. Martin", Year.of(2008)),
        new Book("Test Driven Development By Example", "Kent Beck", Year.of(2000)),
        new Book("Database Management Systems", "Raghu Ramakrishnan", Year.of(1996)),
        new Book("Practical Unit Testing", "Tomek Kaczanowski", Year.of(2019)),
        new Book("Building Microservices", "Sam Newman", Year.of(2014)),
        new Book("Designing Event Driven Systems", "Ben Stopford", Year.of(2018)),
        new Book("Building Evolutionary Architectures", "Rebecca Parsons", Year.of(2017))
    ));

    InMemoryBookRepository() {
        super(books);
    }
}