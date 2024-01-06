package com.oops.polymorphism.runtime;

public class Rectangle implements Area, Perimeter{

    Integer length;

    Integer width;

    @Override
    public Object area() {
        return length*width;
    }

    @Override
    public Object perimeter() {
        return 2*(length+width);
    }
}
