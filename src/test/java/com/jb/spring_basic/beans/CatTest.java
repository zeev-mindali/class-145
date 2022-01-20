package com.jb.spring_basic.beans;

import com.jb.spring_basic.repositories.CatRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Autowired
    CatRepo catRepo;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getId() {
        Cat cat = catRepo.findAll().get(0);
        assertNotEquals(0,cat.getId());
    }

    @Test
    void getName() {
    }

    @Test
    void getWeight() {
    }

    @Test
    void getToys() {
    }
}