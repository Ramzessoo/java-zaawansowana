package selfwork.task3;

public class Circle extends Shape {

    private double radius;

    private Circle() {
        color = "unknown";
        isFilled = false;
        radius = 1;
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.sqrt(radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius = %f which is" +
                "subclass off %s", radius, super.toString());
    }
}
