package com.jb.spring_basic.exceptions;

public class BadSecurityRequestException extends Exception{
    public BadSecurityRequestException() {
        super ("Old method, dont use it !!!!! (Cyber security team) ");
    }

    public BadSecurityRequestException(String message) {
        super(message);
    }
}
