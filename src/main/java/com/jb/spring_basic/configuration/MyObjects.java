package com.jb.spring_basic.configuration;

import com.jb.spring_basic.beans.NormalCat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyObjects {
    @Bean
    @Scope("prototype")
    public List<NormalCat> getCatList(){
        return new ArrayList<>();
    }
}
