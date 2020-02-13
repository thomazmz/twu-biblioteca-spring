package com.twu.biblioteca.infrastructure.memory;

import com.twu.biblioteca.domain.movie.Movie;
import org.springframework.stereotype.Component;

@Component
public class InMemoryMovieRepository extends InMemoryBorrowableItemRepository<Movie> {

}