package com.twu.biblioteca.domain.book;

import com.twu.biblioteca.domain.borrowableItem.BorrowableItemRepository;
import com.twu.biblioteca.domain.borrowableItem.BorrowableItemService;
import org.springframework.stereotype.Service;

@Service
public class BookService extends BorrowableItemService<Book> {

    public BookService(BorrowableItemRepository<Book> inMemoryBookRepository) {
        super(inMemoryBookRepository);
    }
}