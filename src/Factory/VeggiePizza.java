package Factory;

public class VeggiePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Preparing no meat pizza");
    }

    @Override
    void cook() {
        System.out.println("Cooking no meat pizza");
    }
}
