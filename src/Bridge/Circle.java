package Bridge;

public class Circle extends Shape{

    public Circle(Colour colour1, Colour colour2) {
        super(colour1, colour2);
    }

    @Override
    public void paint() {
        System.out.println("Painting Circle\n");
        colour1.colourIn();
        colour2.colourIn();
    }
}
