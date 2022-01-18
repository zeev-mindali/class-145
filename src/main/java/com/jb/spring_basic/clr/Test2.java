package com.jb.spring_basic.clr;

import com.jb.spring_basic.beans.NormalCat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(2)
public class Test2 implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        NormalCat cat1 = ctx.getBean(NormalCat.class);
        cat1.setId(1);
        cat1.setName("Barak");
        cat1.setWeight(72.45f);

        NormalCat cat2 = ctx.getBean(NormalCat.class);
        cat2.setId(2);
        cat2.setName("Matan");
        cat2.setWeight(52.45f);

        System.out.println(cat1);
        System.out.println(cat2);

    }
}
