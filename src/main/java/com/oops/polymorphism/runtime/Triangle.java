package com.oops.polymorphism.runtime;

public class Triangle implements Area{

    Integer base;

    Integer height;

    @Override
    public Object area() {
        return 0.5 * base * height;
    }

}
