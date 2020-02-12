package com.twu.biblioteca.domain.movie;

import com.twu.biblioteca.domain.borrowableItem.BorrowableItemRepository;
import org.springframework.stereotype.Component;

@Component
public class MovieRepository extends BorrowableItemRepository<Movie> {

}