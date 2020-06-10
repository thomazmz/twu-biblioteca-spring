package com.twu.biblioteca.domain.movie;

import com.twu.biblioteca.domain.borrowableItem.BorrowableItem;

import java.time.Year;

public class Movie extends BorrowableItem {

    private String title;

    private String director;

    private Year year;

    private Integer rating;

    public Movie(String title, String director, Year year, Integer rating) {
        super();
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public Year getYear() {
        return year;
    }

    public Integer getRating() {
        return rating;
    }
}