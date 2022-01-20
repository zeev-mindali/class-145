package com.jb.spring_basic.clr;

import com.jb.spring_basic.beans.Cat;
import com.jb.spring_basic.beans.NormalCat;
import com.jb.spring_basic.configuration.MyObjects;
import com.jb.spring_basic.repositories.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class Test4 implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;
    @Autowired
    CatRepo catRepo;
    @Autowired
    List<NormalCat> cats;
    @Autowired
    NormalCat normalCat;

    @Override
    public void run(String... args) throws Exception {
        //POJO
        //NormalCat normalCat = new NormalCat();
        //List<NormalCat> cats = new ArrayList<>(); //NormalCat->Component
        //NormalCat normalCat = ctx.getBean(NormalCat.class);
        List<Cat> dbCats = catRepo.findAll();  //Cat->Entity
        for (Cat cat : dbCats) {
            normalCat.addCat(cat);
            cats.add(normalCat);
        }
        cats.add(ctx.getBean("myDefaultCat",NormalCat.class));
        cats.forEach(System.out::println);
    }
}
