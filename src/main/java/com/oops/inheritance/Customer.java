package com.oops.inheritance;

public class Customer extends Bank {
    public String customerName;
    public String accountNumber;
    public String contactNumber;


    public void customerDetails() {
        System.out.println("------------------------------------");

        System.out.println("Customer Details");
        System.out.println("Customer Name : " + this.customerName);
        System.out.println("Customer Account No : " + this.accountNumber);
        System.out.println("Customer Contact No : " + this.contactNumber);

    }
}
