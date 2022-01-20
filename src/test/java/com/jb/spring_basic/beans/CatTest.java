package com.jb.spring_basic.beans;

import com.jb.spring_basic.repositories.CatRepo;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Service
class CatTest {
    @Autowired
    CatRepo catRepo;

    @Autowired
    static ApplicationContext ctx;

    @BeforeAll
    static void beforeAll() {
        System.out.println("first initialization");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("distraction");
        //close connection
    }

    @BeforeEach
        //junit 3-> setup , junit 4->before
    void setUp() {
        System.out.println("initialization before method");
    }

    @AfterEach
        //junit 3->tearDown , junit 4->after
    void tearDown() {
        System.out.println("initialization after method");
    }

    @Test
    void getId() {
        //todo: how we can autowired in jUnit5
        Cat cat = catRepo.findAll().get(0);
        assertNotEquals(0, cat.getId());
    }

    @Test
    void getName() {
        //todo: how we can autowired in jUnit5
        Cat cat = catRepo.findAll().get(0);
        assertNotNull(cat.getName());
    }

    @Test
    void getWeight() {
        assertEquals(1, 1);
    }

    @Test
    void getToys() {
        //todo: how we can autowired in jUnit5
        Cat cat = catRepo.findAll().get(0);
        assertNotNull(cat.getToys());
    }

    @Test
    void getAllCatsToys(){
        //todo: how we can autowired in jUnit5
        List<Cat> cats = catRepo.findAll();
        for(Cat cat:cats){
            assertNotNull(cat.getToys());
        }
    }
}