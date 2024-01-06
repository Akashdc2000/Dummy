package com.oops.polymorphism.runtime;


public class PolymorphismDemo {

    public static void main(String[] args) {
        System.out.println("Polymorphism Demo");

        Circle circle = new Circle();
        circle.radius = 5.0F;
        System.out.println("Area of Circle : "+ circle.area());
        System.out.println("Perimeter of Circle : "+circle.perimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.length = 7;
        rectangle.width = 8;
        System.out.println("Area of Rectangle : "+ rectangle.area());
        System.out.println("Perimeter of Rectangle : "+rectangle.perimeter());

        Triangle triangle = new Triangle();
        triangle.base = 10;
        triangle.height = 20;
        System.out.println("Area of Triangle : "+ triangle.area());
    }
}
