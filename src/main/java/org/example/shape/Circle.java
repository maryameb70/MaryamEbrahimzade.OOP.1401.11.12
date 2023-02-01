package org.example.shape;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0d;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public Double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
    @Override
    public Double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius=" + this.radius + ", which is a subclass of " + super.toString();

    }
}
