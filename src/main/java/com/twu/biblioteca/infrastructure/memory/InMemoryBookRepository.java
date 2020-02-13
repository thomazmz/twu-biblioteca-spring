package com.twu.biblioteca.infrastructure.memory;

import com.twu.biblioteca.domain.book.Book;
import org.springframework.stereotype.Component;

@Component
public class InMemoryBookRepository extends InMemoryBorrowableItemRepository<Book> {

}