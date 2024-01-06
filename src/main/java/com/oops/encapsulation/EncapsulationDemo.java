package com.oops.encapsulation;

public class EncapsulationDemo {

    public static void main(String[] args) {
        System.out.println("Encapsulation Demo");
        Person p1 = new Person();
        Person p2 = new Person();
        try {

            p1.setId(101);
            p1.setName("Akash");
            p1.setContact("9076799448");
            p1.setAge(87);
            p1.setAddress("Beed");

            p2.setId(102);
            p2.setName("Ajay");
            p2.setContact("1234567654");
            p2.setAge(89);
            p2.setAddress("Latur");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(p1);
            System.out.println(p2);
        }
    }
}
