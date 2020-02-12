package com.twu.biblioteca.domain.user;

import com.twu.biblioteca.domain.Entity;

public class User extends Entity {

    private String libraryNumber;

    private String name;

    private String email;

    private String password;

    private String phoneNumber;

    public User(String libraryNumber, String name, String email, String password, String phoneNumber) {
        super();
        this.libraryNumber = libraryNumber;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public Boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}