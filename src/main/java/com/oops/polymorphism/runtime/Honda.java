package com.oops.polymorphism.runtime;

class Bike {
    int speedLimit = 100;

    protected void show() {
        System.out.println("Bike Show()");
    }
}
class Honda extends Bike {
    int speedLimit = 200;

    // The access level of the overriding method must be the same as or less restrictive than the overridden method.
    public void show() {
        System.out.println("Honda show()");
    }

    public static void main(String[] args) {
        Bike obj = new Honda();
        System.out.println(obj.speedLimit);
        obj.show();
    }
}
