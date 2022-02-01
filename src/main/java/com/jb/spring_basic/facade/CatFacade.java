package com.jb.spring_basic.facade;

import com.jb.spring_basic.beans.Cat;
import com.jb.spring_basic.repositories.CatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatFacade {
    @Autowired
    CatRepo catRepo;

    public List<Cat> getCats(){
        return catRepo.findAll();
    }

    public void addCat(Cat cat){
        catRepo.save(cat);
    }

    public void deleteCat(int id) {
        catRepo.deleteById(id);
    }

    public void updateCat(Cat cat) {
        catRepo.save(cat);
    }

    public Optional<Cat> findCatById(int id) {
        return catRepo.findById(id);
    }
}
