package com.jb.class145.clr;

import com.jb.class145.beans.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class Demo5 implements CommandLineRunner {
    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        /*
        Teacher zeev = ctx.getBean(Teacher.class);
        zeev.setName("Zeev");
        zeev.setPhone("052-404-3142");

        Teacher asi = ctx.getBean(Teacher.class);
        asi.setName("Asi");
        asi.setPhone("555-לך תחפש");

        System.out.println(zeev);
        System.out.println(asi);
        */

        Teacher zeev = ctx.getBean("teacherZeev",Teacher.class);
        Teacher asi = ctx.getBean("teacherAsi",Teacher.class);
        Teacher ran = ctx.getBean(Teacher.class);
        ran.setName("Ran");
        ran.setPhone("052-694-0056");
        System.out.println(zeev);
        System.out.println(asi);
        System.out.println(ran);

    }
}
