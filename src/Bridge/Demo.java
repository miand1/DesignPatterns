package Bridge;

public class Demo {
    public static void main(String[] args) {
        Shape circleShape = new Circle(new RedColour(),new BlueColour());
        circleShape.paint();

        Shape squareShape = new Square(new BlueColour(),new RedColour());
        squareShape.paint();
    }
}
