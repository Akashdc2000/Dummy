package com.oops.class_object;

public class Person {


    // Data Members...
    Integer id;

    String name;

    String address;

    Integer age;

    String  contact;


    // Member Functions or Methods or Behaviour

    public void tellMeAboutYourDetails() {
        System.out.println( "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                '}');
    }

    public Person(Integer id, String name, String address, Integer age, String contact) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                '}';
    }
}
