package Factory;

public class HamburgerFactory {

    public Hamburger createHamburger(String type){
        Hamburger hamburger = null;
        if(type.equals("cheese")){
            hamburger = new CheeseBurger();
        }
        else if(type.equals("greek")){
            hamburger = new GreekBurger();
        }
        else if(type.equals("veggie")){
            hamburger =  new VeggieBurger();
        }
        return hamburger;
    }
}
