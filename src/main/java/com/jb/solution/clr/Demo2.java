package com.jb.solution.clr;

import com.jb.solution.beans.Author;
import com.jb.solution.beans.AuthorLevel;
import com.jb.solution.beans.Books;
import com.jb.solution.utils.TablePrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Order(2)
@RequiredArgsConstructor
public class Demo2 implements CommandLineRunner {
    private final RestTemplate restTemplate;


    @Override
    public void run(String... args) throws Exception {
        String singleAuthor = "http://localhost:8080/Author/{id}";
        Map<String, String> params = new HashMap<>();
        params.put("id", "2");

        //get single object (author)  - GET
        Author author = restTemplate.getForObject(singleAuthor, Author.class, params);
        TablePrinter.print(author);
        //get the data as string (http)
        String kachaBaLi = restTemplate.getForObject(singleAuthor, String.class, params);
        System.out.println(kachaBaLi);
        System.out.println("----------------------------------------------------------------------------------------");

        String booksByYear = "http://localhost:8080/getBooksByYear/{start}/{end}";
        params = new HashMap<>();
        params.put("start", "2021");
        params.put("end", "2021");

        //get array of object and transfer them into collection (List)
        ResponseEntity<Books[]> booksJson = restTemplate.getForEntity(booksByYear, Books[].class, params);
        List<Books> myBooks = Arrays.asList(booksJson.getBody());
        TablePrinter.print(myBooks);

        System.out.println("------------------------------------");
        String deleteAuthor = "http://localhost:8080/deleteAuthor/{id}";
        params = new HashMap<>();
        params.put("id", "2");

        //delete an object
        //restTemplate.delete(deleteAuthor, params);
        //System.out.println("He was deleted , that little pos");

        //create a new object / update an object (post)

        //create an object
        Author barak = Author.builder()
                .name("Barak")
                .weight(64)
                .authorLevel(AuthorLevel.EXPERT)
                .book(Books.builder().year(2022).name("Spring boot advanced architecture").build())
                .book(Books.builder().year(2021).name("how to become a successful programmer").build())
                .build();

        //addURl
        String addURL = "http://localhost:8080/addAuthor";
        TablePrinter.print(barak);
        restTemplate.postForEntity(addURL,barak,Author.class);

    }
}
