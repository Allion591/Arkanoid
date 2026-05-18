package main.java.ru.baseObject;

import main.java.ru.canvas.Canvas;

public abstract class BaseObject {
    protected double x;
    protected double y;
    protected double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean intersects(BaseObject object) {
        double ac = Math.abs(object.getY() - getY());
        double cb = Math.abs(object.getX() - getX());
        return Math.hypot(ac, cb) < radius + object.getRadius();
    }

    public abstract void draw(Canvas canvas);

    public abstract void move();
}
