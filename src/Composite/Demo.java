package Composite;

public class Demo {
    public static void main(String[] args) {
        Developer d1 = new Developer("Developer One");
        Developer d2 = new Developer("Developer Two");

        Department developersDepartment = new Department();
        developersDepartment.addEmployee(d1);
        developersDepartment.addEmployee(d2);

        Manager m1 = new Manager("Manager One");
        Manager m2 = new Manager("Manager Two");
        Department managersDepartment = new Department();
        managersDepartment.addEmployee(m1);
        managersDepartment.addEmployee(m2);

        Department companyDepartment = new Department();
        companyDepartment.addEmployee(developersDepartment);
        companyDepartment.addEmployee(managersDepartment);

        companyDepartment.printDetails();
    }
}
