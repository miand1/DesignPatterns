package Factory;

public class GreekBurger extends Hamburger {
    @Override
    void prepare() {
        System.out.println("Preparing greek burger");
    }

    @Override
    void cook() {
        System.out.println("Cooking in greek way");
    }
}
