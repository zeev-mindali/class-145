package Inheritance_Targil2;

public abstract class Employee {
    protected String name;
    protected int employeeID;
    protected float salary;
    protected float bouns = 0;

    protected Employee(String name, int employeeID, float salary) {
        setName(name);
        updateSalary(salary);
        setEmployeeID(employeeID);
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBouns() {
        return bouns;
    }

    public void setBouns(float bouns) {
        this.bouns = bouns;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getEmployeeID() {
        return employeeID;
    }

    protected void setEmployeeID(int employeeID) {
        //if number is lower then 1000 start at 1000;
        this.employeeID = employeeID < 1000 ? employeeID + 1000 : employeeID;
    }

    protected float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }

    protected abstract float calcBouns();

    protected void updateSalary(float newSalary) {
        this.salary = newSalary;
    }

    protected String showBanner() {
        return "" +
                ".______     ______    __    __  .__   __.      _______.\n" +
                "|   _  \\   /  __  \\  |  |  |  | |  \\ |  |     /       |\n" +
                "|  |_)  | |  |  |  | |  |  |  | |   \\|  |    |   (----`\n" +
                "|   _  <  |  |  |  | |  |  |  | |  . `  |     \\   \\    \n" +
                "|  |_)  | |  `--'  | |  `--'  | |  |\\   | .----)   |   \n" +
                "|______/   \\______/   \\______/  |__| \\__| |_______/    \n" +
                "                                                       ";
    }
}