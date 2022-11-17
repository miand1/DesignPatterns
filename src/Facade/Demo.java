package Facade;

public class Demo {
    public static void main(String[] args) {
        WashMachine washMachine = new WashMachine(new Washing(),new Rinsing(), new Spining());
        washMachine.start();
    }


}
