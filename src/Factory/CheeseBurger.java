package Factory;

public class CheeseBurger extends Hamburger {
    @Override
    void prepare() {
        System.out.println("Preparing with cheese");
    }

    @Override
    void cook() {
        System.out.println("Cooking Cheese burger");
    }
}
