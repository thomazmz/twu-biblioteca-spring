package com.twu.biblioteca.domain.user;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private static User currentUser;

    private UserRepository userRepository;

    public UserService(UserRepository inMemoryUserRepository) {
        this.userRepository = inMemoryUserRepository;
        currentUser = null;
    }

    public Optional<User> getCurrentUser() {
        return Optional.ofNullable(currentUser);
    }

    public User login(String libraryNumber, String password) throws InvalidUserCredentialsException {
        User user = userRepository.findByLibraryNumber(libraryNumber).orElseThrow(InvalidUserCredentialsException::new);
        if(!user.checkPassword(password))
            throw new InvalidUserCredentialsException();
        return currentUser = user;
    }
}