package com.twu.biblioteca.domain.book;

import com.twu.biblioteca.domain.borrowableItem.BorrowableItemService;
import org.springframework.stereotype.Service;

@Service
public class BookService extends BorrowableItemService<Book> {

    public BookService(BookRepository bookRepository) {
        super(bookRepository);
    }
}