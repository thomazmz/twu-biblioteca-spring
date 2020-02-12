package com.twu.biblioteca.domain.book;

import com.twu.biblioteca.domain.borrowableItem.BorrowableItem;

import java.time.Year;

public class Book extends BorrowableItem {

    private String title;

    private String author;

    private Year year;

    public Book(String title, String author, Year year) {
        super();
        this.title = title;
        this.author = author;
        this.year = year;
    }
}