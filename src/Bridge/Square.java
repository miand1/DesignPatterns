package Bridge;

public class Square extends Shape{
    public Square(Colour colour1, Colour colour2) {
        super(colour1, colour2);
    }

    @Override
    public void paint() {
        System.out.println("Painting Square\n");
        colour1.colourIn();
        colour2.colourIn();
    }
}
