package com.jb.class145.repositories;

import com.jb.class145.beans.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TecherRepo extends JpaRepository<Teacher,Integer> {
    List<Teacher> findBySalaryLessThan(int salary);
    List<Teacher> findBySalaryGreaterThan(int salary);
    List<Teacher> findByNameContaining(String name);
    //int findByNameContaining(String name);
    List<Teacher> findByNameContainingAndSalaryGreaterThan(String name, int salary);
    List<Teacher> findByAgeBetween(int minAge, int maxAge);
}
