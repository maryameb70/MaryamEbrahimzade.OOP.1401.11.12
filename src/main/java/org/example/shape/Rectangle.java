package org.example.shape;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1.0d;
        this.length = 1.0d;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public Double getArea()  throws InvalidInputException{
        return this.width == this.length ? this.width * this.width : this.width * this.length;
    }

    @Override
    public Double getPerimeter()  throws InvalidInputException{
        return this.width == this.length ? 4 * this.width : 2 * (this.width + this.length);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + this.width + "and with length" + this.length + ", which is a subclass of " + super.toString();
    }


}
