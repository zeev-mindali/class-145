package com.jb.class145.clr;

import com.jb.class145.beans.MyNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class Demo4 implements CommandLineRunner {

    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        MyNumber number = ctx.getBean(MyNumber.class);
        System.out.println(number);
    }
}
