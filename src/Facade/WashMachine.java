package Facade;

public class WashMachine {
    Washing washing;
    Rinsing rinsing;
    Spining spining;

    public WashMachine(Washing washing, Rinsing rinsing, Spining spining) {
        this.washing = washing;
        this.rinsing = rinsing;
        this.spining = spining;
    }

    public void start(){
        washing.wash();
        rinsing.rinse();
        spining.spin();
    }
}
