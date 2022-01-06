package com.jb.class145.clr;

import com.jb.class145.beans.Cat;
import com.jb.class145.beans.Chip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Demo3 implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);
        cat.setChip(ctx.getBean(Chip.class));
        System.out.println(cat);
        System.out.println("\n\n");
        cat.setName("Hong");
        System.out.println(cat);
    }
}
