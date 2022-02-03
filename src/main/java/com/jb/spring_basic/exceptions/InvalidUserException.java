package com.jb.spring_basic.exceptions;

public class InvalidUserException extends Exception{
    public InvalidUserException() {
        super("Invalid user name or password");
    }
}
