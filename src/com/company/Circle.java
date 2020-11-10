package com.company;

public class Circle {
    private double radius;
    private final double PI = Math.acos(-1);

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI*getRadius()*getRadius();
    }

    public double getPerimeter(){
        return PI*2+getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
