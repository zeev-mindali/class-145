package com.jb.class145.services;

import org.springframework.stereotype.Service;

@Service
public class SMSService {
    public void sendSMS(String message){
        System.out.println("SPAM SPAM SPAM: "+message);
    }
}
