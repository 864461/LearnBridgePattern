public class Circle implements Shape {
    private Colour color;

    public Circle(Colour color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a circle with " + color.getColor() + " color.");
    }
}
