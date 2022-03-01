package com.jb.solution.repositories;

import com.jb.solution.beans.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
