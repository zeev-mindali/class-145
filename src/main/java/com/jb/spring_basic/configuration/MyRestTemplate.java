package com.jb.spring_basic.configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class MyRestTemplate {

    /* תכנתים ברמת זבל הכי נמוכה שיש, יותר נמוך מהמיץ של הזבל בשקית אשפה
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    */

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder
                //set connection time out for 3 sec....
                .setConnectTimeout(Duration.ofMillis(3_000))
                //set read time out for 3 sec......
                .setReadTimeout(Duration.ofMillis(3_000))
                .build();
    }

}
