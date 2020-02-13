package com.twu.biblioteca.infrastructure.memory;

import com.twu.biblioteca.domain.user.User;
import com.twu.biblioteca.domain.user.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class InMemoryUserRepository extends InMemoryEntityRepository<User> implements UserRepository {

    public InMemoryUserRepository() {
        super();
        create(new User("000-0000", "admin", "admin@biblioteca.com", "12345", "9999-9999"));
    }

    public Optional<User> findByLibraryNumber(String libraryNumber) {
        return super.getAll()
                .stream().filter(user -> user.getLibraryNumber().equals(libraryNumber))
                .findFirst();
    }
}