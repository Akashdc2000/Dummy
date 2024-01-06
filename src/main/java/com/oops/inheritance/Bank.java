package com.oops.inheritance;

// Parent Class
public class Bank {

    public String name;

    public Integer branchCode;

    public String ifscCode;

    public Bank() {
    }

    public Bank(String name, Integer branchCode, String ifscCode) {
        this.name = name;
        this.branchCode = branchCode;
        this.ifscCode = ifscCode;
    }

    public void bankDetails() {
        System.out.println("------------------------------------");

        System.out.println("Bank Details");
        System.out.println("Bank Name : " + this.name);
        System.out.println("Bank Code : " + this.branchCode);
        System.out.println("Bank IFSC-Code : " + this.ifscCode);
    }
}
