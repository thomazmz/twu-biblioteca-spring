package com.twu.biblioteca.domain.user;

import com.twu.biblioteca.domain.EntityRepository;

import java.util.Optional;

public interface UserRepository extends EntityRepository<User> {

    Optional<User> findByLibraryNumber(String libraryNumber);
}