package com.jb.spring_basic.clr;

import com.jb.spring_basic.beans.Cat;
import com.jb.spring_basic.beans.NormalCat;
import com.jb.spring_basic.repositories.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
class Test3 implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;
    @Autowired
    CatRepo catRepo;

    @Override
    public void run(String... args) throws Exception {
        //Component
        NormalCat normalCat1 = ctx.getBean(NormalCat.class);
        NormalCat normalCat2 = ctx.getBean(NormalCat.class);

        //CRUD -> READ
        //Entities
        Cat cat1 = catRepo.getById(1);
        Cat cat2 = catRepo.getById(2);

        System.out.println(cat1);
        System.out.println(cat2);

        normalCat1.setName(cat1.getName());
        normalCat1.setWeight(cat1.getWeight());
        normalCat1.setToyList(cat1.getToys());

        normalCat2.setName(cat2.getName());
        normalCat2.setWeight(cat2.getWeight());
        normalCat2.setToyList(cat2.getToys());

        System.out.println(normalCat1);
        System.out.println(normalCat2);
    }
}
