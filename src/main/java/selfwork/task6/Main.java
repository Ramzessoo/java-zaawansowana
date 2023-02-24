package selfwork.task6;

public class Main {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(15, 15, 6, 6);
        System.out.println(movablePoint);
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movablePoint);

        Movable movableCircle = new MovablePoint(45, 50, 3, 9);
        System.out.println(movableCircle);
        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println(movableCircle);

    }
}
