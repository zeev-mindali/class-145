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

//@Component
public class Test4 implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;
    @Autowired
    CatRepo catRepo;
    private Object List;
    @Autowired
    private List<NormalCat> cats;
    @Autowired
    private NormalCat normalCat;

    @Override
    public void run(String... args) throws Exception {
        List<Cat> dbCats = catRepo.findAll();
        //List<NormalCat> cats = ctx.getBean(List<NormalCat>);
        for (Cat cat : dbCats) {
            normalCat.addCat(cat);
            cats.add(normalCat);
        }
        cats.forEach(System.out::println);
    }
}
