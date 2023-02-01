package org.example.shape;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(Double width) {
        super(width, width);
    }

    public Square(String color, Boolean filled, Double width, Double length) {
        super(color, filled, width, length);
    }

    @Override
    public Double getArea() {
        return super.getArea();
    }

    @Override
    public Double getPerimeter()  {
        return super.getPerimeter();
    }
}
