package com.jb.spring_basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication   //component scan, configuration scan...
@EnableAspectJAutoProxy  //AOP - Aspect Object Programming
public class SpringBasicApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBasicApplication.class, args);
	}
}
