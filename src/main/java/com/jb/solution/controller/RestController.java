package com.jb.solution.controller;

import com.jb.solution.beans.Author;
import com.jb.solution.exceptions.LibraryCustomException;
import com.jb.solution.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class RestController {
    private final LibraryService libraryService;

    @PostMapping("/addAuthor")
    public ResponseEntity<?> addAuthor(@RequestBody Author author) {
        libraryService.addAuthor(author);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteAuthor/{id}")
    public ResponseEntity<?> deleteAuthorById(@PathVariable int id) throws LibraryCustomException {
        libraryService.deleteAuthorById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/allBooks")
    public ResponseEntity<?> getAllBooks(){
        return new ResponseEntity<>(libraryService.getAllBooks(),HttpStatus.OK);
    }

    @GetMapping("/Author/{id}")
    public ResponseEntity<?> getAuthorById(@PathVariable int id) throws LibraryCustomException {
        return new ResponseEntity<>(libraryService.getAuthorById(id),HttpStatus.OK);
    }

    @GetMapping("/getBooksByYear/{start}/{end}")
    public ResponseEntity<?> getAllBooksByYears(@PathVariable int start, @PathVariable int end) throws LibraryCustomException {
        return new ResponseEntity<>(libraryService.getAllBooksByYears(start,end),HttpStatus.OK);
    }

    @GetMapping("/avgYear")
    public ResponseEntity<?> getAvgYear(){
        return new ResponseEntity<>(libraryService.getAvgYear(),HttpStatus.OK);
    }

    @GetMapping("/getAvgYearByAuthorId")
    public ResponseEntity<?> getAvgYearByAuthorId(int authorId) throws LibraryCustomException {
        return new ResponseEntity<>(libraryService.getAvgYearByAuthorId(authorId),HttpStatus.OK);
    }

}
