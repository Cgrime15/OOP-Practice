package main;

public class Square extends Rectangle {

    public Square(double length) {
        this.length = Math.abs(length);
        this.width = Math.abs(length);
    }

    public void setLength(double length) {
        this.length = Math.abs(length);
    }

    public double getLength() {
        return this.length;
    }
}
