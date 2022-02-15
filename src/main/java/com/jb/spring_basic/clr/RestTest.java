package com.jb.spring_basic.clr;

import com.jb.spring_basic.beans.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Component
public class RestTest implements CommandLineRunner {
    @Autowired
    RestTemplate restTemplate;

    //define our URL location (string)
    private final String URL = "http://localhost:8080/cats/cats";
    private final String ZEEV_CAR_URL = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q=1113334";
    private final String SINGLE_CAT = "http://localhost:8080/cats/findById/1";
    private final String SINGLE_CHATUL = "http://localhost:8080/cats/findById/{id}";
    private final String ADD_CAT = "http://localhost:8080/cats/newCat";
    @Override
    public void run(String... args) throws Exception {
        /*
        // get String from url that consumes rest controller
        String result = restTemplate.getForObject(URL,String.class);
        System.out.println(result);
         */

        //ResponseEntity - for getting the response from the server with all the data that includewd
        //we need to use [] because json will return in []
        //get list of cats.....
        //ResponseEntity<Cat[]> getAllCats = restTemplate.getForEntity(URL,Cat[].class);
        //List<Cat> allCats = Arrays.asList(getAllCats.getBody());
        //System.out.println(allCats.get(1));

        /*
        Cat singleCat = restTemplate.getForObject(SINGLE_CAT,Cat.class);
        System.out.println(singleCat);
        */
        //getCat(2);

        addCat();
        getAllCat();


    }

    private void getAllCat(){
        //ResponseEntity - for getting the response from the server with all the data that includewd
        //we need to use [] because json will return in []
        //get list of cats.....
        ResponseEntity<Cat[]> getAllCats = restTemplate.getForEntity(URL,Cat[].class);
        List<Cat> allCats = Arrays.asList(getAllCats.getBody());
        allCats.forEach(System.out::println);
    }
    private void addCat(){
        Cat tal = Cat.builder()
                .name("Tal Tea")
                .weight(45)
                .build();

        restTemplate.postForEntity(ADD_CAT,tal,Cat.class);
    }
    private void getCat(int id){
        Map<String,String> param = new HashMap<>();
        param.put("id",String.valueOf(id));
        Cat pagosh = restTemplate.getForObject(SINGLE_CHATUL,Cat.class,param);
        System.out.println(pagosh);
    }
}
