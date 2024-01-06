package com.oops.polymorphism.runtime;

public class Circle implements Area, Perimeter{

    Float radius;
    final Float PI = 3.14F;

    @Override
    public Object area() {
        return PI*radius*radius;
    }

    @Override
    public Object perimeter() {
        return 2*PI*radius;
    }
}
