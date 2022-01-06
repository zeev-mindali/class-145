package com.jb.class145.threads;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableAsync //for enabling async tasks
@EnableScheduling
public class DailyJob {
    @Async
    @Scheduled(fixedRate = 1000)
    public void sheldon(){
        System.out.println("Penny !!!!");
    }

    @Async
    //0 sec , 30 min , 1 hour, day, month, time zone
    @Scheduled(cron = "0 30 1 * * ?",zone = "Asia/Jerusalem")
    public void eraseCoupon(){
        System.out.println("erasing all expired coupon in the system , at 01:30am every day");
    }
}
