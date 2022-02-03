package com.jb.spring_basic.controller;

import com.jb.spring_basic.beans.UserDetails;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class UserAuth {
    @PostMapping("register")
    @ResponseStatus(value = HttpStatus.CREATED)
    public void register(@RequestBody UserDetails user){

    }

    @PostMapping("Login")
    @ResponseStatus(value = HttpStatus.IM_USED)
    public void login(@RequestBody UserDetails user){

    }

    //?????????
    @GetMapping("Logout/{token}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void logout(@PathVariable String token){

    }
}
