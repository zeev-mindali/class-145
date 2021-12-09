package oop_exam_preperation.beans;

import java.util.Arrays;

public class Department {
    private DepNames name;
    private Manager manager;
    private Employee[] employee = new Employee[15];

    public Department(DepNames name, Manager manager, Employee[] employee) {
        this.name = name;
        this.manager = manager;
        this.employee = employee;
    }

    public Department(DepNames depName) {
        this.name=depName;
        this.manager = new Manager(new Employee());
        for (int counter=0;counter< employee.length;counter++){
            employee[counter] = new Employee();
        }
    }

    public DepNames getName() {
        return name;
    }

    public void setName(DepNames name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name=" + name +
                "\n, manager=" + manager +
                "\n, employee=" + Arrays.toString(employee) +
                '}';
    }
}
