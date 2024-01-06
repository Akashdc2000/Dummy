package com.oops.inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {
        System.out.println("Inheritance Demo");

        Customer customer = new Customer();

        customer.name = "SBI";
        customer.ifscCode = "SBIN0009066";
        customer.branchCode = 9066;

        customer.customerName = "Akash";
        customer.accountNumber = "12345678901";
        customer.contactNumber = "1234567890";

        customer.bankDetails();
        customer.customerDetails();

        BankEmployee bankEmployee = new BankEmployee();

        bankEmployee.name = "SBI";
        bankEmployee.ifscCode = "SBIN0009066";
        bankEmployee.branchCode = 9066;


        bankEmployee.empId = "E01";
        bankEmployee.empName = "Rajesh Tiwari";
        bankEmployee.salary = 50000;

        bankEmployee.bankDetails();
        bankEmployee.bankEmployeeDetails();
    }
}
