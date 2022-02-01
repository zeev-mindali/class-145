package com.jb.spring_basic.exceptions;

public class CatNotFoundException extends Exception{
    public CatNotFoundException() {
        super("the cat is not on the system (road kill?)");
    }

    public CatNotFoundException(String message) {
        super(message);
    }
}
