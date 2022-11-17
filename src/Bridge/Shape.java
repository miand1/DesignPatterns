package Bridge;

 abstract public class Shape {
    Colour colour1;
    Colour colour2;

    public Shape(Colour colour1, Colour colour2) {
        this.colour1 = colour1;
        this.colour2 = colour2;
    }
    abstract public void paint();
}
