package com.jb.class145.clr;

import com.jb.class145.beans.Companies;
import com.jb.class145.repositories.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class Demo_DB implements CommandLineRunner {
    @Autowired
    private CompanyRepo companyRepo;

    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DataBase Demo.......");
        /*
        Companies ranAndSons = Companies.builder()
                .name("asi and luba")
                .email("miskan_fundation@gmail.com")
                .password("13131313")
                .build();
        */
        //companyRepo.save(ranAndSons);

        //companyRepo.deleteById(2);

        /*
        List<Companies> companies = new ArrayList<>();
        companies.add(new Companies("asi and luba","asi@hi.bye","12345"));
        companies.add(new Companies("ran the king","ran@hi.bye","1234534"));
        companies.add(new Companies("nir the smart one","nir@smart.co.il","867876"));

        companyRepo.saveAll(companies);
        */
        /*
        List<Companies> all = companyRepo.findAll();
        for(Companies item:all){
            System.out.println(item);
        }
        System.out.println("\nSingle company\n====================");
        Companies company = companyRepo.findAll().get(0);
        System.out.println(company);

        company.setPassword("Luba!!!");
        companyRepo.saveAndFlush(company);
        System.out.println(companyRepo.findAll().get(0));
        */
    }
}
