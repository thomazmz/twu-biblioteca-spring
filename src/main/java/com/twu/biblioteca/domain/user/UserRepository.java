package com.twu.biblioteca.domain.user;

import com.twu.biblioteca.domain.EntityRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepository extends EntityRepository<User> {

    public UserRepository() {
        super();
        create(new User("000-0000", "admin", "admin@biblioteca.com", "12345", "9999-9999"));
    }

    public Optional<User> findByLibraryNumber(String libraryNumber) {
        return super.getAll()
                .stream().filter(user -> user.getLibraryNumber().equals(libraryNumber))
                .findFirst();
    }
}