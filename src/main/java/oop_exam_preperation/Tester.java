package oop_exam_preperation;

import oop_exam_preperation.beans.*;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //System.out.println(employee);

        Manager manager = new Manager(employee.getName(), employee.getAge(), employee.getSalary());
        //System.out.println(manager);

        //Department department = new Department(DepNames.Administration);
        //System.out.println(department);

        CompanyStatistics company = new CompanyStatistics();
        Department[] dep = company.getDepartment();
        for (int counter=0;counter<dep.length;counter++){
            System.out.println(dep[counter]);
        }

    }
}
