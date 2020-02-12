package com.twu.biblioteca.application.user;

import com.twu.biblioteca.domain.user.InvalidUserCredentialsException;
import com.twu.biblioteca.domain.user.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody final UserCredentialsDTO userCredentials) throws InvalidUserCredentialsException {
        userService.login(userCredentials.getLibraryNumber(), userCredentials.getPassword());
        return new ResponseEntity(HttpStatus.OK);
    }
}