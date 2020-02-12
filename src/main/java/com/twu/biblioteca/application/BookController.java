package com.twu.biblioteca.application;

import com.twu.biblioteca.domain.book.Book;
import com.twu.biblioteca.domain.book.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("books")
public class BookController {

    public BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<?> createBook(@RequestBody final Book book) {
        return ResponseEntity.ok(bookService.create(book));
    }

    @GetMapping
    public ResponseEntity<?> getBooks() {
        return ResponseEntity.ok(bookService.getAll());
    }

    @GetMapping("/availables")
    public ResponseEntity<?> getAvailableBooks() {
        return ResponseEntity.ok(bookService.getAvailables());
    }
}