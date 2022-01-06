package com.jb.class145.services;

import org.springframework.stereotype.Service;

@Service
public class NameChangedService {
    public void NameWasChanged(){
        System.out.println("BEWARE!!!! someone changed the cat name!!!!!!");
    }

    public void NameChangedAttempt(){
        System.out.println("YOU CANT TOUCH THIS , TI di di dam");
    }
}
