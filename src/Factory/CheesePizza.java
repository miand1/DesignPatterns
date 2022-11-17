package Factory;

public class CheesePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("Preparing with cheese");
    }

    @Override
    void cook() {
        System.out.println("Cooking Cheese Pizza");
    }
}
