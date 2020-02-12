package com.twu.biblioteca.application;

import com.twu.biblioteca.domain.movie.Movie;
import com.twu.biblioteca.domain.movie.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("movies")
public class MovieController {

    public MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<?> createMovie(@RequestBody final Movie movie) {
        return ResponseEntity.ok(movieService.create(movie));
    }

    @GetMapping
    public ResponseEntity<?> getMovies() {
        return ResponseEntity.ok(movieService.getAll());
    }

    @GetMapping("/availables")
    public ResponseEntity<?> getAvailableMovies() {
        return ResponseEntity.ok(movieService.getAvailables());
    }
}