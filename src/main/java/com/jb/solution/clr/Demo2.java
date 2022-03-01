package com.jb.solution.clr;

import com.jb.solution.beans.Author;
import com.jb.solution.beans.Books;
import com.jb.solution.utils.TablePrinter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
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


        Map<String,String> params = new HashMap<>();
        params.put("id","1");
        Author author = restTemplate.getForObject(singleAuthor,Author.class,params);
        TablePrinter.print(author);
        String kachaBaLi = restTemplate.getForObject(singleAuthor,String.class,params);
        System.out.println(kachaBaLi);
        System.out.println("----------------------------------------------------------------------------------------");
        String booksByYear = "http://localhost:8080/getBooksByYear/{start}/{end}";
        params = new HashMap<>();
        params.put("start","2021");
        params.put("end","2021");
        ResponseEntity<Books[]> booksJson = restTemplate.getForEntity(booksByYear,Books[].class,params);
        List<Books> myBooks = Arrays.asList(booksJson.getBody());
        TablePrinter.print(myBooks);
    }
}
