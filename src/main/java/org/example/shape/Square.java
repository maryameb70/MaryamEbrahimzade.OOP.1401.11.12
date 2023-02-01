package org.example.shape;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    // TODO: One parameter can be taken from the client and sent to both the with and length the super class.
    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    private boolean statesEquality() {
        return super.getWidth() == super.getLength();
    }

    @Override
    public Double getArea() throws InvalidInputException {
        if (!statesEquality()) {
            throw new InvalidInputException();
        }
        return super.getArea();
    }

    @Override
    public Double getPerimeter() throws InvalidInputException {
        if (!statesEquality()) {
            throw new InvalidInputException();
        }
        return super.getPerimeter();
    }
}
