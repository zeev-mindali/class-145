package com.jb.class145.repositories;

import com.jb.class145.beans.Companies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Companies,Integer> {
    //DAO - no need
    //DB DAO

}
