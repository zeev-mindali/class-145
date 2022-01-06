package com.jb.class145;

import com.jb.class145.beans.Student;
import com.jb.class145.beans.Tav;
import com.jb.class145.beans.Zeev;
import com.jb.class145.interfaces.Teachable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication //ComponentScan(basePackges="com.jb")
@EnableAspectJAutoProxy
public class Class145Application {

    public static void main(String[] args) {
        SpringApplication.run(Class145Application.class, args);
    }

}
