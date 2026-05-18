package main.java.ru.ball;

import main.java.ru.baseObject.BaseObject;
import main.java.ru.canvas.Canvas;

public class Ball extends BaseObject {
    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen;

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.direction = direction;
        this.speed = speed;
        isFrozen = true;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'O');
    }

    @Override
    public void move() {
        if (isFrozen == false) {
            x = x + dx;
            y = y + dy;
        }
    }

    public void start() {
        isFrozen = false;
    }

    public void setDirection(double direction) {
        this.direction = direction;
        double angle = Math.toRadians(direction);
        dx = Math.cos(angle) * speed;
        dy = Math.sin(angle) * speed;
    }

    public void checkRebound(int minX, int maxX, int minY, int maxY) {

    }
}
