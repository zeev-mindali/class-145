package com.jb.class145.aop;

import com.jb.class145.services.NameChangedService;
import com.jb.class145.services.SMSService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NameAspect {
    @Autowired
    NameChangedService nameChangedService;
    @Autowired
    SMSService smsService;
    @Before("@annotation(NameChanged)")
    public void sendAlert(){
        //nameChangedService.NameWasChanged();
        //smsService.sendSMS("ALON !!!! WHERE ARE YOU ?!?!?!?");
        nameChangedService.NameChangedAttempt();
    }
}
