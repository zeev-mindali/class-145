package oop_exam_preperation;

import oop_exam_preperation.beans.Employee;
import oop_exam_preperation.beans.Manager;

public class Tester {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //System.out.println(employee);

        Manager manager = new Manager(employee.getName(), employee.getAge(), employee.getSalary());
        System.out.println(manager);


    }
}
