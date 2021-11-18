package class6_1811;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Employee[] employees = {
                new Programmer("Tomer", 1002, 17000f),
                new Programmer("Tal Rozner", 1003, 12000f),
                new Secretary("Nadav", 1005, 7000f, 500),
                new Secretary("Asi", 1004, 25000f, 500)
        };

        for (Employee item : employees) {
            System.out.println(item);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }

        System.out.println(employees[0].showBanner());
        for (Employee item : employees) {
            item.calcBouns();
        }

        //functional programming , will be learned in advanced java (functional programming)
        Arrays.stream(employees).filter(item -> item.salary > 20000).forEach(System.out::println);
    }
}
