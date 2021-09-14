package com.finnal;

public class Final_Circle {
    public static void main(String[] args) {
        new Circle(10).area();
    }

}
class Circle{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    private final double PI = 3.14;
    public void area(){
        System.out.println("面积："+ PI*radius*radius);
    }
}
