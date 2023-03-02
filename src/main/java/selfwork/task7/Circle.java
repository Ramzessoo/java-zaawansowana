package selfwork.task7;

public class Circle implements GeometricObject {

    protected float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * (Math.PI * radius);
    }

    @Override
    public double getArea() {
        return Math.sqrt(Math.PI * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                '}';
    }
}
