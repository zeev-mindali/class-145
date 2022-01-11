package com.jb.class145.clr;

import com.jb.class145.beans.Teacher;
import com.jb.class145.repositories.TecherRepo;
import com.jb.class145.util.TablePrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Demo_DB2 implements CommandLineRunner {
    @Autowired
    TecherRepo techerRepo;

    @Override
    public void run(String... args) throws Exception {
        /*
        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(new Teacher(0,"Tal Kipa","052-4327845",35_000,31));
        teachersList.add(new Teacher(0,"Anna","054-5487844",50_000,21));
        teachersList.add(new Teacher(0,"Tal kita","050-6387453",8_500,31));
        teachersList.add(new Teacher(0,"Barak","054-87489345",4_500,26));
        teachersList.add(new Teacher(0,"Ran","050-1234567",21_000,27));
        teachersList.add(new Teacher(0,"Tal bait","050-875843",65_000,18));
        teachersList.add(new Teacher(0,"Asi","054-2348783",1_000,27));

        techerRepo.saveAll(teachersList);
         */

        //TablePrinter.print(techerRepo.findAll());
        /*
        TablePrinter.print(techerRepo.findBySalaryLessThan(10_000));
        TablePrinter.print(techerRepo.findBySalaryGreaterThan(40_000));
        TablePrinter.print(techerRepo.findByNameContaining("Tal"));
        TablePrinter.print(techerRepo.findByNameContainingAndSalaryGreaterThan("Tal",30_000));
        TablePrinter.print(techerRepo.findByAgeBetween(20,30));
        */
        //Teacher barak = techerRepo.getById(4);
        //System.out.println("Number #"+barak.getId()+" "+barak);

        //TablePrinter.print("Total:"+techerRepo.findByNameContaining("Tal").size());

        System.out.println("Total: "+techerRepo.findByNameContaining("Tal"));

    }
}
