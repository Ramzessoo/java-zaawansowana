package selfwork.task3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("blue", true, 20),
                new Rectangle("yellow", true, 20, 30),
                new Square("green", false, 45)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }

    }
}
