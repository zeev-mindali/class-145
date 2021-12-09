package oop_exam_preperation.beans;

public class CompanyStatistics {
    Department[] department = new Department[5];

    public CompanyStatistics() {
        department[0] = new Department(DepNames.Administration);
        department[1] = new Department(DepNames.Finance);
        department[2] = new Department(DepNames.Sales);
        department[3] = new Department(DepNames.Engineering);
        department[4] = new Department(DepNames.Marketing);
    }

    public Department[] getDepartment() {
        return department;
    }

    public void setDepartment(Department[] department) {
        this.department = department;
    }

    public double getCompanyAvgSalary(){
        double returnResult=0;
        for (Department item:department){
            returnResult+=item.getDepartmentAvgSalary();
        }
        return returnResult/department.length;
    }

    public void getCompanyAvgByDep(){
        for (Department item:department){
            System.out.println(item.getName()+" : "+item.getDepartmentAvgSalary());
        }
    }

    public void getCompanyAvgBonusByDep(){
        for (Department item:department){
            System.out.println(item.getName()+" : "+item.getDepartmentAvgBonus());
        }
    }
}
