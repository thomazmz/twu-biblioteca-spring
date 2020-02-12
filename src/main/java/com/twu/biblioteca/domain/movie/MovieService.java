package com.twu.biblioteca.domain.movie;

import com.twu.biblioteca.domain.borrowableItem.BorrowableItemService;
import org.springframework.stereotype.Service;

@Service
public class MovieService extends BorrowableItemService<Movie> {

    public MovieService(MovieRepository movieRepository) {
        super(movieRepository);
    }
}