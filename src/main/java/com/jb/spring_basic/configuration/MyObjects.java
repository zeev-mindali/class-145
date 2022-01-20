package com.jb.spring_basic.configuration;

import com.jb.spring_basic.beans.NormalCat;
import com.jb.spring_basic.beans.Toy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyObjects {
    @Autowired
    ApplicationContext ctx;

    @Autowired
    List<Toy> toys;

    @Bean
    @Scope("prototype")
    public NormalCat myDefaultCat(){
        //return new NormalCat(0,"default cat",0,null);
        NormalCat normalCat = ctx.getBean(NormalCat.class);
        normalCat.setName("default cat");
        normalCat.setId(0);
        toys.add(ctx.getBean("toyPresent1",Toy.class));
        toys.add(ctx.getBean("toyPresent2",Toy.class));
        normalCat.setToyList(toys);

        return normalCat;
    }

    @Bean
    @Scope("prototype")
    public Toy toyPresent1(){
        Toy toy = ctx.getBean(Toy.class);
        toy.setId(0);
        toy.setName("Small ball");
        return toy;
    }

    @Bean
    @Scope("prototype")
    public Toy toyPresent2(){
        Toy toy = ctx.getBean(Toy.class);
        toy.setId(0);
        toy.setName("Chowing toy");
        return toy;
    }
}
