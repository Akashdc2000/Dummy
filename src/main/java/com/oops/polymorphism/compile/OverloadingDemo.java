package com.oops.polymorphism.compile;

public class OverloadingDemo {

    public static void main(String[] args) {

        System.out.println("Main Method");
        System.out.println("Addition : " + add(10));
        System.out.println("Addition : " + add(10,20));
        System.out.println("Addition : " + add(10,20,30));
        System.out.println("Addition : " + add(10,10.5F));
        System.out.println("Addition : " + add(10.5F,10.5F));


        // we can overload static methods but not override the static methods...




    }

    public static int add(int a) {
        return a;
    }

    public static int add(int a, int b) {
        return a+b;
    }
    public static Object add(int a, int b, int c) {
        return  a+b+c;
    }

    public static float add(float a, float b) {
        return a+b;
    }

    public static float add(int a, float b) {
        return a+b;
    }

}
