package com.twu.biblioteca.infrastructure.memory;

import com.twu.biblioteca.domain.movie.Movie;
import org.springframework.stereotype.Component;

import java.time.Year;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Component
public class InMemoryMovieRepository extends InMemoryBorrowableItemRepository<Movie> {

    private static final List<Movie> movies = new LinkedList<>(Arrays.asList(
        new Movie("The Seven Samurai", "Akira Kurosawa", Year.of(1955), 10),
        new Movie("Reservoir Dogs", "Quentin Tarantino", Year.of(1992), 10),
        new Movie("Pan's Labyrinth", "Guillermo del Toro", Year.of(2006), 10),
        new Movie("The Deer Hunter", "Michael Cimino", Year.of(1978), 10),
        new Movie("Rocky", "John G. Avildsen", Year.of(1976), 10),
        new Movie("Memento", "Christopher Nolan", Year.of(2000), 10),
        new Movie("Die Hard", "John McTiernan", Year.of(1988), 10),
        new Movie("Ghostbusters", "Ivan Reitman", Year.of(1984), 10)
    ));

    InMemoryMovieRepository() {
        super(movies);
    }
}