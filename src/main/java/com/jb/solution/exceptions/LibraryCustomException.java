package com.jb.solution.exceptions;

public class LibraryCustomException  extends Exception{
    public LibraryCustomException() {
        super("General exception");
    }

    public LibraryCustomException(String message) {
        super(message);
    }
}
