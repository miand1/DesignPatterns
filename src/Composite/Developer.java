package Composite;

public class Developer implements Employee{
    String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void printDetails() {
        System.out.println(name +" is a developer");
    }
}
