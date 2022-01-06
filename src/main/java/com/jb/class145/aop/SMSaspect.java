package com.jb.class145.aop;

import com.jb.class145.services.SMSService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SMSaspect {
    @Autowired
    private SMSService smsService;
    @After("@annotation(SendSMS)")
    public void sendSmsadvice(){
        smsService.sendSMS("Tal iz in the house !!!!!!");
    }
}
