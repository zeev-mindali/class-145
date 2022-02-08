package com.jb.spring_basic.controller;

import com.jb.spring_basic.auth.JWT;
import com.jb.spring_basic.beans.Cat;
import com.jb.spring_basic.beans.UserDetails;
import com.jb.spring_basic.exceptions.BadSecurityRequestException;
import com.jb.spring_basic.exceptions.CatNotFoundException;
import com.jb.spring_basic.exceptions.InvalidUserException;
import com.jb.spring_basic.facade.CatFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cats")  //rest->http://localhost:8080/cats
public class CatController {
    @Autowired
    CatFacade catFacade;

    @Autowired
    JWT jwt;

    @GetMapping("all") //rest->http://localhost:8080/cats/all
    public ResponseEntity<?> getAllCats(@RequestHeader(name = "Authorization") String token) throws InvalidUserException {
        try {
            UserDetails user = new UserDetails("admin@admin.com", "12345", "Admin");
            if (jwt.validateToken(token, user)) {
                return new ResponseEntity<>(catFacade.getCats(), HttpStatus.OK);
            } else {
                throw new InvalidUserException();
            }
        } catch (Exception err) {
            throw new InvalidUserException();
        }
    }

    @GetMapping("cats") //rest->http://localhost:8080/cats/all
    public ResponseEntity<?> myCats() throws InvalidUserException {
        return new ResponseEntity<>(catFacade.getCats(), HttpStatus.OK);
    }

    //do not use it, bad bad bad code......
    @GetMapping("addGet/{name}/{weight}") //http://localhost:8080/cats/addGet/Itzik/72.5
    @ResponseStatus(HttpStatus.CREATED)
    public void addGetCat(@PathVariable String name, @PathVariable float weight) throws BadSecurityRequestException {
        throw new BadSecurityRequestException();
        //catFacade.addCat(new Cat(name, weight, null));
    }

    //find a cat by id
    @GetMapping("findById/{id}")
    public ResponseEntity<?> findCatById(@PathVariable int id) {
        return new ResponseEntity<>(catFacade.findCatById(id), HttpStatus.OK);
    }

    @PostMapping("newCat")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void addCat(@RequestBody Cat cat) {
        catFacade.addCat(new Cat(cat.getName(), cat.getWeight(), null));
    }

    @DeleteMapping("deleteCat/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteCat(@PathVariable int id) throws CatNotFoundException {
        catFacade.deleteCat(id);
    }

    @PutMapping("update")
    @ResponseStatus(HttpStatus.OK)
    public void updateCat(@RequestBody Cat cat) {
        catFacade.updateCat(cat);
    }


}
