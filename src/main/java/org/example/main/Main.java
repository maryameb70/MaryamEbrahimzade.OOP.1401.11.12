package org.example.main;

import org.example.shape.Circle;
import org.example.shape.Rectangle;
import org.example.shape.Shape;
import org.example.shape.Square;
import org.example.shape.InvalidInputException;
public class Main {
    public static void main(String[] args)throws InvalidInputException {
        //practice1
        System.out.println("---Initialization with default constructor---");
        Shape shape = new Shape() {
            @Override
            public Double getArea() {
                return null;
            }

            @Override
            public Double getPerimeter() {
                return null;
            }
        };
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled());
        System.out.println(shape);

        System.out.println("---Initialization with setter and default constructor---");
        // Shape shape1 = new Shape();
        shape.setColor("Blue");
        shape.setFilled(false);
        System.out.println(shape);

        System.out.println("---Initialization without default constructor---");
        Shape shape2 = new Shape("Black", true) {
            @Override
            public Double getArea() {
                return null;
            }
            @Override
            public Double getPerimeter() {
                return null;
            }
        };
        System.out.println(shape2);

        //practice2
        System.out.println("--------------------calculate area and perimeter --------------------");
        System.out.println("-----Circle/With default constructor-----");
        Circle circle = new Circle();
        System.out.println("Area:" + circle.getArea());
        System.out.println("perimeter:" + circle.getPerimeter());
        System.out.println("-----Circle/Without default constructor-----");
        Circle circle1 = new Circle(5.0);
        System.out.println("Area:" + circle1.getArea());
        System.out.println("perimeter:" + circle1.getPerimeter());
        System.out.println(circle1);
        System.out.println("-----Rectangle/With default constructor-----");
        Rectangle rectangle = new Rectangle();
        System.out.println("Area:" + rectangle.getArea());
        System.out.println("perimeter:" + rectangle.getPerimeter());
        System.out.println("-----Rectangle/Without default constructor-----");
        Rectangle rectangle1 = new Rectangle(6.0,8.0);
        System.out.println("Area:" + rectangle1.getArea());
        System.out.println("perimeter:" + rectangle1.getPerimeter());
        System.out.println(circle1);
        System.out.println("-----Square/With default constructor-----");
        Shape square = new Square();
        System.out.println("Area:" +square.getArea());
        System.out.println("perimeter:"+square.getPerimeter());
        System.out.println("-----Square/Without default constructor-----");
        Shape square1 = new Square(5.0d,5.0d);
        System.out.println("Area:"+square1.getArea());
        System.out.println("perimeter:"+square1.getPerimeter());



    }
}