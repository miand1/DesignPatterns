package Factory;

public class GreekPizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Preparing greek pizza");
    }

    @Override
    void cook() {
        System.out.println("Cooking in greek way");
    }
}
