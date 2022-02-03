package com.jb.spring_basic.controller;

import com.jb.spring_basic.auth.JWT;
import com.jb.spring_basic.beans.UserDetails;
import com.jb.spring_basic.exceptions.InvalidUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class UserAuth {
    @Autowired
    JWT jwt;

    @PostMapping("register")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void register(@RequestBody UserDetails user) {

    }

    @PostMapping("Login")
    //@ResponseStatus(value = HttpStatus.IM_USED)
    public ResponseEntity<?> login(@RequestBody UserDetails user) throws InvalidUserException {
        //JWTutil -> create a jwt token by the data that i will send you in swagger
        if (user.getUserName().equals("admin@admin.com") && user.getUserPass().equals("admin")) {
            return new ResponseEntity<>(jwt.generateToken(user), HttpStatus.IM_USED);
        } else {
            throw new InvalidUserException();
        }

    }

    //?????????
    @GetMapping("Logout/{token}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void logout(@PathVariable String token) {

    }
}
