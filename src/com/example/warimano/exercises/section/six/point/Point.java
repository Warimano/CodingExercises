package com.example.warimano.exercises.section.six.point;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
       return distance(0, 0);
    }

    public double distance(Point point) {
        return distance(point.getX(), point.getY());
    }

    public double distance(int x, int y) {
        int xA = this.x;
        int yA = this.y;
        return Math.sqrt((x - xA) * (x - xA) + (y - yA) * (y - yA));
    }
}
