package com.jb.spring_basic.clr;

import com.jb.spring_basic.beans.Cat;
import com.jb.spring_basic.beans.Toy;
import com.jb.spring_basic.repositories.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Component
@Order(1)
public class Test1 implements CommandLineRunner {
    @Autowired
    CatRepo catRepo;

    @Override
    public void run(String... args) throws Exception {
        Cat cat1 = Cat.builder()
                .name("Bumper")
                .weight(4.5f)
                .toy(Toy.builder().name("Ball").build())
                .toy(Toy.builder().name("scratch board").build())
                .build();

        Cat cat2 = Cat.builder()
                .name("Pagosh")
                .weight(3.2f)
                .toy(Toy.builder().name("Ball").build())
                .build();

        //CRUD
//        List<Cat> catList = new ArrayList<>();
//        catList.add(cat1);
//        catList.add(cat2);
        catRepo.saveAll(Arrays.asList(cat1,cat2));
    }
}
