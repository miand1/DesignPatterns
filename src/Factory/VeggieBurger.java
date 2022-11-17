package Factory;

public class VeggieBurger extends Hamburger {
    @Override
    void prepare() {
        System.out.println("Preparing no meat burger");
    }

    @Override
    void cook() {
        System.out.println("Cooking no meat burger");
    }
}
