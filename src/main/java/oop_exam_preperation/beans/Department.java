package oop_exam_preperation.beans;

public class Department {
    private DepNames name;
    private Manager manager;
    private Employee[] employee = new Employee[15];

    public Department(DepNames name, Manager manager, Employee[] employee) {
        this.name = name;
        this.manager = manager;
        this.employee = employee;
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
}
