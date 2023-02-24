package selfwork.task6;

import selfwork.task3.Circle;

public class MovableCircle implements Movable{

    private double radius;
    MovablePoint movablePoint;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {

        this.radius = radius;
        this.movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public void moveRight() {
        movablePoint.moveRight();
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", movablePoint=" + movablePoint +
                '}';
    }
}
