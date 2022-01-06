package com.jb.class145.clr;

import com.jb.class145.beans.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class Demo2 implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;


    @Override
    public void run(String... args) throws Exception {
        Cat cat = ctx.getBean(Cat.class);
        Cat chatchatul = ctx.getBean(Cat.class);

        System.out.println(cat);
        System.out.println(chatchatul);
    }
}
