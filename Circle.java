public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Circle Radius: " + radius);
    }
}