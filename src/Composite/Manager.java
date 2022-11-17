package Composite;

public class Manager implements Employee{
    String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void printDetails() {
        System.out.println(name +" is a Manager");
    }
}