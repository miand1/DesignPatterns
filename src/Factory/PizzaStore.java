package Factory;

public class PizzaStore {
    PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }
    Pizza orderHamburger(String type){
        Pizza pizza;
        pizza = pizzaFactory.createHamburger(type);
        pizza.prepare();
        pizza.cook();
        return pizza;
    }

}
