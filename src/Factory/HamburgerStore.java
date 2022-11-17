package Factory;

public class HamburgerStore {
    HamburgerFactory hamburgerFactory;

    public HamburgerStore(HamburgerFactory hamburgerFactory) {
        this.hamburgerFactory = hamburgerFactory;
    }
    Hamburger orderHamburger(String type){
        Hamburger hamburger;
        hamburger = hamburgerFactory.createHamburger(type);
        hamburger.prepare();
        hamburger.cook();
        return hamburger;
    }

}
