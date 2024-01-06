package com.oops.inheritance;

public class BankEmployee extends Bank {
    public String empId;

    public String empName;

    public Integer salary;

    public void bankEmployeeDetails() {
        System.out.println("------------------------------------");

        System.out.println("Bank Employee Details");
        System.out.println("Bank Employee Name : " + this.empName);
        System.out.println("Bank Employee ID : " + this.empId);
        System.out.println("Bank Employee Salary : " + this.salary);
    }
}
