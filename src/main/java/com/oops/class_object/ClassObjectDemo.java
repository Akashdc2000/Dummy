package com.oops.class_object;

public class ClassObjectDemo {

    public static void main(String[] args) {
        System.out.println("Class-Object Demo");


        // Class - Person
        // Objects - ram, raj, jay etc..

        Person ram = new Person(101,"Ram", "Beed",23,"9999999999");

        Person raj = new Person(101,"Raj", "Pune",30,"89898988987");

        Person jay = new Person(101,"Jay", "Mumbai",22,"8888888888");

        ram.tellMeAboutYourDetails();
        raj.tellMeAboutYourDetails();
        jay.tellMeAboutYourDetails();

    }
}
