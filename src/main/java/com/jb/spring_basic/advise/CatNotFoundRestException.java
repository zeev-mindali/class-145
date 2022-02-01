package com.jb.spring_basic.advise;

import com.jb.spring_basic.exceptions.CatNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice //interception of exception
public class CatNotFoundRestException {
    //which exption class was fired
    @ExceptionHandler(value = {CatNotFoundException.class})
    //what we going to return in response (200 is ok, and it's not good)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ErrorDetail handleCatNotFound(Exception err){
        return new ErrorDetail("Delete error",err.getMessage());
    }
}
