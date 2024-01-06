package com.oops.encapsulation;

public class Person {

    private Integer id;

    private String name;

    private String address;

    private Integer age;

    private String  contact;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name == null || name.length() <= 2) {
            throw new IllegalArgumentException("Name must contains at least 3 letter");
        }
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age<18) {
            throw new IllegalArgumentException("Age Must be 18 or 18+");
        }
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
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
