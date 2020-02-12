package com.twu.biblioteca.application.user;

public class UserCredentialsDTO {

    private String libraryNumber;

    private String password;

    public UserCredentialsDTO(String libraryNumber, String password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }
}
