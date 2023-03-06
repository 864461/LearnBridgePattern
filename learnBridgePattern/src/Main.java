//decouple an abstraction from its implementation
public class Main {
    public static void main(String[] args) {

        Colour red = new Red();
        Shape circle = new Circle(red);
        circle.draw(); // Outputs: "Drawing a circle with red color."
    }
}