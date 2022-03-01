package com.jb.solution.clr;

import com.jb.solution.beans.Author;
import com.jb.solution.beans.Books;
import com.jb.solution.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(1)
@RequiredArgsConstructor
public class Demo1 implements CommandLineRunner {

    final AuthorRepository authorRepository;

    @Override
    public void run(String... args) throws Exception {
        Author author1 = Author.builder()
                .name("Anna").weight(43)
                .book(Books.builder().name("How to be rich").year(2022).build())
                .book(Books.builder().name("The Monk who sold his ferrari").year(2010).build())
                .build();

        Author author2 = Author.builder()
                .name("Simon Levayev").weight(73)
                .book(Books.builder().name("עקיצה ב 60 שניות").year(2021).build())
                .book(Books.builder().name("Be lev levayev").year(2021).build())
                .build();

        authorRepository.saveAll(List.of(author1,author2));
    }
}
