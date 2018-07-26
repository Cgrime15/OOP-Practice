package main;

public class Rectangle extends Shape {

    protected double length;
    protected double width;

    public Rectangle() {}

    public Rectangle(double length, double width) {
        this.length = Math.abs(length);
        this.width = Math.abs(width);
    }

    public Rectangle(double length) {
        this.length = length;
        this.width = length;
    }


    @Override
    public double getArea() {
        return length * width;
    }

    public double getAreaTimesX(int x) {
        return this.getArea() * x;
    }

    public double getAreaTimesX(float x) {
        return this.getArea() * x;
    }

}
