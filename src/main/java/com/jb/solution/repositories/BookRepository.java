package com.jb.solution.repositories;

import com.jb.solution.beans.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Books,Integer> {
    List<Books> findByYearBetween(int startYear, int endYear);
}
