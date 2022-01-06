package com.jb.class145.clr;

import com.jb.class145.beans.Student;
import com.jb.class145.interfaces.Teachable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Component
@Order(1)
public class Demo1 implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        //CI - Constructor Injection
        //DI - Dependency Injection
        Student student1 = ctx.getBean(Student.class);
        //student1.setName("New Student");
        //student1.setId(0);
        System.out.println(student1);
        Student student2 = ctx.getBean(Student.class);
        //student2.setName("New Student");
        //student2.setId(0);
        System.out.println(student2);
		/*
		student2.setId(1);
		System.out.println("====================");
		System.out.println(student1);
		System.out.println(student2);
		*/

        String myFavorite = "bar";
        Teachable lecturer = ctx.getBean(Teachable.class);
        Teachable lecturer2 = ctx.getBean(myFavorite, Teachable.class);
        Teachable tav = ctx.getBean("tav", Teachable.class);
        lecturer.info();
        lecturer2.info();
    }
}
