package Factory;

public class Demo {
    public static void main(String[] args) {
        HamburgerFactory hamburgerFactory = new HamburgerFactory();
        HamburgerStore hamburgerStore = new HamburgerStore(hamburgerFactory);
        hamburgerStore.orderHamburger("cheese");
        hamburgerStore.orderHamburger("veggie");
    }


}
