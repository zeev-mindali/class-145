package com.jb.solution.service;

import com.jb.solution.beans.Author;
import com.jb.solution.beans.Books;
import com.jb.solution.exceptions.LibraryCustomException;
import com.jb.solution.repositories.AuthorRepository;
import com.jb.solution.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LibraryServiceImpl implements LibraryService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void addAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void deleteAuthorById(int id) throws LibraryCustomException {
        if (!authorRepository.existsById(id)) {
            throw new LibraryCustomException("Author not found !!!");
        }
        authorRepository.deleteById(id);
    }

    @Override
    public List<Books> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Author getAuthorById(int id) throws LibraryCustomException {
        Optional<Author> author = authorRepository.findById(id);
        if (author.isEmpty()) {
            throw new LibraryCustomException("Author not found");
        }
        return author.get();
    }

    @Override
    public List<Books> getAllBooksByYears(int startYear, int endYear) throws LibraryCustomException {
        return bookRepository.findByYearBetween(startYear,endYear);
    }

    @Override
    public int getAvgYear() {
        return (int) getAllBooks().stream().mapToInt(Books::getYear).average().getAsDouble();
    }

    @Override
    public int getAvgYearByAuthorId(int authorId) throws LibraryCustomException {
        return (int) getAuthorById(authorId).getBooks().stream().mapToInt(Books::getYear).average().getAsDouble();
    }
}
