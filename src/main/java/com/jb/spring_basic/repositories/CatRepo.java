package com.jb.spring_basic.repositories;

import com.jb.spring_basic.beans.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepo extends JpaRepository<Cat,Integer> {
}
