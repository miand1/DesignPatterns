package Composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements Employee{
    List<Employee> employees;

    public Department() {
        employees = new ArrayList<>();
    }

    @Override
    public void printDetails() {
        for(Employee employee:employees){
            employee.printDetails();
        }
    }
    public void addEmployee(Employee e){
        employees.add(e);
    }
    public void removeEmployee(Employee e){
        employees.remove(e);
    }
}
