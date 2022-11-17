package Factory;

public class Demo {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderHamburger("cheese");
        pizzaStore.orderHamburger("veggie");
    }


}
