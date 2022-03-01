package com.jb.solution.service;

import com.jb.solution.beans.Author;
import com.jb.solution.beans.Books;
import com.jb.solution.exceptions.LibraryCustomException;

import java.util.List;

public interface LibraryService {
    void addAuthor(Author author);
    void deleteAuthorById(int id) throws LibraryCustomException;
    List<Books> getAllBooks();
    Author getAuthorById(int id) throws LibraryCustomException;
    List<Books> getAllBooksByYears(int startYear, int endYear) throws LibraryCustomException;
    int getAvgYear();
    int getAvgYearByAuthorId(int authorId) throws LibraryCustomException;
}
