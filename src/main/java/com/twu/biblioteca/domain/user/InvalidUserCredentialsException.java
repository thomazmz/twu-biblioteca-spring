package com.twu.biblioteca.domain.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class InvalidUserCredentialsException extends Exception {

    public static final String WRONG_CREDENTIALS_MESSAGE = "Invalid user credentials";

    public InvalidUserCredentialsException() {
        super(WRONG_CREDENTIALS_MESSAGE);
    }
}