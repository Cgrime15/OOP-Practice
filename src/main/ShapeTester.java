package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeTester {

    public static Shape makeRandomShape() {
        double randVal = getRandomNumber(0, 2);
        if (randVal == 1.0) {
            return new Square(getRandomNumber(4, 40));
        } else {
            return new Rectangle(getRandomNumber(4, 40), getRandomNumber(4, 40));
        }
    }

    private static double getRandomNumber(int start, int end) {
        Random r = new Random();
        return (double) r.nextInt(end - start) + start;
    }

    public static void main(String[] args) {
        Square s = new Square(5);

        Rectangle r = new Rectangle(4, 7);
        Rectangle r = new Rectangle(4);

        System.out.println("The length of the square is: " + s.getLength());
        System.out.println("The area of the square is: " + s.getArea());


        List<Shape> shapeList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            shapeList.add(makeRandomShape());
        }

        for (Shape shape : shapeList) {
            if (shape instanceof Square) {
                System.out.println("The area of this square is: " + shape.getArea());
            } else {
                System.out.println("The area of this rectangle is: " + shape.getArea());

            }
        }


    }

}
